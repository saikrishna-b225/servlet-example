<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<form action="LoginRegister" method="post">
		<table>
			<tr>
				<td>Registration Page</td>
			</tr>
			<tr>
				<td>UserId:</td>
				<td><input type="number" name="id" /></td>
			</tr>
			<tr>
				<td>UserName:</td>
				<td><input type="text" name="user" /></td>
			</tr>
			<tr>
				<td>EmailId:</td>
				<td><input type="text" name="email" /></td>
			</tr>
			<tr>
				<td>Password:</td>
				<td><input type="password" name="password1" /></td>
			</tr>
			<tr>
				<td>Conform-Password:</td>
				<td><input type="password" name="password2" /></td>
			</tr>
			<tr>
				<td><input type="submit" name="submit" value="register" /></td>
			</tr>
			<tr>
				<td>Already A User?</td>
				<td><a href="login.jsp">sign in</a></td>
			</tr>
		</table>
	</form>

</body>
</html>