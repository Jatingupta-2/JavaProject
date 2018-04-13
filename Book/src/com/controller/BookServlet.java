package com.controller;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.bean.Book;
import com.service.BookService;



/**
 * Servlet implementation class BookServlet
 */
@WebServlet("/BookServlet")
public class BookServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public BookServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request, response);

	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		if(request.getParameter("view")!=null){
			ArrayList<Book> arrt= new ArrayList<>();
			BookService bs= new BookService();
			arrt=bs.view();
			request.setAttribute("array", arrt);
			RequestDispatcher rd= request.getRequestDispatcher("search.jsp");
			rd.forward(request, response);
		
		}
		
		if(request.getParameter("search")!=null){
			ArrayList<Book> arrt= new ArrayList<>();
			BookService bs= new BookService();
			String name=request.getParameter("search");
			arrt=bs.search(name);
			request.setAttribute("array", arrt);
			RequestDispatcher rd= request.getRequestDispatcher("search.jsp");
			rd.include(request, response);
		
		}
		
		if(request.getParameter("id")!=null){
			
			BookService bs= new BookService();
			int id=Integer.parseInt(request.getParameter("id"));
			
			int i=bs.delete(id);
			if(i>0){
				request.setAttribute("message", "Sucessfully Deleted");
				
			}
			else{
				request.setAttribute("message", "Not Deleted");
			}
			RequestDispatcher rd= request.getRequestDispatcher("deletesuccess.jsp");
			rd.include(request, response);
		
		}
		
	}

}
