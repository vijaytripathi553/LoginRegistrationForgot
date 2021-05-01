package com.gtl.project;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


//@WebServlet("/LoginRegister")
public class LoginRegister extends HttpServlet {
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		CustomerDao cd=new CustomerDaoImpl();
		System.out.println("Hello");
		String User_Id=request.getParameter("uid");
		String First_Name=request.getParameter("fname");
		String Last_Name=request.getParameter("lname");
		String Email=request.getParameter("email");
		String Password=request.getParameter("password1");
		String Confirm_Password=request.getParameter("password2");
		String submitType=request.getParameter("submit");

		Customer c = cd.getCustomer(User_Id, First_Name, Last_Name, Email, Password, Confirm_Password);

		System.out.println(c.getEmail() + c.getPassword() + c.getUser_Id());////////

		if (submitType.equals("Login") && c != null && c.getEmail() != null && c.getPassword() != null) {

			System.out.println("in login");
			request.setAttribute("message", c.getEmail());
			RequestDispatcher rd = request.getRequestDispatcher("success.jsp");
			rd.forward(request, response);

		}

		else if (submitType.equals("Register")) {
			c.setUser_Id(User_Id);
			c.setFirst_Name(First_Name);
			c.setLast_Name(Last_Name);
			c.setEmail(Email);
			c.setPassword(Password);
			c.setConfirm_Password(Confirm_Password);
			cd.insertCustomer(c); // method calling
			System.out.println(cd.getCustomer(User_Id, First_Name, Last_Name, Email, Password, Confirm_Password));
			request.setAttribute("Successmessage", "Registration done please continue with login");
			request.getRequestDispatcher("login.jsp").forward(request, response);
			System.out.println("reg successfully");
		}else {
			request.setAttribute("message", "Data not found");
			RequestDispatcher rd = request.getRequestDispatcher("login.jsp");
			rd.forward(request, response);
		}
	}
}