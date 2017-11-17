package java23.jdbc;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.mysql.jdbc.PreparedStatement;

public class DaoBook implements IBook {
    
    private java.sql.Connection conn = null;
    
    public DaoBook(Connection conn) {
        this.conn = conn;
    }
    
    @Override
    public int getCount(ModelBook book) {
        int result = -1;
        
        // SQL문장
        String query = "select count(*) as total from book";
        
        try {
            // 문장 객체 생성
            java.sql.PreparedStatement stmt = conn.prepareStatement(query);
            
            // SQL 문장 실행
            ResultSet rs = stmt.executeQuery();
            
            rs.next(); // 커서 이동. ResultSet 첫번째 로우로
            result = rs.getInt("total"); // 또는 rs.getInt(0); total 컬럼의 값을 가져온다.
            
        } catch (SQLException e) {
            e.printStackTrace();
        }
        
        return result;
    }
    
    @Override
    public int getMaxBookid() {
        int result = -1;
        
        // SQL 문장
        String query = "select max(bookid) maxid from book";
        
        try {
            // 문장 객체 생성
            java.sql.PreparedStatement stmt = conn.prepareStatement(query);
            
            // SQL 문장 실행
            ResultSet rs = stmt.executeQuery();
            
            rs.next(); // 커서이동. ResultSet 첫번째 로우로
            result = rs.getInt("maxid"); // maxid 컬럼의 값을 가져온다.
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return result;
    }
    
    @Override
    public ResultSet selectAll() {
        ResultSet rs = null;
        
        // SQL 문장 실행
        String query = "select * from book order by bookid asc";
        
        try {
            // 문장 객체 생성
            java.sql.PreparedStatement stmt = conn.prepareStatement(query);
            
            // SQL 문장 실행
            rs = stmt.executeQuery();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return rs;
    }
    
    @Override
    public ResultSet selectLike(ModelBook book) {
        
        ResultSet rs = null;
        
        try {
            String query = "select * from book where bookname like ? ";
            
            java.sql.PreparedStatement stmt = conn.prepareStatement(query);
            stmt.setString(1, "%" + book.getBookname() + "%"); // 쿼리문 첫번째 "?"에 괄호안의 쿼리를 넣는다.
            
            rs = stmt.executeQuery();
            
        } catch (SQLException e) {
            e.printStackTrace();
        }
        
        return rs;
    }
    
    @Override
    public ResultSet selectEqual(ModelBook book) {
        ResultSet rs = null;
        try {
            
            // SQL 문장 생성
            String query = "SELECT * FROM book where bookname = ? ";
            
            // 문장 객체 생성
            java.sql.PreparedStatement stmt = conn.prepareStatement(query);
            stmt.setString(1, book.getBookname());
            
            // SQL 문장 실행
            rs = stmt.executeQuery();
            
        } catch (SQLException e) {
            e.printStackTrace();
        }
        
        return rs;
    }
    
    @Override
    public int insertBook(ModelBook book) {
        int rs = 0;
        
        try {
            String query = " INSERT INTO ";
            query += " BOOK( BOOKNAME, PUBLISHER, YEAR, PRICE, DTM, USE_YN, AUTHID) ";
            query += " VALUES( ?, ?, ?, ?, ?, ?, ? ) ";
            // String, int, date, boolean 4개중 하나
            
            java.sql.PreparedStatement stmt = conn.prepareStatement(query);
            
            stmt.setString(1, book.getBookname());
            stmt.setString(2, book.getPublisher());
            stmt.setString(3, book.getYear());
            stmt.setInt(4, book.getPrice());
            stmt.setDate(5, (java.sql.Date) book.getDtm());
            stmt.setBoolean(6, book.getUse_yn());
            stmt.setInt(7, book.getAuthid());
            
            rs = stmt.executeUpdate(); // 변경된 레코드 개수
        } catch (SQLException e) {
            e.printStackTrace();
        }
        
        return rs;
    }
    
    @Override
    public int updateBook(ModelBook wherebook, ModelBook setbook) {
        int rs = 0;
        try {
            // SQL 문장 생성
            // ---- update절, set절, where절을 따로하면 어디서 오류인지 알기쉽다.
            String query = "UPDATE book \n";
            query += " SET year = ?, price = ? \n";
            query += " WHERE bookname = ? \n";
            
            // 문장 객체 생성
            java.sql.PreparedStatement stmt = conn.prepareStatement(query);
            stmt.setString(1, setbook.getYear());
            stmt.setInt(2, setbook.getPrice());
            stmt.setString(3, wherebook.getBookname());
            
            // SQL 문장 실행
            rs = stmt.executeUpdate();
            
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return rs;
    }
    
    @Override
    public int deleteBook(ModelBook book) {
        int rs = 0;
        
        try {
            
            // SQL 문장 생성
            String query = "delete from book where bookname = ? ";
            
            // 문장 객체 생성
            java.sql.PreparedStatement stmt = conn.prepareStatement(query);
            stmt.setString(1, book.getBookname());
            
            // SQL 문장 실행
            rs = stmt.executeUpdate();
            
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return rs;
    }
    
    @Override
    public ResultSet selectDynamic(ModelBook book) {
        ResultSet result = null;
        
        try {
            
            // query 작성
            String query = " select * from book \n";
            query += " where 1 = 1 \n";
            if (book.getBookid() != null) {
                query += " and bookid = ? \n";
            }
            if (!book.getBookname().isEmpty()) {
                query += " and bookname = ? \n";
            }
            
            // 문장 객체 생성
            java.sql.PreparedStatement stmt = conn.prepareStatement(query);
            int c = 1;
            if (book.getBookid() != null) {
                stmt.setInt(c++, book.getBookid());
            }
            if (!book.getBookname().isEmpty()) {
                stmt.setString(c++, book.getBookname());
            }
            
            // query 실행
            result = stmt.executeQuery();
            
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return result;
    }
    
}
