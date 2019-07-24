
   	<%! String title = "Logout"; %>
   		<%@ include file="header1.jsp" %>
   		<%
          session.invalidate();
           response.sendRedirect("login.jsp");
           %>
        
    <%@ include file="footer.jsp" %>
  