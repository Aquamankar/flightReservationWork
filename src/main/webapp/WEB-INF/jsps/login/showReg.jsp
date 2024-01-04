<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>NEW REGISTRATION</title>
</head>
<body>
	<h2>CREATE NEW ACCOUNT</h2>
	<form action="saveReg" method="post">
		<pre>
FIRST NAME <input type="text" name="firstName" />
LAST NAME <input type="text" name="lastName" />
EMAIL <input type="text" name="email" />
PASWORD <input type="text" name="password" />
<input type="submit" value="save" />
</pre>
	</form>
</body>
</html>