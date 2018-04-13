package com.service;

import java.util.ArrayList;

import com.bean.Book;
import com.dao.BookDao;

public class BookService {

	public ArrayList<Book> view() {
		BookDao bd= new BookDao();
		return bd.view();
	}

	public ArrayList<Book> search(String name) {
		BookDao bd= new BookDao();
		return bd.search(name);	
	}

	public int delete(int id) {
		BookDao bd= new BookDao();
		return bd.delete(id);	
	}

}
