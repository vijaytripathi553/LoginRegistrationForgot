package com.gtl.project;

public interface CustomerDao {
	public int insertCustomer(Customer c);
	public Customer getCustomer(String User_Id,String First_Name,String Last_Name,String Email,String Password,String Conform_Password);
	 public Customer forgot(String User_Id);
	

}
