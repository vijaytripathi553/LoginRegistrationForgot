<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<html>
<head>
<title>Login Form</title>
<link rel="stylesheet" href="loginreg.css">
<script src="loginreg.js"></script>
</head>
<body>
	<div class="container">
		<div class="form_container">
			<div class="button_group">
				<div id="btn"></div>
				<button type="button" class="toggle_btn" onclick="login()">LOG
					IN</button>
				<button type="button" class="toggle_btn" onclick="register()">REGISTER</button>
			</div>
			<div class="media_icons">

				<img src="Images/google.png"> <img src="Images/fb.png">
				<img src="Images/linkedin.png">
			</div>

			<form id="login" action="LoginRegister" method="post"
				class="form_group">
				<h3>${message}</h3>
				<h2>${Successmessage}</h2>
				<h4>${message2}</h4>
				<input type="email" name="uid"
					pattern="[a-z0-9._%+-]+@[a-z0-9.-]+\.[a-z]{2,}$"
					title="enter email id as UserId" class="input_area"
					placeholder="Username" required autofocus /> <input
					type="password" name="password1"
					pattern="(?=.*\d)(?=.*[a-z])(?=.*[A-Z]).{4,}"
					title="Must contain at least one number and one uppercase and lowercase letter, and at least 4 or more characters"
					required class="input_area" placeholder="Password" /> <br> <br>
				<br>

				<button type="submit" name="submit" value="Login" class="sub_btn">LOG
					IN</button>
				<br> <b><font size="20px"><a
						style="color: blue; font-size: 14px;" class="left"
						class="toggle_btn" onclick="register()"><u>New
								Registration...!!</u></a></font></b> <b><font size="20px"><a
						href="forgot.jsp" style="color: red; font-size: 14px;"
						class="right" class="toggle_btn" onclick="register()"><u>Forgot
								Password</u></a></font></b>
			</form>


			<form id="register" action="LoginRegister" method="post"
				class="form_group">
				<input type="email" class="input_area" name="uid"
					placeholder="Enter User_Id (Email)"
					pattern="[a-z0-9._%+-]+@[a-z0-9.-]+\.[a-z]{2,}$"
					title="enter email id as UserId" required /> 
					<input
					type="text" class="input_area" name="fname"
					Pattern.matches("[a-zA-Z]" placeholder=" Enter First_Name" required />
				<input type="text" class="input_area" name="lname"
					placeholder="Enter Last_Name" required /> <input type="text"
					class="input_area" name="email"
					pattern="[a-z0-9._%+-]+@[a-z0-9.-]+\.[a-z]{2,}$"
					placeholder="Enter Email" required /> <input type="password"
					name="password1" pattern="(?=.*\d)(?=.*[a-z])(?=.*[A-Z]).{4,}"
					title="Must contain at least one number and one uppercase and lowercase letter, and at least 4 or more characters"
					class="input_area" placeholder="Enter Password" required /> <input
					type="password" name="password2" class="input_area"
					name="password1" placeholder="Re-enter your password"
					pattern="(?=.*\d)(?=.*[a-z])(?=.*[A-Z]).{4,}"
					title="Must contain at least one number and one uppercase and lowercase letter, and at least 4 or more characters"
					required /> <br> <br>

				<button type="submit" name="submit" value="Register" class="sub_btn">REGISTER</button>
			</form>


		</div>
		<script src="loginreg.js"></script>

	</div>
</body>

</html>