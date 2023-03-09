<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body style="background-color: #ffe6e6">

<form action="insert" method="post">
<div align="center">
<h1>Wellcome to Registeration Page</h1>

<table>
<tr>
<td>Name:</td>
<td><input type="text" name="tbname" placeholder="enter name"/><br></td>
</tr>
<tr>
<td>Email:</td>
<td><input type="email" name="tbmail" placeholder="enter email"/><br></td>
</tr>
<tr>
<td>Password:</td>
<td><input type="password" name="tbpassword" placeholder="enter password"/><br></td>
</tr>
<tr>
<td>States:</td>
<td><select name="ddlstates">
<option>--SELECT--</option>
<option value="karnataka">--KARANATAKA--</option>
<option value="maharashtra">--MAHARASHTRA--</option>
<option value="kerala">--KERALA--</option>
<option value="tamilnadu">--TAMILNADU--</option>
<option value="Andrapradesh">--ANDRAPRADESH--</option>
<option value="goa">--GOA--</option>
<option value="dehli">--DEHLI--</option>
<option value="uttarpradesh">--UTTARPRADESH--</option>
</select></td>
</tr>

</table>
<br>
</div>

<div align="center">
<td><input type="submit" value="register"/></td>
</div>
</form>

</body>
</html>