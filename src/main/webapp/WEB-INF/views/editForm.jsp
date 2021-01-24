<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<div align="center">
		
------------------------------------------------------------------------------------------------------------------------------------------
<form:form action="updateStud" modelAttribute="stud" method="POST">

<table>
<tr>
  <th><label>Passenger Id:</label></th>
  <td><form:input path="passenger_id" /></td>
</tr>

<tr>
  <th><label>Cancellation ID:</label></th>
  <td><form:input path="cancellation_id"/></td>
</tr>
<tr> 
  <th><label>Date:</label></th>
  <td><form:input  path="cancellation_Date" type="date"/></td>
</tr>
<tr>
 <th><label>Flight Code</label></th>
 <td><form:input path="flight_code"/></td>
</tr>

<tr>
 <th><label>Ticket Id</label></th>
 <td><form:input path="ticket_id"/></td>
</tr>
<tr>
<td>
<input type="submit" value=Update>
<td>
<tr>
</table>
</form:form>			
		
-----------------------------------------------------------------------------------------------------------------------------------------		
		
		
		
	</div>
</body>
</html>