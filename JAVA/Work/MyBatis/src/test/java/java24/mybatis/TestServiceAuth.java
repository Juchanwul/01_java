package java24.mybatis;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java24.mybatis.inf.IServiceAuth;
import java24.mybatis.model.ModelAuth;
import java24.mybatis.svr.ServiceAuth;

public class TestServiceAuth {
    private static IServiceAuth service = null;

    @BeforeClass
    public static void setUpBeforeClass() throws Exception {
        ApplicationContext context = new ClassPathXmlApplicationContext("classpath:ApplicationContext.xml");

        service = context.getBean("serviceauth", ServiceAuth.class);
        
    }

    @Test
    public void testGetCount() throws Exception {
        ModelAuth auth = new ModelAuth();
        int rs = service.getCount(auth);
        assertEquals(3, rs);
    }

    @Test
    public void testGetMaxAuthid() throws Exception {
        int rs = service.getMaxAuthid();
        assertEquals(7, rs);
    }

    @Test
    public void testSelectAll() throws Exception {
        ModelAuth auth = new ModelAuth();
        List<ModelAuth> rs = service.selectAll();
        assertNotNull(rs);

        auth = rs.get(0);
        assertSame(1, auth.getAuthid());
        assertEquals("bob", auth.getName());
        
        int count = service.getCount(null);
        assertEquals(count, rs.size());
    }

    @Test
    public void testSelectLike() throws Exception {
        ModelAuth auth = new ModelAuth();
        List<ModelAuth> rs = service.selectLike(auth);

        assertNotNull(rs);

        auth = rs.get(1);
        assertTrue(2==auth.getAuthid());
        assertEquals("kim", auth.getName());
        
        int count = service.getCount(null);
        assertEquals(count, rs.size());
    }

    @Test
    public void testSelectEqual() throws Exception {
        ModelAuth auth = new ModelAuth();
        List<ModelAuth> rs = service.selectEqual(auth);
        
        assertNotNull(rs);
        
        auth = rs.get(2);
        assertSame(7, auth.getAuthid());
        assertEquals("park", auth.getName());
        
        int count = service.getCount(null);
        assertEquals(count, rs.size());
    }

    @Test
    public void testInsertAuth() throws Exception {
        ModelAuth auth = new ModelAuth();
        int rs = service.insertAuth(auth);
        assertEquals(8, rs);
    }

    @Test
    public void testUpdateAuth() throws Exception {
        ModelAuth whereauth = new ModelAuth();
        whereauth.setAuthid(8);
        
        ModelAuth setauth = new ModelAuth();
        setauth.setBirth("2012");
        setauth.setName("abc");
        
        int rs = service.updateAuth(whereauth, setauth);
        
        assertTrue(rs>=0);
    }

    @Test
    public void testDeleteAuth() throws Exception {
        ModelAuth auth = new ModelAuth();
        auth.setAuthid(8);
        auth.setName("abc");
        int rs = service.deleteAuth(auth);
        assertTrue(rs>=0);
    }

}
