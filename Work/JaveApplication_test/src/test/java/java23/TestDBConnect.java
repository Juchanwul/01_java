package java23;

import static org.junit.Assert.*;

import org.junit.BeforeClass;
import org.junit.Test;

import java23.jdbc.DBConnect;

public class TestDBConnect {
    
    @BeforeClass
    public static void setUpBeforeClass() throws Exception {
        
    }
    
    @Test
    public void test_connectionMySQL() throws Exception {
        java.sql.Connection conn = DBConnect.connectionMySQL();
        
        if (conn != null) {
            assertTrue("db connect success", true);
        } else {
            assertTrue("db connect fail", false);
        }
    }
    
    @Test
    public void test_makeConnection() throws Exception {
        
        java.sql.Connection conn = DBConnect.makeConnection();
        
        if (conn != null) {
            assertTrue("db connect success", true);
        } else {
            assertTrue("db connect fail", false);
        }
        
    }
    
}
