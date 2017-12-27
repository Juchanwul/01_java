package java23;

import static org.junit.Assert.*;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.junit.BeforeClass;
import org.junit.Test;
import java23.jdbc.ModelAuth;
import java23.jdbc.ServiceAuth;

public class TestServiceAuth {

	private static ServiceAuth svr = null;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		svr = new ServiceAuth();
	}

	@Test
	public void testGetCount() throws SQLException {
		ModelAuth model = new ModelAuth();
		int result = svr.getCount(model);
		assertEquals(3, result);
	}

	@Test
	public void testGetMaxAuthid() throws SQLException {
		int rs = svr.getMaxAuthid();
		assertEquals(7, rs);
	}

	@Test
	public void testSelectAll() throws SQLException {
		ResultSet rs = null;
		rs = svr.selectAll();

		assertNotNull(rs);

		rs.first();
		int authid = rs.getInt("authid"); // ==1
		assertEquals(1, authid);
	}

	@Test
	public void testSelectLike() throws SQLException {
		ModelAuth model = new ModelAuth();
		model.setName("bo");
		ResultSet rs = svr.selectLike(model);
		assertNotNull(rs);

		rs.next();
		String name = rs.getString("name");
		assertTrue(name.contains("bo"));
		assertTrue(name.contains(model.getName()));

	}

	@Test
	public void testSelectEqual() throws SQLException {

		ModelAuth model = new ModelAuth();
		model.setName("park");

		ResultSet rs = svr.selectEqual(model);

		assertNotNull(rs);

		rs.next();
		String name = rs.getString("name");
		assertEquals("park", name);
		assertEquals(model.getName(), name);
	}

	@Test
	public void testSelectDynamic() throws SQLException {
		ModelAuth auth = new ModelAuth();
		ResultSet rs = svr.selectDynamic(auth);

		// 첫번째 검증 select * from auth where 1 = 1;
		// select count(*) from auth where 1 = 1;
		auth.setAuthid(null);
		auth.setName("");
		rs = svr.selectDynamic(auth);

		assertNotNull(rs);

		// 두번째 검증 select * from auth where 1 = 1 and authid = 1;
		auth.setAuthid(1);
		auth.setName("");
		rs = svr.selectDynamic(auth);

		assertNotNull(rs);

		rs.next();
		int authid = rs.getInt("authid");
		String name = rs.getString("name");
		assertEquals(1, authid);
		assertEquals("bob", name);

		// 세번째 검증 select * from auth where 1 = 1 and authname = 'bob';
		auth.setAuthid(null);
		auth.setName("bob");

		rs = svr.selectDynamic(auth);

		rs.next();
		authid = rs.getInt("authid");
		name = rs.getString("name");
		assertEquals(1, authid);
		assertEquals("bob", name);

		// 네번째 검증 select * from auth where 1 = 1 and authid = 2 and authname =
		// 'bob';
		auth.setAuthid(2);
		auth.setName("kim");

		rs = svr.selectDynamic(auth);

		rs.next();
		authid = rs.getInt("authid");
		name = rs.getString("name");
		assertEquals(2, authid);
		assertEquals("kim", name);
		
		// 다섯번째 검증. select * from auth where 1 = 1 and birth = '2000.05.01'
		auth.setAuthid(null);
		auth.setName("");
		auth.setBirth("2000.05.01");
		
		rs = svr.selectDynamic(auth);
		rs.next();
		authid = rs.getInt("authid");
		name = rs.getString("name");
		String birth = rs.getString("birth");
		assertEquals(7, authid);
		assertEquals("park", name);
		assertEquals("2000.05.01", birth);
		

	}

	@Test
	public void testInsertAuth() throws SQLException {
		int rs = -1;

		ModelAuth auth = new ModelAuth();
		auth.setAuthid(3);
		auth.setName("Ju");
		auth.setBirth("2017-11-15");

		rs = svr.insertAuth(auth);

		assertNotEquals(-1, rs);
		assertTrue(rs >= 1);

	}

	@Test
	public void testUpdateAuth() throws SQLException {
		int rs = -1;
		ModelAuth whereauth = new ModelAuth();
		whereauth.setAuthid(3);

		ModelAuth setauth = new ModelAuth();
		setauth.setBirth("1999-12-31");

		rs = svr.updateAuth(whereauth, setauth);

		assertTrue(rs >= 0);

	}

	@Test
	public void testDeleteAuth() throws SQLException {
		int rs = -1;
		ModelAuth auth = new ModelAuth();
		auth.setName("Ju");
		auth.setBirth("1999-12-31");

		rs = svr.deleteAuth(auth);

		assertTrue(rs >= 0);

	}
}
