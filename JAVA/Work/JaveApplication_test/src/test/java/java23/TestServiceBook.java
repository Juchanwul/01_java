package java23;

import static org.junit.Assert.*;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.junit.BeforeClass;
import org.junit.Test;

import java23.jdbc.DaoBook;
import java23.jdbc.ModelBook;
import java23.jdbc.ServiceBook;

public class TestServiceBook {
    
    private static ServiceBook svr = null;
    
    @BeforeClass
    public static void setUpBeforeClass() throws Exception {
        svr = new ServiceBook();
        
    }
    
    @Test
    public void testGetCount() throws SQLException {
        ModelBook model = new ModelBook();
        int result = svr.getCount(model);
        assertEquals(4, result);
    }
    
    @Test
    public void testGetMaxBookid() throws SQLException {
        int result = svr.getMaxBookid();
        assertEquals(4, result);
    }
    
    @Test
    public void testSelectAll() throws SQLException {
        ResultSet rs = svr.selectAll();
        
        rs.next();
        
        int bookid = rs.getInt("bookid");
        assertEquals(1, bookid);
        
        String bookname = rs.getString("bookname");
        assertEquals("operating system", bookname);
    }
    
    @Test
    public void testSelectLike() throws SQLException {
        ModelBook book = new ModelBook();
        book.setBookname("ja");
        java.sql.ResultSet rs = svr.selectLike(book);
        
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
        
        ModelBook book = new ModelBook();
        book.setBookname("mysql");
        
        java.sql.ResultSet rs = svr.selectEqual(book);
        
        // 인스턴스 검증
        assertNotNull(rs);
        
        // 값을 이용하여 검증
        rs.next(); // 커서가 첫번째 로우로 이동
        String name = rs.getString("bookname");
        assertEquals("mysql", name);
        assertEquals(book.getBookname(), name);
    }
    
    @Test
    public void testSelectDynamic() throws SQLException {
        ModelBook book = new ModelBook();
        java.sql.ResultSet rs = svr.selectDynamic(book);
        
        //첫번째 검증    select * from book where 1 = 1;
        //               select count(*) from book where 1 = 1;
        book.setBookid(null);
        book.setBookname("");
        rs = svr.selectDynamic(book);
        
        assertNotNull(rs);
        
        //두번째 검증    select * from book where 1 = 1 and bookid = 1;
        book.setBookid(1);
        book.setBookname("");
        rs = svr.selectDynamic(book);
        
        assertNotNull(rs);
        
        rs.next();
        int bookid = rs.getInt("bookid");
        String bookname = rs.getString("bookname");
        
        assertEquals(1, bookid);
        assertEquals("operating system", bookname);
        
        //세번째 검증    select * from book where 1 = 1 and bookname = 'java';
        book.setBookid(null);
        book.setBookname("java");
        rs = svr.selectDynamic(book);
        
        assertNotNull(rs);
        
        rs.next();
        bookid = rs.getInt("bookid");
        bookname = rs.getString("bookname");
        
        assertEquals(3, bookid);
        assertEquals("java", bookname);
        
        //네번째 검증    select * from book where 1 = 1 and bookid = 2 and bookname = 'mysql';
        book.setBookid(2);
        book.setBookname("mysql");
        
        rs = svr.selectDynamic(book);
        
        rs.next();
        bookid = rs.getInt("bookid");
        bookname = rs.getString("bookname");
        
        assertEquals(2, bookid);
        assertEquals("mysql", bookname);
        
    }
    
    @Test
    public void testInsertBook() throws SQLException {
        
        java.sql.Date date2 = java.sql.Date.valueOf("2017-11-08");
        
        ModelBook book = new ModelBook();
        book.setBookname("test");
        book.setPublisher("abc");
        book.setYear("2017");
        book.setPrice(20000);
        book.setDtm(date2);
        book.setUse_yn(true);
        book.setAuthid(3);
        
        int result = svr.insertBook(book);
        
        // insert 여부 검증
        // 1이 리턴되는 경우 : insert 성공
        // 0이 리턴되는 경우 : insert 실패
        // -1이 리턴되는 경우 : excption으로인한 insert 실패
        assertEquals(1, result);
        assertTrue(result >= 1);
    }
    
    @Test
    public void testUpdateBook() throws SQLException {
        ModelBook wherebook = new ModelBook();
        wherebook.setBookname("test"); // 얘를 찾아서 바꿔라
        
        ModelBook setbook = new ModelBook();
        setbook.setPrice(15000);
        setbook.setYear("2016");
        
        int result = svr.updateBook(wherebook, setbook);
        
        // 검증코드
        // 1 이상의 값이 리턴되는 경우 : 성공
        // 0 값이 리턴되는 경우 : 성공(where절에서 찾았지만 update할게없는경우)
        assertTrue(result >= 0);
    }
    
    @Test
    public void testDeleteBook() throws SQLException {
        
        ModelBook book = new ModelBook();
        book.setBookname("test");
        
       
        int result = svr.deleteBook(book);
        
        // 검증 코드
        // 1 이상의 값이 리턴되는 경우 : 성공
        // 0 값이 리턴되는 경우 : 성공(where절에서 찾았지만 update할게없는경우)
        assertTrue(result >= 0);
        
        /////////////////////////////////////////////////
        
        book.setBookname("test2");
        result = svr.deleteBook(book);
        
        assertTrue(result >= 0);
    }
    
    @Test
    public void testTransConnmit() {
    }
    
    @Test
    public void testTransRollback() {
    }
    
}
