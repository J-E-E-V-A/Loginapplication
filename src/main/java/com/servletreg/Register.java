package com.servletreg;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.lgo.CRUD;

/**
 * Servlet implementation class Register
 */
@WebServlet("/Register")
public class Register extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Register() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html");
		String empid = request.getParameter("empid");
		String username = request.getParameter("username");
		PrintWriter wt=response.getWriter();
		wt.println(empid);
		wt.println(username);
		CRUD crud=new CRUD();
//		PrintWriter wt=response.getWriter();
		if(crud.register(empid, username)) {
			wt.println("Registered successfully");
			RequestDispatcher dispatcher=request.getRequestDispatcher("front.jsp");
			dispatcher.include(request,response);
		}else {
			wt.println("Sorry not registered try again");
			RequestDispatcher dispatcher=request.getRequestDispatcher("signup.html");
			dispatcher.include(request,response);
		}
	 
	}

}
