<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link rel="stylesheet" href="styles.css"/>
<title>Print Grades</title>
</head>
<body style="background-color:white">
<img class="img1" src="./images/logo.png"/>
<div class="log1">
<table border="1" align="center" style="border:4px solid black; border-collapse:collapse">
<thead>
<tr>
<td>
Name of the student
</td>
<td>
<%
HttpSession h1=request.getSession();
out.println(h1.getAttribute("name"));
%>
</td>
</tr>

<tr>
<td>
Marks1
</td>
<td>
<%
HttpSession h3=request.getSession();
out.println(h3.getAttribute("m1"));
%>
</td>
</tr>

<tr>
<td>
Marks2
</td>
<td>
<%
HttpSession h4=request.getSession();
out.println(h4.getAttribute("m2"));
%>
</td>
</tr>

<tr>
<td>
Marks3
</td>
<td>
<%
HttpSession h5=request.getSession();
out.println(h5.getAttribute("m3"));
%>
</td>
</tr>

<tr>
<td>
Marks4

</td>
<td>
<%
HttpSession h6=request.getSession();
out.println(h6.getAttribute("m4"));
%>

</td>
</tr>

<tr>
<td>
Marks5
</td>
<td>
<%
HttpSession h7=request.getSession();
out.println(h7.getAttribute("m5"));
%>
</td>

<tr>
<td>
Grade of the student
</td>
<td>
<%
HttpSession h=request.getSession();
out.println(h.getAttribute("grade"));
%>
</td>
</tr>

<tr>
<td>
Minimum marks
</td>
<td>
<%
HttpSession h2=request.getSession();
out.println(h2.getAttribute("min"));
%>
</td>
</tr>

<tr>
<td>
Maximum marks
</td>
<td>
<%
HttpSession h8=request.getSession();
out.println(h8.getAttribute("max"));
%>
</td>
</tr>
</table>

</div>

<div align="center" style="margin-top:100px">
<p> <b>Details of Group members</b></p>
<p>
<b>Member1</b>: Manpreet Kaur, Id:C0793385<br/>
<b>Member2</b>: Manpreet Kaur, Id: C0791914<br/>
<b>Member3</b>: Bhumikaben Manubhai Patel, Id:C0795565<br/>
<b>Member4</b>: Ashikkumar Nareshbhai Patel, C0805023<br/>
<b>Member5</b>: Hardeep Kaur, Id: C0793420<br/>
</p>

</div>
</body>
</html>
