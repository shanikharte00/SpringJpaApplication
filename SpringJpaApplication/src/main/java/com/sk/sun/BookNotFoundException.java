package com.sk.sun;

public class BookNotFoundException extends Exception{
		
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private long book_id;
	public BookNotFoundException(long book_id) {
		super(String.format("Book is not found with id :'%s'",book_id));
	}
}
