package com.jeffrey.pattern.singleton;

/**
 * 
 * @author weij
 * @author lament
 */
public class Client {
	public static void main(String[] args) {
		MysqlConnection my1=DatabaseConnection.getMysqlConnection();
		MysqlConnection my2=DatabaseConnection.getMysqlConnection();
		System.out.println(my1==my2);
		
		MysqlConnection myc1 = new MysqlConnection();
		MysqlConnection myc2 = new MysqlConnection();
		System.out.println(myc1==myc2); 
		
		SingleTon st1 = SingleTon.getInstance();
		SingleTon st2 = SingleTon.getInstance();
		System.out.println(st1 == st2);
		
		
	}
}
