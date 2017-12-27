package springboard;

import static org.junit.Assert.*;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import javax.sql.DataSource;

import org.junit.BeforeClass;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.ui.Model;

import board.inf.IServiceUser;
import board.model.ModelUser;
import board.service.ServiceUser;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class TestServiceUser {
    private static IServiceUser service = null;
    
    Date from = new Date();
    String userid = "MISS A" + new SimpleDateFormat("yyyy-MM-dd");

    @BeforeClass
    public static void setUpBeforeClass() throws Exception {

        ApplicationContext context = new ClassPathXmlApplicationContext("classpath:ApplicationContext.xml");

        service = context.getBean("serviceuser", ServiceUser.class);
        
        javax.sql.DataSource dataSource = (DataSource) context.getBean("dataSource");
        org.apache.ibatis.jdbc.ScriptRunner runner = new org.apache.ibatis.jdbc.ScriptRunner(
                dataSource.getConnection());
        runner.setAutoCommit(true);
        runner.setStopOnError(true);
        ClassLoader cl = ClassLoader.getSystemClassLoader();
        String sf = cl.getResource("ddl/board.ddl.mysql.sql").getFile(); // ----src/main/ddl/소스
        java.io.Reader br = new java.io.BufferedReader(new java.io.FileReader(sf));
        runner.runScript(br);
        runner.closeConnection();

    }

    @Test
    public void test01_InsertUser() {
        ModelUser user = new ModelUser();
        user.setUserid("3");
        int rs = service.insertUser(user);
        assertTrue(rs >= 1);
    }

    @Test
    public void test02_Login() {
        ModelUser user = new ModelUser();
        user.setUserid("userid");
        user.setPasswd("password");
        
        ModelUser rs = service.login(user);
        
        assertNotNull(rs);

    }

    @Test
    public void test03_Logout() {
    }

    @Test
    public void test04_UpdateUserInfo() {
        ModelUser whereValue = new ModelUser();
        whereValue.setUserid("3");

        ModelUser setValue = new ModelUser();
        setValue.setName("abcd");
        setValue.setEmail("qqqq@wwww.com");
        int rs = service.updateUserInfo(whereValue, setValue);

        assertTrue(rs >= 0);
    }

    @Test
    public void test05_UpdatePasswd() {
        int rs = -1;
        ModelUser wherepw = new ModelUser();
        wherepw.setUserid("1");

        ModelUser setpw = new ModelUser();
        setpw.setPasswd("1234");

        rs = service.updatePasswd(wherepw, setpw);

        assertTrue(rs >= 0);

    }

    @Test
    public void test06_DeleteUser() {
        int rs = -1;
        ModelUser user = new ModelUser();
        user.setUserid("1");
        rs = service.deleteUser(user);
        
        assertTrue(rs>=0);
    }

    @Test
    public void test07_SelectUserOne() {
        ModelUser user = new ModelUser();        
        user.setUserno(1);
        ModelUser rs = service.selectUserOne(user);
        assertNotNull(rs);
        
        
    }

    @Test
    public void test08_SelectUserList() {
        ModelUser user = new ModelUser();
        List<ModelUser> rs = service.selectUserList(user);
        
        assertNotNull(rs);
    }

    @Test
    public void test09_Checkuserid() {
        int rs = -1;
        rs = service.checkuserid("1");
        
        assertTrue(rs>=0);
    }

}
