package java23.jdbc;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.mysql.jdbc.PreparedStatement;

public class DaoAuth implements IAuth {
    
    private java.sql.Connection conn = null;
    
    public DaoAuth(Connection conn) {
        this.conn = conn;
    }
    
    @Override
    public int getCount(ModelAuth auth) throws SQLException {
        int result = -1;
        try {
            // SQL문장
            String query = "select count(*) as total from auth ";
            
            // 문장 객체 생성
            java.sql.PreparedStatement stmt = conn.prepareStatement(query);
            
            // SQL 문장 실행
            ResultSet rs = stmt.executeQuery();
            
            rs.next();
            
            result = rs.getInt("total");
        } catch (SQLException e) {
            e.printStackTrace();
        }
        
        return result;
    }
    
    @Override
    public int getMaxAuthid() throws SQLException {
        int result = -1;
        
        try {
            
            // SQL 문장
            String query = "select max(authid) as authid from auth";
            
            // 문장 객체 생성
            java.sql.PreparedStatement stmt = conn.prepareStatement(query);
            
            // 문장 객체 실행 : executeQuery() or executeUpdate()
            ResultSet rs = stmt.executeQuery();
            
            // 커서를 첫번째 로우로 이동
            rs.first();
            result = rs.getInt("authid");
            
        } catch (SQLException e) {
            e.printStackTrace();
        }
        
        return result;
    }
    
    @Override
    public ResultSet selectAll() throws SQLException {
        
        ResultSet rs = null;
        
        // SQL 문장 실행
        String query = " select * from auth order by authid asc ";
        
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
    public ResultSet selectLike(ModelAuth auth) throws SQLException {
        ResultSet rs = null;
        
        try {
            // SQL문장
            String query = "select * from auth where name like ? ";
            
            // 문장 객체 생성
            java.sql.PreparedStatement stmt = conn.prepareStatement(query);
            stmt.setString(1, "%" + auth.getName() + "%"); // 쿼리문 첫번째 "?"에 괄호안의 쿼리를 넣는다.
            
            // SQL 문장 실행
            rs = stmt.executeQuery();
            
        } catch (SQLException e) {
            e.printStackTrace();
        }
        
        return rs;
    }
    
    @Override
    public ResultSet selectEqual(ModelAuth auth) throws SQLException {
        ResultSet rs = null;
        try {
            
            // SQL 문장 생성
            String query = "SELECT * FROM auth where name = ? ";
            
            // 문장 객체 생성
            java.sql.PreparedStatement stmt = conn.prepareStatement(query);
            stmt.setString(1, auth.getName());
            
            // SQL 문장 실행
            rs = stmt.executeQuery();
            
        } catch (SQLException e) {
            e.printStackTrace();
        }
        
        return rs;
    }
    
    @Override
    public ResultSet selectDynamic(ModelAuth auth) throws SQLException {
        ResultSet result = null;
        
        try {
            // SQL문장
            String query = " select * from auth \n ";
            query += " where 1 = 1 \n ";
            if (auth.getAuthid() != null) {
                query += " and authid = ? \n ";
            }
            if (!auth.getName().isEmpty()) {
                query += " and name = ? \n ";
            }
            if (!auth.getBirth().isEmpty()){
            	query += " and birth = ? \n ";
            }
            
            // 문장 객체 생성
            java.sql.PreparedStatement stmt = conn.prepareStatement(query);
            int c = 1;
            if (auth.getAuthid() != null) {
                stmt.setInt(c++, auth.getAuthid());
            }
            if (!auth.getName().isEmpty()) {
                stmt.setString(c++, auth.getName());
            }
            if (!auth.getBirth().isEmpty()) {
                stmt.setString(c++, auth.getBirth());
            }
            
            // SQL 문장 실행
            result = stmt.executeQuery();
            
        } catch (SQLException e) {
            e.printStackTrace();
        }
        
        return result;
    }
    
    @Override
    public int insertAuth(ModelAuth auth) throws SQLException {
        int rs = 0;
        
        try {
            // SQL문장
            String query = " insert into ";
            query += " auth( authid, name, birth ) ";
            query += " values( ?, ?, ? ) ";
            
            // 문장 객체 생성
            java.sql.PreparedStatement stmt = conn.prepareStatement(query);
            
            stmt.setInt(1, auth.getAuthid());
            stmt.setString(2, auth.getName());
            stmt.setString(3, auth.getBirth());
            
            // SQL 문장 실행
            rs = stmt.executeUpdate();
            
        } catch (SQLException e) {
            e.printStackTrace();
        }
        
        return rs;
    }
    
    @Override
    public int updateAuth(ModelAuth whereauth, ModelAuth setauth)
            throws SQLException {
        
        int rs = 0;
        
        try {
            // SQL문장
            String query = " update auth \n ";
            query += " set birth = ? \n ";
            query += " where 1 = 1 \n ";
            query += " and authid = ? \n ";
            
            // 문장 객체 생성
            java.sql.PreparedStatement stmt = conn.prepareStatement(query);
            stmt.setString(1, setauth.getBirth());
            stmt.setInt(2, whereauth.getAuthid());
            
            // SQL 문장 실행
            rs = stmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        
        return rs;
    }
    
    @Override
    public int deleteAuth(ModelAuth auth) throws SQLException {
        
        int rs = 0;
        
        try {
            // SQL문장
            String query = " delete from auth \n ";
            query += " where 1 = 1 \n ";
            query += " and name = ? \n ";
            query += " and birth = ? \n ";
            
            // 문장 객체 생성
            java.sql.PreparedStatement stmt = conn.prepareStatement(query);
            stmt.setString(1, auth.getName());
            stmt.setString(2, auth.getBirth());
            
            // SQL 문장 실행
            rs = stmt.executeUpdate();
            
        } catch (SQLException e) {
            e.printStackTrace();
        }
        
        return rs;
    }
    
}
