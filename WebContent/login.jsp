<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body style="background-color: #e0e0eb">
<form action="success" method="post">
<div align="center">
<h1>Welcome to Login page</h1>

<table>
<tr>
<td>Email:</td>
<td><input type="email" name="tbmail" placeholder="enter email" value="<%=request.getParameter("tbmail") %>"/><br></td>
</tr>
<tr>
<td>Password:</td>
<td><input type="password" name="tbpassword" placeholder="enter password" value="<%=request.getParameter("tbpassword") %>"/><br></td>
</tr>
</table>
</div>

<br>
<br>

<div align="center">
<td><input type="submit" value="Login"/></td>
</div>
</form>

</body>
</html>