
   	<%! String title = "Update"; %>
   		<%@ include file="header1.jsp" %>
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
          <h1>update page</h1>
   </div>
    <div>
<h4 style="color:#ff0000;"><?php echo $error; ?> </h4>

<form method="post" action="./Update" >
  <table border="0" cellpadding="10" style="margin-left:auto; margin-right:auto;background-color:#fafad2;">
  <tr>
    <td><strong>Login ID</strong></td>
    <td><input type="text" name="user_id" value="<%=id%>"  size="12"></td>
  </tr>
  
     <tr>
    <td><strong>First Name</strong></td>
    <td><input type="text" name="FirstName" value="<%=firstname%>" /></td>
  </tr>
  <tr>
    <td><strong>Last Name</strong></td>
    <td><input type="text" name="LastName" value="<%=lastname%>" /></td>
  </tr>

  
  <tr>
    <td><strong>Email Address</strong></td>
    <td><input type="text" name="email_address" value="<%=email%>" /></td>
  </tr>

     <tr>
      <td><strong>Enable</strong></td>
      <td>
        <select name="enable">
        <option >TRUE</option>
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
      <tr>
    <td><strong>ProgramCode</strong></td>
    <td><input type="text" name="ProgramCode"  value="<%=programCode%>" size="6" ></td>
  </tr>
    </tr>
      <tr>
      <tr>
    <td><strong>ProgramName</strong></td>
    <td><input type="text" name="ProgramName" value="<%=programName%>"  size="30"></td>
  </tr>
    </tr>
     
      <tr>
      <td><strong>Programyear</strong></td>
      <td>
        <select name="Programyear">
        <option >1</option>
        <option >2</option>
        <option >3</option>
           </select>
      </td>
    </tr>

  </table>
  <table border="0" cellspacing="15" style="margin-left:auto; margin-right:auto;" >
<tr>
  <td><input type="submit" value = "UPDATE" /></td>
  <td><input type="reset" value = "Clear" /></td>
</tr>
</table>
</form>
</div>
    <br />
    <%@ include file="footer.jsp" %>
