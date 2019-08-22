package com;
import java.sql.*;
public class Book {
	    private long bookId;
	    private String title;
	    private String type;
	    private Author author;
	    private Long authorId;
	    public Book(long bookId,String title,String type,Long aid,Author a) {
	    	this.bookId = bookId;
	    	this.title = title;
	    	this.type = type;
	    	this.author = a;
	    	this.authorId = aid;
	    }
		public long getbookId() {
			return bookId;
		}
		public void setbookId(long id) {
			this.bookId = id;
		}
		public String getTitle() {
			return title;
		}
		public void setTitle(String title) {
			this.title = title;
		}
		public void setType(String type) {
			this.type = type;
		}
		public String getType() {
			return type;
		}
		public void setAuthor(Author a) {
			this.author = a;
		}
		public Author getAuthor() {
			return author;
		}
		//sample
}
