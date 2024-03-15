package com.basic.java;

public class Book {
     private String author;//required, author is immutable
     private String title ;//required, title is immutable
     private float price; // not mandatory ,mutable
     private STATUS status;// required , mutable
   
	public STATUS getStatus() {
		return status;
	}

	public void setStatus(STATUS status) {
		this.status = status;
	}

	public String getAuthor() {
		return author;
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}

	public Book(String author,String title) {// custom constructor
    	  this.author =author;
    	  this.title=title;
      }
}
