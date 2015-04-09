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
        	<table>
        	
        	<tr>
        		<td align="right">First Name: <input type="text" name="empFirstName" /></td>
        	</tr>
        	
        	<tr>
        		<td align="right">Last Name: <input type="text" name="empLastName" /></td>
        	</tr>
        	
        	<tr>
        		<td align="right">Social Security Number: <input type="text" name="ssn" /></td>
        	</tr>
        	
        	<tr>
        		<td align="right">Position: <input type="text" name="position" /></td>
        	</tr>
        	
        	<tr>
        		<td align="right">Age: <input type="text" name="age" /></td>
        	</tr>
        	
        	<tr>
        		<td align="right">Admin: <input type="checkbox" name="isAdmin"/></td>
        	</tr>
          </table>
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