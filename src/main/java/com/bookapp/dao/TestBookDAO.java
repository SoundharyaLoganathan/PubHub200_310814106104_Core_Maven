package com.bookapp.dao;

import com.bookapp.model.Book;

public class TestBookDAO {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Book book = new Book();
		Book book1 = new Book();
		Book book2 = new Book();
		
		//book.setBookName("all collections");
		//book.setAuthor("paulo coehlo");
		//book.setPrice(455);
		
	//	book1.setId(2);
	//	book1.setPrice(676);
 
		//book2.setId(2);
		//book2.setBookName("half girl friend");
		
		BookDAO dao = new BookDAO();

		//dao.addBook(book);
		dao.update(book1);
		//dao.delete(book2);
		
		
		//book2.setBookName("3 mistakes");
	//	dao.findByName(book2);

	}
		
	}


