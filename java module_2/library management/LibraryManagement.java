package com;
import java.util.ArrayList;
import java.sql.*;
public class LibraryManagement {
		public boolean addBook(Book book) throws BookAlreadyExistsException{
			databaseUtil du = new databaseUtil();
			Connection con = du.getConnection();
			try {
				Statement st = con.createStatement();
				ResultSet rs = st.executeQuery("select bookid from Books");
				byte flag = 0;
				while(rs.next()) {
					if(book.getbookId() == rs.getLong(1)) {
						flag = 1;
						break;
					}
				}
				Author a = book.getAuthor();
				if(flag == 1)  throw new BookAlreadyExistsException();
				else {
					rs =  st.executeQuery("select authorId from Author where authorId = "+a.getAuthorId());
				   if(rs.next()) {
					   PreparedStatement ps=con.prepareStatement("insert into Books values(?,?,?,?)");  
						ps.setLong(1,book.getbookId());
						ps.setString(2,book.getTitle());
						ps.setString(3, book.getType());
						ps.setLong(4, a.getAuthorId());
						ps.executeUpdate();
						return true;
				   }
				   else {
					   PreparedStatement pstmt=con.prepareStatement("insert into author values(?,?)");  
						pstmt.setLong(1,a.getAuthorId());
						pstmt.setString(2,a.getAuthorName());
						pstmt.executeUpdate();
						
						pstmt=con.prepareStatement("insert into book values(?,?,?,?)");  
						pstmt.setLong(1,book.getbookId());
						pstmt.setString(2,book.getTitle());
						pstmt.setString(3, book.getType());
						pstmt.setLong(4, a.getAuthorId());
						pstmt.executeUpdate();
						con.close();
				   }
				}
			}catch(SQLException e) {}
			return false;
		}
		public boolean removeBook(long authorId) throws AuthorDoesNotExistsException{
			databaseUtil du = new databaseUtil();
			Connection con = du.getConnection();
			try {
				Statement st = con.createStatement();
				ResultSet rs = st.executeQuery("select authorId from Books");
				byte flag = 0;
				while(rs.next()) {
					if(rs.getLong(1) == authorId) {
						flag = 1;
						break;
					}
				}
				if(flag == 0) {
					throw new AuthorDoesNotExistsException();
				}
				else {
					int status = st.executeUpdate("delete  from Books where authorId= " + authorId);
					int status1 = st.executeUpdate("delete  from Author where authorId = "+authorId);
					if(status == 1) {
						            System.out.println("deleted from books");
					if(status1 == 1) System.out.println("deleted from author");
						st.close();
						con.close();
						return true;
					}
					return false;
				}
				//st.close();
		}catch(Exception e) {}	
		 	return false;
		}
		
		public ArrayList<Library> getBooks(String city,String name){
			ArrayList<Library> lib = new ArrayList<Library>();
			databaseUtil du = new databaseUtil();
			Connection con = du.getConnection();
			try {
				//System.out.println("@@@@@@@@@@@@@");
				PreparedStatement ps = con.prepareStatement(" select * from  Library where city = ?"
						+ "and authorId in(select authorId from Author where name like '%e2%')");
				ps.setString(1, city);
				//ps.setString(2, "%"+name+"%");
				ResultSet rs = ps.executeQuery();
				Library lb;
				while(rs.next()) {
					lb = new Library(rs.getLong(1),rs.getString(2),rs.getString(3));
					lib.add(lb);
					//System.out.println("@@@@@@@@@@@@@"+rs.getLong(1));
				}
				byte flag = 0;
		}catch(Exception e) {}
			return lib;
		}
}
