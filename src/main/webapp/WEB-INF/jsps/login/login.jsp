<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>LOGIN</title>
</head>
<body>
	<h2>LOGIN HERE...</h2>
	<form action="verifyLogin" method="post">
		<pre>
EMAILID <input type="text" name="emailId" />
PASSWORD<input type="text" name="password" />
<input type="submit" value="login">
</pre>
	</form>
	${error}
</body>
</html>