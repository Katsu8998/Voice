<?xml version="1.0" encoding="UTF-8" ?>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import ="model.User, model.Mutter, java.util.List" %>
<%
 User loginUser = (User)session.getAttribute("loginUser");
List<Mutter> mutterList = 
(List<Mutter>) application.getAttribute("mutterList");
 String errorMsg = (String)request.getAttribute("errorMsg");
 %>
    
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
<title>Voice</title>
</head>
<body>
<div style="text-align: center">
<h1><font color="blue">Voice</font></h1>
<p>
<%=loginUser.getName() %> Now logging in<br>
<a href="/docoTsubu/Logout">logout</a>
</p>
<p><a href="/docoTsubu/Main">Update</a></p>
<form action = "/docoTsubu/Main" method="post">
<input type ="text" name="text">
<input type ="submit" value="voice">
</form>
<% if(errorMsg !=null){ %>
<p><%= errorMsg %></p>
<%} %>
<% for(Mutter mutter:mutterList) {%>
<p><%= mutter.getUserName() %>:<%=mutter.getText() %></p>
<%} %>
</div>
</body>
</html>