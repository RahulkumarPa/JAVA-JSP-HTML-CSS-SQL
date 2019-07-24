
    <%! String title = "dashboard"; %>
        <%@ include file="./header1.jsp" %>
     <div>
        <div>
            <h3><%= message %></h3>  
            <h1><%=aStudent%></h1>
            <p> Wellcome <%=aStudent.getFirstName()%> your studentNUmer is <%=aStudent.getId()%> <br/>
             and you are in <%=aStudent.getYear()%> in <%=aStudent.getProgramDescription()%> (<%=aStudent.getProgramCode()%>) </9>
            <P>kem bapu</P>
             <% Integer size = aStudent.getMarks().size();%>
      <table  border=" 2px solid black">
      	<tr>
      		<th>Course Code </th>
      		<th>Course Name</th>
      		<th>Result</th>
      		<th>Course<br/>GpaWeighteg</th>
      		
      	</tr>
      	<%
      	double coursecredit =0.0 ;
      	double finalcredit=0.0;
      	double gpa = 0.0;%>
      	
      	<% for (int i =0; i<size; i++) { 
      	 Integer cousePointValue =aStudent.getMarks().get(i).getResult(); 
      		    double cpv = 0.0; 
      		    if(cousePointValue >= 90 && cousePointValue <= 100)
      		    {
                    cpv=5.0;
      		    }
      		    else if(cousePointValue >= 85 && cousePointValue <= 89)
      		    {
                    cpv=4.5;
      		    }
      		    else if(cousePointValue >= 80 && cousePointValue <= 84)
      		    {
                    cpv=4.0;
      		    }
      		    else if(cousePointValue >= 75 && cousePointValue <= 79)
      		    {
                    cpv=3.5;
      		    }
      		    else if(cousePointValue >= 70 && cousePointValue <= 74)
      		    {
                    cpv=3.0;
      		    }
      		    else if(cousePointValue >= 65 && cousePointValue <= 69)
      		    {
                    cpv=2.5;
      		    }
      		    else if(cousePointValue >= 60 && cousePointValue <= 64)
      		    {
                    cpv=2.0;
      		    }
      		    else if(cousePointValue >= 55 && cousePointValue <= 59)
      		    {
                    cpv=1.5;
      		    }
      		    else if(cousePointValue >= 50 && cousePointValue <= 54)
      		    {
                    cpv=1.0;
      		    }
                else
                {
                	cpv =0.0;
                }

                double CourseMarks = aStudent.getMarks().get(i).getGpaWeighting()* cpv;
                
                coursecredit = coursecredit + CourseMarks; 
                
                finalcredit = finalcredit + aStudent.getMarks().get(i).getGpaWeighting();
                
                gpa = coursecredit/finalcredit ;

      		     } %>
                
               
      		<% for (int j =0; j<size; j++) { %>	    
         <tr>
      		<td><%=aStudent.getMarks().get(j).getCourseCode()%></td>
      		<td><%=aStudent.getMarks().get(j).getCourseName()%></td>
      		<td><%=aStudent.getMarks().get(j).getResult()%></td>
      		<td><%=aStudent.getMarks().get(j).getGpaWeighting()%></td>    
      	</tr>	
      	<%}%>
      	<tr>
      		<td> <%=coursecredit%>
      		</td>
      		<td> <%=finalcredit%>
      		</td>
      		<td> <%=gpa%>
      		</td>
      	</tr>
      </table>
      <table border=" 2px solid black">
      	<tr>
      	<th>CourseNumber</th>
      	<td><%=size%></td>
      	</tr>
      	<tr>
      	<th>TotalCourseCredit</th>
      	<td><%=finalcredit%></td>
      	</tr>
      	<tr>
      	<th>YourTotalCredit</th>
      	<td><%=coursecredit%></td>
      	</tr>   
      	<tr>
      	<th>Your GPA</th>
      	<td><%=gpa%></td>
      	</tr>         	
       
   
        </table>
    </div>

    <%@ include file="footer.jsp" %>
 