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
            result = rs.getInt("total"); // total 컬럼의 값을 가져온다.
            
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
        String query = "select * form book order by bookid asc";
        
        try{
            // 문장 객체 생성
            java.sql.PreparedStatement stmt = conn.prepareStatement(query);
            
            //SQL 문장 실행
            rs = stmt.executeQuery();
        }catch (SQLException e) {
            e.printStackTrace();
        }
        return rs;
    }
    
    @Override
    public ResultSet selectLike(ModelBook book) {
        
        ResultSet rs = null;
        
        try{
            // SQL 문장 생성
            String query = "select * from book where bookname like "
                    
            // 문장 객체 생성
            java.sql.PreparedStatement stmt = conn.prepareStatement(query);
            stmt.setString(1, "%"+book.getBookname()+"%");
            
            // SQL 문장 실행
            rs = stmt.executeQuery();
        }catch (SQLException e) {
            e.printStackTrace();
        }
        return rs;
    }
    
    @Override
    public ResultSet selectEqual(ModelBook book) {
        return null;
    }
    
    @Override
    public ResultSet selectDynamic(ModelBook book) {
        return null;
    }
    
    @Override
    public int insertBook(ModelBook book) {
        return 0;
    }
    
    @Override
    public int updateBook(ModelBook wherebook, ModelBook setbook) {
        return 0;
    }
    
    @Override
    public int deleteBook(ModelBook book) {
        return 0;
    }
    
}
