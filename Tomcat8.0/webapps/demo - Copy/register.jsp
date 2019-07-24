
   	<%! String title = "Register"; %>
   		<%@ include file="header1.jsp" %>
   		<%=message%>
   		<%=errors%>
   	<div>
    	<br/>
          <h1>Register page</h1>
   </div>
   <div>
<h4 style="color:#ff0000;"><?php echo $error; ?> </h4>

<form method="post" action="./Register" >
	<table border="0" cellpadding="10" style="margin-left:auto; margin-right:auto;background-color:#fafad2;">
	<tr>
		<td><strong>Login ID</strong></td>
		<td><input type="text" name="user_id"  size="12"></td>
	</tr>
	<tr>
		<td><strong>Password</strong></td>
		<td><input type="password" name="passwd"  /></td>
	</tr>
	<tr>
		<td><strong>Confirm Password</strong></td>
		<td><input type="password" name="conf_passwd"/></td>
	</tr>

     <tr>
		<td><strong>First Name</strong></td>
		<td><input type="text" name="FirstName"  /></td>
	</tr>
	<tr>
		<td><strong>Last Name</strong></td>
		<td><input type="text" name="LastName"  /></td>
	</tr>

	
	<tr>
		<td><strong>Email Address</strong></td>
		<td><input type="text" name="email_address"/></td>
	</tr>

	   <tr>
    	<td><strong>Enable</strong></td>
    	<td>
    		<select name="enable">
			  <option >TRUE</option>
			  <option >FALSE</option>
           </select>
    	</td>
    </tr>

    <tr>
    	<td><strong>User Type</strong></td>
    	<td>
    		<select name="selelct">
			  <option >s</option>
			  <option >f</option>
           </select>
    	</td>
    </tr>
    <tr>
    	<td><strong>Program</strong></td>
    	<td>
    		<select name="selelct">
			  <option >s</option>
			  <option >f</option>
           </select>
    	</td>
    </tr>

	</table>
	<table border="0" cellspacing="15" style="margin-left:auto; margin-right:auto;" >
<tr>
	<td><input type="submit" value = "Register" /></td>
	<td><input type="reset" value = "Clear" /></td>
</tr>
</table>
</form>
</div>
    <br />
    <%@ include file="footer.jsp" %>
