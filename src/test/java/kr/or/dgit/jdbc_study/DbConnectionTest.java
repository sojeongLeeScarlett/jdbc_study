package kr.or.dgit.jdbc_study;



import static org.junit.Assert.fail;

import java.sql.Connection;

import org.junit.After;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;


import kr.or.dgit.erp_application.jdbc.DBcon;

public class DbConnectionTest {
	private static DBcon dbCon;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		dbCon = DBcon.getInstance();
	}

	@After
	public void tearDown() throws Exception {
		dbCon.connectionClose();
	}

	@Test
	public void test() {
		//Connection con  = dbCon.getConnection();
		Assert.assertNotNull(dbCon);
	}

}
