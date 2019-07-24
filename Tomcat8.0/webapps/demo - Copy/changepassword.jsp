
   	<%! String title = "Login"; %>
    <%@ include file="./header1.jsp" %>
    <%=message%>
    <%=errors%>
    <div>

    	<br/>
    	<%
 				   if(aStudent== null)//user is not logged in/session expired
 				  {
 					 session.setAttribute("message", "Please login to update your user"); 
 					 response.sendRedirect("./login.jsp");
           session.removeAttribute("aUser");//remove the object stored at login
           session.removeAttribute("student");
          //session.invalidate();
 				  } else  %>
       <div>
       	<div>
            <h3><%= message %></h3>
        </div>
       	  <form action = "./ChangePassword" method = "POST">
         <table border="0" cellpadding="10" style="margin-left:auto; margin-right:auto;background-color:#fafad2;">
			<tr>
				<td><strong>Login ID</strong></td>
				<td><label name="login"> </label>
			</tr>
			<tr>
				<td><strong>old-Password</strong></td>
				<td><input type="password" name="pass" /></td>
			</tr>
			<tr>
				<td><strong>new-Password</strong></td>
				<td><input type="password" name="newpass" /></td>
			</tr>
			<tr>
				<td><strong>confirm-new-Password</strong></td>
				<td><input type="password" name="passconfirm" /></td>
			</tr>
			</table>
			<table border="0" cellpadding="10" style="margin-left:auto; margin-right:auto;background-color:#fafad2;" >
			<tr>
				<button type="update"  value="update" >Update password</button></td>	
			</tr>
			</table>
		 </form>
       </div>
         <br />
     </div>
    <%@ include file="footer.jsp" %>
