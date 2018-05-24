<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link rel="stylesheet"
	href="https://fonts.googleapis.com/css?family=Inconsolata">
<style>
head {
	font-family: 'Inconsolata', serif;
}

form {
	font-family: 'Inconsolata', serif;
}

input {
	font-family: 'Inconsolata', serif;
	width: 50%;
}
</style>
<title>Please fill out the form to register.</title>
</head>
<body>
	<h1>Please fill out the form to register.</h1>
	<form action="former">
		First Name<br> <input type="text" name="fName"><br>
		<br> Last Name<br> <input type="text" name="lName"><br>
		<br> Email<br> <input type="text" name="eAddress"><br>
		<br> Phone Number<br> <input type="text" name="pNumber"><br>
		<br> Password<br> <input type="password" name="pWord"><br>
		<br> <input type="submit" value="Submit">
	</form>
</body>
</html>