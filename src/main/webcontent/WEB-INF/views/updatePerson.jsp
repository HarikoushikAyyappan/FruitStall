<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01
    Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Person List</title>
</head>
<body>
<div align="center">
    <h2>Person List</h2>
    <table border="1" cellpadding="5">
                  <tr>
                      <th>Id</th>
                      <th>Name</th>
                      <th>Age</th>
                      <th>Mobile</th>
                  </tr>
                  <c:forEach items="${personList}" var="person">
                  <tr>
                      <td>${person.id}</td>
                      <td>${person.name}</td>
                      <td>${person.age}</td>
                      <td>${person.mobile}</td>
                      <td>
                         <a href="http://localhost:8080/Shop/edit/${person.id}/">Edit</a>
                             &nbsp;&nbsp;&nbsp;
                         <a href="http://localhost:8080/Shop/delete/${person.id}/">Delete</a>
                          </td>
                  </tr>
                  </c:forEach>
              </table>
               <a href="http://localhost:8080/Shop">Home</a>
    </div>
    </body>
</html>