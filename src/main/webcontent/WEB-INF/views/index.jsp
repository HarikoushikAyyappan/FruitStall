<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01
    Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Person Manager</title>
</head>
<body>
<div align="center">
    <h2>Person Manager</h2>
    </form>
    <form
    <form method="get"  action="/Shop/listOfPersons">
                </br>List   <input type="submit"  value="List"/></form>
     <form method="get"  action="/Shop/new">
        </br>Add    <input type="submit"  value="Add New Person"/></form>
     <form method="post"  action="/Shop/edit">
        </br>Edit     <input type="submit"  value="Edit Person"/></form>
        <form method="get"  action="/Shop/register">
                        </br>AddCustomer   <input type="submit"  value="Add New Customer"/></form>
</div>
</body>
</html>