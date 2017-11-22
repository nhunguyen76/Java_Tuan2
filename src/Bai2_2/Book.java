package Bai2_2;

public class Book {
	private String name;
	private Author[] authors;
	private double price;
	private int qty = 0;
	
	public Book(String name, Author[] authors, double price) {
		this.name = name;
		this.authors = authors;
		this.price = price;
	}
	
	public Book(String name, Author[] authors, double price, int qty) {
		this.name = name;
		this.authors = authors;
		this.price = price;
		this.qty = qty;
	}
	
	public String getName() {
		return name;	}
	
	
	public Author[] getAuthors() {
		return authors;
	}
	
	public double getPrice() {
		return price;
	}
	
	public void setPrice(double price) {
		this.price = price;
	}
	
	public int getQty() {
		return qty;
	}
	
	public void setQty(int qty) {
		this.qty = qty;
	}
	
	public String toString() {
		String s="";
		for(int i=0;i<authors.length-1;i++) {
			s=s+authors[i].toString()+",";
		}
		s+=authors[authors.length-1];
		return "Book[name="+this.name+",authors={"+s+"},price="+this.price+",qty="+this.qty+"]";
	}
	
}
