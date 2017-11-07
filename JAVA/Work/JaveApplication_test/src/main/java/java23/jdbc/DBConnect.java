package java23.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnect {
    
    public static Connection connectionMySQL() {
        
        String url = "jdbc:mysql://localhost:3306/book_db";
        String user = "root";
        String password = "1234";
        java.sql.Connection conn = null;
        
        try {
            Class.forName("com.mysql.jdbc.Driver"); // driver 적재
            conn = java.sql.DriverManager.getConnection(url, user, password); // DB 연결
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (java.sql.SQLException e) {
            e.printStackTrace();
        }
        
        return conn;
    }
    
    public static java.sql.Connection makeConnection() {
        return connectionMySQL(); // Mysql과 연결할때
    }
}
