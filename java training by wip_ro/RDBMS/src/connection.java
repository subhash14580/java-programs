import java.util.*;
import java.sql.*;
import java.sql.DriverManager;
public class connection {
	public static void main(String args[]) throws Exception{
		try{
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection con = DriverManager.getConnection
					("jdbc:oracle:thin:@localhost:1521:xe","system","subhash");
			Statement st = con.createStatement();
		       ResultSet rs = st.executeQuery("select * from EMP1");
		       while(rs.next()){
                System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getString(3)+" "+rs.getInt(4));
		       }

		}catch(Exception e){
			System.out.println(e);
		}
	}
}
