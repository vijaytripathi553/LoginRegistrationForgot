package com.gtl.project;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class MailSend extends HttpServlet{
	static Mailer mailer = new Mailer();
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
	{
		String Email=request.getParameter("email");
		System.out.println(Email);
		
		int check = checkEmail(Email);
		/*
		 * if(check == true) { System.out.println("Email verified"); } else {
		 * System.out.println("not verified"); }
		 */
			request.getRequestDispatcher("welcome.jsp").forward(request, response);
			System.out.println("reg successfully");
			HttpSession session = request.getSession();
		    session.setAttribute("email", Email);
		
	}
		
		public static int checkEmail(String email) {
			Customer c=new Customer();
			CustomerDao cd=new CustomerDaoImpl();
			
			Connection conn = null;
			PreparedStatement ps = null;
			ResultSet rs = null;
			try {
				conn = MyConnectionProvider.getCon();
				ps = conn.prepareStatement("select * from LogReg  where Email=?");
				ps.setString(1, email);
				rs = ps.executeQuery();
				if(rs.next()) {
					rs.getString(5);
					//return true;
				}
			}catch(Exception e) {
				e.printStackTrace();
			}finally {
				try {
					 mailer.send("Your Email","Your Email Password",email,"link","Dear "+rs.getString(2)+","+"\n"+"Your password for username"+ " ,"+rs.getString(1)+" is :"+rs.getString(5));
					rs.close();
					ps.close();
					conn.close();
				}catch(SQLException e){
					e.printStackTrace();
				}
			}
		return 0;
		}
		//return 0;
		
		
	}


