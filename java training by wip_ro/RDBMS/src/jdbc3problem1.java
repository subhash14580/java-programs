import java.sql.*;
import java.util.*;
class jdbc3problem1{
    public static void main(String args[]) throws Exception{
       Connection conn;
       Statement st;
       ResultSet rs;
       Class.forName("oracle.jdbc.driver.OracleDriver");
       conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","subhash");
       if(args[0].equals("1")){
        st = conn.createStatement();
        rs = st.executeQuery("insert into jdbcCalls values("+args[1]+" "+args[2]+" "+args[3]+" "+args[4]+")");

       }
       else if(args[0].equals("2")){

       }
       else if(args[0].equals("3")){

       }
       else if(args[0].equals("4") && (!args[1].equals(""))){

       }
       else if(args[0].equals("4") && (args[1].equals(""))){

       }




    };

};
