package com.gtl.project;

public class Customer {
	// User_Id | First_Name | Last_Name | Email| Password | Conform_Password
	private String User_Id;
	private String First_Name;
	private String Last_Name;
	private String Email;
	private String Password;
	private String Confirm_Password;
	public String getUser_Id() {
		return User_Id;
	}
	public void setUser_Id(String user_Id) {
		User_Id = user_Id;
	}
	public String getFirst_Name() {
		return First_Name;
	}
	public void setFirst_Name(String first_Name) {
		First_Name = first_Name;
	}
	public String getLast_Name() {
		return Last_Name;
	}
	public void setLast_Name(String last_Name) {
		Last_Name = last_Name;
	}
	public String getEmail() {
		return Email;
	}
	public void setEmail(String email) {
		Email = email;
	}
	public String getPassword() {
		return Password;
	}
	public void setPassword(String password) {
		Password = password;
	}
	public String getConfirm_Password() {
		return Confirm_Password;
	}
	public void setConfirm_Password(String confirm_Password) {
		Confirm_Password = confirm_Password;
	}
	@Override
	public String toString() {
		return "Customer [User_Id=" + User_Id + ", First_Name=" + First_Name + ", Last_Name=" + Last_Name + ", Email="
				+ Email + ", Password=" + Password + ", Confirm_Password=" + Confirm_Password + "]";
	}
	
	
}
