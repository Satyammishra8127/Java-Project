package com.basic.java;

public class BMSApplication {

	public static void main(String[] args) {
		Book book;//reference or variable
		Book book1=new Book("learn java","Ram");// reference + object logical mistake
		
		book1.setPrice(100.66F);
		book1.setStatus(STATUS.AVAILABLE);
		System.out.println(book1.getAuthor());
		
		new Book("Ramesh","learn python");// only object is created
		Book book2 = book1;// no object
		//book1.author="Satyam";// bad code because author immutable
		System.out.println(book1.hashCode());
		System.out.println(book2.hashCode());
		System.out.println(book1 == book2);// reference is  equality check
        // Book1.Author="Ram";	// bad code
		

	}

}
