<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title> info</title>
</head>
<body>
	<div align="center">
		<div style="margin: 5px;">
			<font color="green">${sMsg}</font>
			 <font color="red">${eMsg}</font>
			  <font color="black">${eMsg}</font>
		</div>
		

 
<form:form action="addStud" modelAttribute="stud" method="post">

<table>
<tr>
  <th><label>Passenger Id:</label></th>
  <td><form:input path="passenger_id" /></td>
</tr>

<tr>
  <th><label>Cancellation Id:</label></th>
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
<input type="submit" value=Book>
<td>
<tr>
</table>
</form:form>		
		
		
<hr>		
		<br>
		<br>
	</div> 
	
	<div align="center" >
		<table border="1px " width=60%>
			<tr style="font-weight:bold; background-color: #FF5050; " >
				<td >Passenger Id</td>
				<td>Cancellation Id</td>
				<td>Date</td>
				<td>Flight Code</td>
				<td>Ticket Id</td>
				<td>Delete</td>
				<td>Edit</td>
				
				
				
			</tr>
			<c:forEach var="stud" items="${studlist}">
				<tr style= "background-color: #9966FF;">
					<td>${stud.passenger_id }</td>
					<td>${stud.cancellation_id }</td>
					<td>${stud.cancellation_Date }</td>
					<td>${stud.flight_code }</td>
					<td>${stud.ticket_id }</td>
					
					<td><a href="deleteStud?passenger_id=${stud.passenger_id }"><button
								style="color: red;">Delete</button></a></td>
					<td><a href="editStud?passenger_id=${stud.passenger_id }"><button
							style="color: green;">Edit</button></a></td>
					
				</tr>
			</c:forEach>

		</table>
	</div>
</body>
</html>