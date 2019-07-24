
   	<%! String title = "Login"; %>
    <%@ include file="./header1.jsp" %>
    <%=message%>
    <%=errors%>
    <div>

    	<br/>
       <div>
       	  <form action = "./Login" method = "POST">
         <table border="0" cellpadding="10" style="margin-left:auto; margin-right:auto;background-color:#fafad2;">
			<tr>
				<td><strong>Login ID</strong></td>
				<td><input type="text" name="login"  size="12" /></td>
			</tr>
			<tr>
				<td><strong>Password</strong></td>
				<td><input type="password" name="pass" /></td>
			</tr>
			</table>
			<table border="0" cellspacing="15" style="margin-left:auto; margin-right:auto;" >
			<tr>
				<td><input type="submit" value = "Log In" /></td>
				
				<td><input type="reset" value = "Reset" /></td>
			</tr>
			</table>
		 </form>
       </div>
         <br />
     </div>
    <%@ include file="footer.jsp" %>
