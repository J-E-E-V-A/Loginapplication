package com.login;

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
 * Servlet implementation class Login
 */
@WebServlet("/Login")
public class Login extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Login() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html");
		Logindetails emp = new Logindetails();
		CRUD uuid=new CRUD();
		
		String uniqueCode=uuid.getUniqueCode();
		String empId=request.getParameter("empid");
		PrintWriter wt=response.getWriter();
//		wt.println("The details are inserted Successfully");
		wt.println(uniqueCode);
		wt.println(empId);
		if(uniqueCode.length()!=0 && empId.length()!=0) {
			//wt.println("if statement");
			emp.setUniqcode(uniqueCode);
			emp.setEmpid(empId);
			CRUD crud=new CRUD();
			if(crud.isUser(empId)) {
				
				boolean status=crud.InsertLogindetails(emp);
				if(status) {
					wt.println("The details are inserted Successfully");
					wt.println("<a href='Logout?uniquecode="+uniqueCode+"'>logout</a>");
					RequestDispatcher dispatcher=request.getRequestDispatcher("logout.jsp");
					dispatcher.include(request, response);
					System.out.println("Inserted");
				}else {
					System.out.println("not inserted");
				}
			}else {
				RequestDispatcher dispatcher=request.getRequestDispatcher("signup.jsp");
				dispatcher.include(request, response);
			}
		}else {
			System.out.println("user name or password should not be null");
		}
	}
	}


