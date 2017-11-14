package java23;

import static org.junit.Assert.*;

import java.sql.ResultSet;
import java.sql.SQLException;

import javax.jws.WebParam.Mode;

import org.junit.BeforeClass;
import org.junit.Test;

import com.mysql.jdbc.PreparedStatement;

import java23.jdbc.DBConnect;
import java23.jdbc.DaoBook;
import java23.jdbc.ModelBook;

public class TestDaoBook {
    
    static java.sql.Connection conn = null;
    
    @BeforeClass
    public static void setUpBeforeClass() throws Exception {
        conn = DBConnect.makeConnection();
    }
    
    @Test
    public void testGetCount() throws SQLException {
        DaoBook dao = new DaoBook(conn);
        ModelBook model = new ModelBook();
        int result = dao.getCount(model);
        assertEquals(4, result);
    }
    
    @Test
    public void testGetMaxBookid() {
        DaoBook dao = new DaoBook(conn);
        int result = dao.getMaxBookid();
        assertEquals(4, result);
    }
    
    @Test
    public void testSelectAll() throws SQLException {
        DaoBook dao = new DaoBook(conn);
        ResultSet rs = dao.selectAll();
        
        rs.next();
        
        int bookid = rs.getInt("bookid");
        assertEquals(1, bookid);
        
        String bookname = rs.getString("bookname");
        assertEquals("operating system", bookname);
    }
    
    @Test
    public void testSelectLike() throws SQLException {
        DaoBook dao = new DaoBook(conn);
        ModelBook book = new ModelBook();
        book.setBookname("ja");
        java.sql.ResultSet rs = dao.selectLike(book);
        
        // rs.getRow(); resultset의 커서가 가르키는 위치
        
        // ResultSet 을 이용한 검증
        assertNotNull(rs);
        
        // 값을 이용한 검증
        rs.next(); // 커서를 다음 행으로 이동
        String name = rs.getString("bookname"); // java
        assertTrue(name.contains("ja"));
        assertTrue(name.contains(book.getBookname()));
    }
    
    @Test
    public void testSelectEqual() throws SQLException {
        DaoBook dao = new DaoBook(conn);
        ModelBook book = new ModelBook();
        book.setBookname("mysql");
        
        java.sql.ResultSet rs = dao.selectEqual(book);
        
        // 인스턴스 검증
        assertNotNull(rs);
        
        // 값을 이용하여 검증
        rs.next(); // 커서가 첫번째 로우로 이동
        String name = rs.getString("bookname");
        assertEquals("mysql", name);
        assertEquals(book.getBookname(), name);
    }
    
    @Test
    public void testInsertBook() {
        java.util.Date date1 = new java.util.Date(117, 10, 8);
        java.sql.Date date2 = java.sql.Date.valueOf("2017-11-08");
        
        ModelBook book = new ModelBook();
        book.setBookname("test");
        book.setPublisher("abc");
        book.setYear("2017");
        book.setPrice(20000);
        book.setDtm(date2);
        book.setUse_yn(true);
        book.setAuthid(3);
        
        DaoBook dao = new DaoBook(conn);
        int result = dao.insertBook(book);
        
        // insert 여부 검증
        // 1이 리턴되는 경우 : insert 성공
        // 0이 리턴되는 경우 : insert 실패
        // -1이 리턴되는 경우 : excption으로인한 insert 실패
        assertEquals(1, result);
        assertTrue(result >= 1);
        
    }
    
    @Test
    public void testUpdateBook() {
        ModelBook wherebook = new ModelBook();
        wherebook.setBookname("test"); // 얘를 찾아서 바꿔라
        
        ModelBook setbook = new ModelBook();
        setbook.setPrice(15000);
        setbook.setYear("2016");
        
        DaoBook dao = new DaoBook(conn);
        int result = dao.updateBook(wherebook, setbook);
        
        // 검증코드
        // 1 이상의 값이 리턴되는 경우 : 성공
        // 0 값이 리턴되는 경우 : 성공(where절에서 찾았지만 update할게없는경우)
        assertTrue(result >= 0);
        
    }
    
    @Test
    public void testDeleteBook() {
        ModelBook book = new ModelBook();
        book.setBookname("test");
        
        DaoBook dao = new DaoBook(conn);
        int result = dao.deleteBook(book);
        
        // 검증 코드
        // 1 이상의 값이 리턴되는 경우 : 성공
        // 0 값이 리턴되는 경우 : 성공(where절에서 찾았지만 update할게없는경우)
        assertTrue(result >= 0);
        
        /////////////////////////////////////////////////
        
        book.setBookname("test2");
        result = dao.deleteBook(book);
        
        assertTrue(result >= 0);
        
    }
    
    @Test
    public void testSelectDynamic() throws SQLException {
        
        ModelBook book = new ModelBook();
        DaoBook dao = new DaoBook(conn);
        java.sql.ResultSet rs = dao.selectDynamic(book);
        
        // 개수로 검증
        rs.last(); // 커서의 위치를 마지막 row로 이동
        int rows = rs.getRow(); // 현재 커서의 index번호를 가져온다.
        
        assertEquals(dao.getCount(book), rows);
        
        // 첫번째 검증. select * from book where 1 = 1;
        // select count(*) from book where 1 = 1;
        book.setBookid(null);
        book.setBookname("");
        rs = dao.selectDynamic(book);
        
        assertNotNull(rs); // 인스턴스 검증
        
        // 두번째 검증. select * from book where 1 = 1 and bookid = 1;
        book.setBookid(1);
        book.setBookname("");
        
        assertNotNull(rs); // 인스턴스 검증
        
        rs.next(); // 값으로 검증
        int bookid = rs.getInt("bookid");
        String bookname = rs.getString("bookname");
        
        assertEquals(1, bookid);
        assertSame(book.getBookid(), bookid);
        
        assertEquals("operating system", bookname);
        
        // 세번째 검증. select * from book where 1 = 1and bookname = 'java';
        book.setBookid(null);
        book.setBookname("java");
        rs = dao.selectDynamic(book);
        
        assertNotNull(rs); // 인스턴스 검증
        
        rs.next(); // 커서를 현재 row에서 다음 row로 이동
        rs.first(); // 첫번째 row로 이동
        bookid = rs.getInt("bookid");
        bookname = rs.getString("bookname");
        assertEquals(3, bookid);
        assertEquals("java",bookname);
        
        // 네번째 검증. select * from book where 1 = 1 and bookid = 2 and bookname = 'mysql';
        book.setBookid(2);
        book.setBookname("mysql");
        
        rs = dao.selectDynamic(book);
        
        assertNotNull(rs);
        
        rs.next();
        bookid = rs.getInt("bookid");
        bookname = rs.getString("bookname");
        
        assertEquals(2, bookid);
        assertEquals("mysql", bookname);
        
        
        
        
        // ResultSet 사용법
        // rs.next(); 커서를 현재 row에서 다음 row로 이동
        // rs.last(); 마지막 row로 이동
        // rs.first(); 첫번째 로우로 이동
        // rs.getrow("컬럼명"); 현재 커서의 index번호
        // rs.getInt("컬럼명");
        // rs.getString("컬럼명");
        // rs.getBoolean("컬럼명");
        // rs.getDate("컬럼명");
        
    }
}
