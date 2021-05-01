<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
 <html>
    <head>
        <title>Forgot Password</title>
        <link rel="stylesheet" href="loginreg.css"> 
        <script src="loginreg.js"></script>
       </head>
    <body>
        <div class="container">
            <div class="form_container">
                
                   
                 <h2 align="center" style="color:red;"><u>Reset Password</u></h2>
                  
                                 
                                 <div class="media_icons">
                                  
                                     <img src="Images/google.png">
                                     <img src="Images/fb.png">
                                     <img src="Images/linkedin.png">
                                 </div>

                                 <form id="login" action="ResetServlet" method="post" class="form_group">
                                     <input type="email" name="email" class="input_area" placeholder="Enter your emil" required autofocus/>
									  <input type="password" name="password1" class="input_area" placeholder="Enter New Password" pattern="(?=.*\d)(?=.*[a-z])(?=.*[A-Z]).{4,}" title="Must contain at least one number and one uppercase and lowercase letter, and at least 4 or more characters"  required autofocus/>
									   <input type="password" name="password2" class="input_area" placeholder="Re-enter your new password" pattern="(?=.*\d)(?=.*[a-z])(?=.*[A-Z]).{4,}" title="Must contain at least one number and one uppercase and lowercase letter, and at least 4 or more characters" required autofocus/>
                                  
                                     <br>
                                     <br>
                                     <br>

                                     <button type="submit" name="submit" value="Reset" class="sub_btn">Reset</button>
									 <br>
									
								

                                 </form>






            </div>
            <script src="loginreg.js"></script>

        </div>
    </body>

</html>