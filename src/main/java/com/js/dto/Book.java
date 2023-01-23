package com.js.dto;

public class Book {
	    private  int Book_id;
	    private   String Book_name;
	    private  String Author_name;
	    private int No_of_pages;
	    private  double Price;
		public int getBook_id() {
			return Book_id;
		}
		public void setBook_id(int book_id) {
			Book_id = book_id;
		}
		public String getBook_name() {
			return Book_name;
		}
		public void setBook_name(String book_name) {
			Book_name = book_name;
		}
		public String getAuthor_name() {
			return Author_name;
		}
		public void setAuthor_name(String author_name) {
			Author_name = author_name;
		}
		public int getNo_of_pages() {
			return No_of_pages;
		}
		public void setNo_of_pages(int no_of_pages) {
			No_of_pages = no_of_pages;
		}
		public double getPrice() {
			return Price;
		}
		public void setPrice(double price) {
			Price = price;
		}
		@Override
		public String toString() {
			return "Book [Book_id=" + Book_id + ", Book_name=" + Book_name + ", Author_name=" + Author_name
					+ ", No_of_pages=" + No_of_pages + ", Price=" + Price + "]";
		}
	    
}