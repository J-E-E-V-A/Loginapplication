package com.loginuser;

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
 * Servlet implementation class Logout
 */
@WebServlet("/Logout")
public class Logout extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Logout() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		PrintWriter pen=response.getWriter();
		String uniqueCode=request.getParameter("uniquecode");
		pen.println(uniqueCode);
		CRUD crud=new CRUD();
		if(crud.InsertLogoutdetails(uniqueCode)) {
			pen.println("Inserted out date out time");
			RequestDispatcher dispatcher=request.getRequestDispatcher("front.jsp");
			dispatcher.include(request, response);
		}
		else {
			pen.println("not updated");
		}
		
		
	}

}
