package com.loginuser;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Entrys
 */
@WebServlet("/Entrys")
public class Entrys extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Entrys() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		Loginentry al = new Loginentry();
		//String "intime";
		int Intime = Integer.parseInt(request.getParameter("intime"));
		String Indate=request.getParameter("indate");
		String Outtime=request.getParameter("outtime");
		String Outdate=request.getParameter("outdate");
		PrintWriter wt=response.getWriter();
//		wt.println("The details are inserted Successfully");
		wt.println(Intime);
		wt.println(Indate);
	}}