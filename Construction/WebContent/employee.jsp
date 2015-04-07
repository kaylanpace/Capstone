<%@page contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@page import="java.util.*,employee.Employee"%>
 
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
    "http://www.w3.org/TR/html4/loose.dtd">
 
<html>
    <head>
        <title>Construction Pal</title>
    </head>
 
    <body>
    
    	
        <form method="POST" action="employee">
        
          First Name: <input type="text" name="empFirstName" />
          Last Name: <input type="text" name="empLastName" />
           Social Security Number: <input type="text" name="ssn" />
          Position: <input type="text" name="position" />
           Age: <input type="text" name="age" />
          Admin: <input type="checkbox" name="isAdmin"/>
          
        <input type="submit" value="Add" />
        </form>
 
        <hr><ol> <%
            @SuppressWarnings("unchecked") 
            List<Employee> employees = (List<Employee>)request.getAttribute("employees");
            if (employees != null) {
                for (Employee employee : employees) { %>
                    <li> <%=employee%> </li> <%
                }
            } %>
        </ol><hr>
 
        <iframe src="http://www.objectdb.com/pw.html?jee-eclipse"
            frameborder="0" scrolling="no" width="100%" height="30"> </iframe>
     </body>
 </html>