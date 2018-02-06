package kr.or.dgit.jdbc_study.dto;

import java.util.Properties;

import kr.or.dgit.erp_application.jdbc.DBcon;
import kr.or.dgit.erp_application.jdbc.LoadProperties;

public class TestMain {
	public static void main(String[] args) {
		TestDBconnection();
	}
	
	
	private static void TestDBconnection() {
		DBcon dbCon = DBcon.getInstance();
		System.out.println(dbCon);
		
		dbCon =  DBcon.getInstance();
		System.out.println(dbCon);
		
		LoadProperties lp = new LoadProperties();
		Properties pro = lp.getProperties();
		
		System.out.printf("user %s : password %s%n",
				pro.getProperty("user"),pro.getProperty("password"));
	}
}
