package java23.jdbc;

import java.sql.ResultSet;
import java.sql.SQLException;

public class ServiceBook implements IServiceBook {
    
    private java.sql.Connection conn = null;
    
    public ServiceBook() {
        super();
        this.conn = DBConnect.makeConnection();
    }
    
    @Override
    public int getCount(ModelBook book) throws SQLException {
        int rs = -1;
        
        try {
            conn.setAutoCommit(false);
            DaoBook dao = new DaoBook(conn);
            rs = dao.getCount(book);
            conn.commit();
            
        } catch (SQLException e) {
            e.printStackTrace();
            conn.rollback();
        }
        return rs;
    }
    
    @Override
    public int getMaxBookid() throws SQLException {
        
        int rs = -1;
        
        try {
            conn.setAutoCommit(false);
            DaoBook dao = new DaoBook(conn);
            rs = dao.getMaxBookid();
            conn.commit();
        } catch (SQLException e) {
            e.printStackTrace();
            conn.rollback();
        }
        return rs;
    }
    
    @Override
    public ResultSet selectAll() throws SQLException {
        
        ResultSet rs = null;
        
        try {
            conn.setAutoCommit(false);
            DaoBook dao = new DaoBook(conn);
            rs = dao.selectAll();
            conn.commit();
        } catch (SQLException e) {
            e.printStackTrace();
            conn.rollback();
        }
        
        return rs;
    }
    
    @Override
    public ResultSet selectLike(ModelBook book) throws SQLException {
        
        ResultSet rs = null;
        
        try {
            conn.setAutoCommit(false);
            DaoBook dao = new DaoBook(conn);
            rs = dao.selectLike(book);
            conn.commit();
        } catch (SQLException e) {
            e.printStackTrace();
            conn.rollback();
        }
        
        return rs;
        
    }
    
    @Override
    public ResultSet selectEqual(ModelBook book) throws SQLException {
        
        ResultSet rs = null;
        
        try {
            conn.setAutoCommit(false);
            DaoBook dao = new DaoBook(conn);
            rs = dao.selectEqual(book);
            conn.commit();
        } catch (SQLException e) {
            e.printStackTrace();
            conn.rollback();
        }
        
        return rs;
    }
    
    @Override
    public ResultSet selectDynamic(ModelBook book) throws SQLException {
        ResultSet rs = null;
        
        try {
            conn.setAutoCommit(false);
            DaoBook dao = new DaoBook(conn);
            rs = dao.selectDynamic(book);
            conn.commit();
        } catch (SQLException e) {
            e.printStackTrace();
            conn.rollback();
        }
        
        return rs;
    }
    
    @Override
    public int insertBook(ModelBook book) throws SQLException {
        int result = -1;
        try {
            conn.setAutoCommit(false);
            DaoBook dao = new DaoBook(conn);
            result = dao.insertBook(book);
            conn.commit();
        } catch (SQLException e) {
            e.printStackTrace();
            conn.rollback();
        }
        return result;
    }
    
    @Override
    public int updateBook(ModelBook wherebook, ModelBook setbook)
            throws SQLException {
        int result = -1;
        try {
            conn.setAutoCommit(false);
            DaoBook dao = new DaoBook(conn);
            result = dao.updateBook(wherebook, setbook);
            conn.commit();
        } catch (SQLException e) {
            e.printStackTrace();
            conn.rollback();
        }
        return result;
        
    }
    
    @Override
    public int deleteBook(ModelBook book) throws SQLException {
        int result = -1;
        try {
            conn.setAutoCommit(false);
            DaoBook dao = new DaoBook(conn);
            result = dao.deleteBook(book);
            conn.commit();
        } catch (SQLException e) {
            e.printStackTrace();
            conn.rollback();
        }
        return result;
    }
    
    @Override
    public int transConnmit(ModelBook auth, ModelBook book) throws SQLException {
        int result = -1;
        
        
        
        
        return 0;
    }
    
    @Override
    public int transRollback(ModelBook b1, ModelBook b2) {
        // TODO Auto-generated method stub
        return 0;
    }
    
}
