package com;
import java.util.*;
import java.sql.*;
public class TesterClass {
		public static void main(String args[]) {
			Connection con = null;
			try {
				
				databaseUtil db = new databaseUtil();
				con = db.getConnection();
				con.setAutoCommit(true);
				int status;
				String sql;
				Statement st = con.createStatement();
				 sql = "create table Author("
						+ "authorId number(10),"
						+ "name varchar2(10),"
						+ "primary key(authorId))";
				 /*
				 status = st.executeUpdate(sql);	
				 st.executeUpdate("insert into Author values(111,'shsphere')");
				 st.executeUpdate("insert into Author values(222,'shsphere1')");
				 st.executeUpdate("insert into Author values(333,'shsphere2')");
				
				 status = st.executeUpdate("create table Books(bookId number(10),"
											+ "title varchar2(10),"
											+ "type varchar2(10),"
											+ "primary key(bookid),"
											+ "authorId number(10),"
											+ "foreign key(authorId) references Author(authorId))"
											);
				 
			st.executeUpdate("insert into Books values(1,'wisdom','inspira',111)");
				 st.executeUpdate("insert into Books values(2,'success','poison',222)");
				 st.executeUpdate("insert into Books values(3,'expect','anger',222)");
		//removing the author from System
				*/
				 LibraryManagement lb = new LibraryManagement();
				 
				 try {
					 boolean remove = lb.removeBook(444);
					 if(remove) System.out.println("successfully removed");
					 else System.out.println("successfully not removed");
				 }catch(AuthorDoesNotExistsException a) {
					 System.out.println(a.getMessage());
				 }
				 /*
				 sql = "create table Library("
				 		+ "id number(10),"
				 		+ "city varchar2(10),"
				 		+ "authorId number(10),"
				 		+ "foreign key(authorId) references Author(authorId))";
				 st.executeUpdate(sql); 
				 System.out.println(st.executeUpdate(sql));
				 st.executeUpdate("insert into Library values(2,'bvrm',222)");
				 st.executeQuery("insert into Library values(1,'vizag',111)");
				 st.executeUpdate("insert into Library values(3,'vizag',333)");
				 */
				 ArrayList<Library> al = lb.getBooks("vizag","e2");
				 for(Library l:al) {
					 System.out.println(l.getlibraryName() +" "+ l.getlibraryId());
				 }
				 Author ar = new Author(333L,"shsphere2");
				 Book b = new Book(4L,"loss","patience",333L,ar);
				 try {
				 lb.addBook(b);
				 }catch(BookAlreadyExistsException e) {
					 System.out.println(e.getMessage());
				 }
				st.close();
				con.close();
			}catch(SQLException e) {
				e.printStackTrace();
			}
		}
		
}
