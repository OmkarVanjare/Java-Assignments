<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%
String name_f = request.getParameter("F_name");	
String name_l = request.getParameter("L_name");
String Email = request.getParameter("email");
String Password = request.getParameter("password");
String state = request.getParameter("inputState");
String hobby1 = request.getParameter("inputHobbies1");
String hobby2 = request.getParameter("inputHobbies2");
String hobby3 = request.getParameter("inputHobbies3");
String hobby4 = request.getParameter("inputHobbies4");
String gender = request.getParameter("Gender");
	out.print("First name:- "+name_f+"<br>");
	out.print("Last name:- "+name_l+"<br>");
	out.print("Email:- "+Email+"<br>");
	out.print("Password:- "+Password+"<br>");
	out.print("State:- "+state+"<br>");
	out.print("Gender:- "+gender+"<br>");
	out.print("Hobby1:- "+hobby1+"<br>");
	out.print("Hobby2:- "+hobby2+"<br>");
	out.print("Hobby3:- "+hobby3+"<br>");
	out.print("Hobby4:- "+hobby4+"<br>");
	
	
%>
</body>
</html>