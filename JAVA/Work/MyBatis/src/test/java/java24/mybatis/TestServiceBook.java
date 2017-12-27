package java24.mybatis;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java24.mybatis.inf.IServiceBook;
import java24.mybatis.model.ModelBook;
import java24.mybatis.svr.ServiceBook;

public class TestServiceBook {
    private static IServiceBook service = null;

    @BeforeClass
    public static void setUpBeforeClass() throws Exception {

        // classpath 를 이용한 설정 파일 로딩
        ApplicationContext context = new ClassPathXmlApplicationContext("classpath:ApplicationContext.xml");

        // DI를 이용한 servicebook 인스턴스 생성
        service = context.getBean("servicebook", ServiceBook.class);
    }

    @Test
    public void testGetCount() throws Exception {
        ModelBook book = new ModelBook();
        int rs = service.getCount(book);
        assertEquals(4, rs);

    }

    @Test
    public void testGetMaxBookid() throws Exception {
        int rs = service.getMaxBookid();
        assertEquals(5, rs);
    }

    @Test
    public void testSelectAll() throws Exception {
        ModelBook book = new ModelBook();
        List<ModelBook> rs = service.selectAll(book);
        // 1.인스턴스 검증
        assertNotNull(rs);

        // 2. 값으로 검증
        ModelBook m = rs.get(0);
        assertSame(1, m.getBookid());

        assertEquals("operating system", m.getBookname());

        // 3. 갯수로 검증
        int count = service.getCount(null);
        assertEquals(count, rs.size());
    }

    @Test
    public void testSelectLike() throws Exception {
        ModelBook book = new ModelBook();
        List<ModelBook> rs = service.selectLike(book);

        // 1.인스턴스 검증
        assertNotNull(rs);

        // 2. 값으로 검증
        ModelBook m = rs.get(2);
        assertSame(3, m.getBookid());

        assertEquals("java", m.getBookname());

        // 3. 갯수로 검증
        int count = service.getCount(null);
        assertEquals(count, rs.size());
    }

    @Test
    public void testSelectEqual() throws Exception {
        ModelBook book = new ModelBook();
        List<ModelBook> rs = service.selectEqual(book);
        // 1.인스턴스 검증
        assertNotNull(rs);

        // 2. 값으로 검증
        ModelBook m = rs.get(1);
        assertSame(2, m.getBookid());

        assertEquals("mysql", m.getBookname());

        // 3. 갯수로 검증
        int count = service.getCount(null);
        assertEquals(count, rs.size());
    }

    @Test
    public void testInsertBook() throws Exception {
        ModelBook book = new ModelBook();
        int rs = service.insertBook(book);
        assertEquals(6, rs);
    }

    @Test
    public void testInsertMap() throws Exception {
        int rs = service.insertMap("abc", null, 0);
        assertEquals(10, rs);
    }

    @Test
    public void testUpdateBook() throws Exception {
        ModelBook wherebook = new ModelBook();
        wherebook.setBookid(6);
        
        ModelBook setbook = new ModelBook();
        setbook.setPrice(10000);
        setbook.setYear("2017");
        int rs = service.updateBook(wherebook, setbook);
        
        assertTrue(rs>=0);
    }

    @Test
    public void testDeleteBook() throws Exception {
        ModelBook book = new ModelBook();
        int rs = service.deleteBook(book);
        assertTrue(rs>=0);
        
    }

    @Test
    public void testSelectDynamic() {
        fail("Not yet implemented");
    }

}
