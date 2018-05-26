package com;
import java.sql.*;
public class databaseUtil {
		public Connection getConnection() {
			Connection con = null;
				try {
					Class.forName("oracle.jdbc.driver.OracleDriver");
					con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","subhash");			
					con.setAutoCommit(true);
				}
				catch(ClassNotFoundException e){
					System.out.println("class not found");
				}catch(SQLException e) {
					e.printStackTrace();
				}
				return con;
			}		
}
