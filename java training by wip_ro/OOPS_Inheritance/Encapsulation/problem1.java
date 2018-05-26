import java.util.*;
class Author{
	private String name,email;
	private char gender;
	public Author(String name,String email,char gender){
		this.name =name;
		this.email = email;
		this.gender = gender;
	}
	public String getName(){
		return name;
	}
  
 	public String getMail(){
 		return email;
 	}
 	public char getGender(){
 		return gender;
 	}
}
class Book{
	private String name;
	private double price;
	private int qtyInStock;
	//private Author author = new Author("heha","heha@gmail.com",'f');
	public Book(String name,double price,int qtyInStock){
		this.name = name;
		this.price = price;
		this.qtyInStock = qtyInStock;
	}
	public String getName(){
         return name;
	}
	public double getPrice(){
		return price;
	}
	/*
	public String  getAuthor(){
		return author.getName();
	}
	*/
  	 double getQtyInStock(){
		return qtyInStock;
	}
	public void setQtyInStock(int stock){
		this.qtyInStock = stock;
	}
	public void setPrice(double pr){
		this.price = pr;
	}
}
class problem1{
	public static void main(String args[]){
		Book b1 = new Book("computer proramming",255.5,4);
		Author author = new Author("heha","heha@gmail.com",'f');
		System.out.print(b1.getName()+" "+author.getName()+"  "+b1.getPrice()+" "+b1.getQtyInStock());
		System.out.println("\tgender ::" + author.getGender());
	}
}
