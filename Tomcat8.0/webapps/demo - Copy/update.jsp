
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
    <br />
    <%@ include file="footer.jsp" %>
