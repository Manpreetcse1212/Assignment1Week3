<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Print Grades</title>
<link rel="stylesheet" href="styles.css">
</head>
<body style="background-color:white">
<img class="img1" src="./images/logo.png"/>
<div class="log1">
<form action="Calculationservlet" method="post">
<h2>
	Students Marksheet and Grades
</h2>
<%
Cookie[] ck = request.getCookies();
for (Cookie c : ck) {
	if ("userName".equals(c.getName())) {
		//System.out.println("Test Cookie : " + c.getValue().toUpperCase());
		out.println("<h3> Welcome "+ c.getValue().toUpperCase() +" </h3>");
	}
}
%>

<p>Student Name:</p>
<input type="text" name="studentname" placeholder="Enter Student name" id="studentName">
<p>Enter the marks of 5 subjects:</p>
<table class="center" border="1" >
<thead>
<tbody>
<tr>
<td>Marks 1</td>
<td><input type="text" name="m1"  id="m1" /></td>
</tr>
<tr>
<td>Marks 2</td>
<td><input type="text" name="m2"  id="m2" /></td>
</tr>
<tr>
<td>Marks 3</td>
<td><input type="text" name="m3"  id="m3" /></td>
</tr>
<tr>
<td>Marks 4</td>
<td><input type="text" name="m4"  id="m4" /></td>
</tr>
<tr>
<td>Marks 5</td>
<td><input type="text" name="m5"  id="m5" /></td>
</tr>
<tr> 
<td colspan="2" ><input type="submit"  name="submit" value="submit" /></td>
</tr>
</tbody>
</table>

</form>
</div>
</body>
</html>
