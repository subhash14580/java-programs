import java.util.*;
import java.sql.*;
import java.sql.DriverManager;
public class jdbc2problem2{
	public static void main(String args[]) throws Exception{
		try{
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection con = DriverManager.getConnection
					("jdbc:oracle:thin:@localhost:1521:xe","system","subhash");
			Statement st = con.createStatement();
		       ResultSet rs1 = st.executeQuery("select * from EMP1 where ID > 123");
		       while(rs1.next()){
                System.out.println(rs1.getInt(1)+" "+rs1.getString(2)+" "+rs1.getString(3)+" "+rs1.getInt(4));
		       }

		}catch(Exception e){
			System.out.println(e);
		}
	}
}
