<?xml version="1.0" encoding="UTF-8" ?>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
 <%@ page import ="model.User" %>
 <%
 User loginUser = (User)session.getAttribute("loginUser");
 %>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
<title>Voice</title>
</head>
<body>
<div style="text-align: center">
<h1><font color="blue">Voice Login</font></h1>
<% if(loginUser !=null){ %>
<p>success to login</p>
<p>welcome to <%= loginUser.getName() %></p>
<a href="/docoTsubu/Main">Post and View</a>
<% }else{ %>
<p>fail to login</p>
<a href="/docoTsubu/">Top</a>
<%} %>
</div>
</body>
</html>