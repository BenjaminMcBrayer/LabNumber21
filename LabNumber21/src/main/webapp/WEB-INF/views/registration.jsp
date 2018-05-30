<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html lang="en">

<head>

<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">

<link rel="stylesheet"
	href="https://fonts.googleapis.com/css?family=Inconsolata">
<link rel="stylesheet" type="text/css" href="css/style.css">

<title>Please fill out the form to register.</title>

</head>

<body>
	<h2>Please fill out the form to register.</h2>
	<div>
		<form action="add" id="contact" method="post">
			<!-- First Name -->
			<div>
				<label for="contact_firstname">First Name</label><br> <input
					type="text" id="contact_firstname" name="firstName"></input> <span
					class="error">This field is required</span>
			</div>
			<!-- Last Name -->
			<div>
				<label for="contact_lastname">Last Name</label><br> <input
					type="text" id="contact_lastname" name="lastName"></input> 
					<span class="error">This field is required</span>
			</div>
			<!-- Email -->
			<div>
				<label for="contact_email">Email</label><br> <input
					type="email" id="contact_email" name="emailAddress"></input> <span
					class="error">A valid email address is required.</span>
			</div>
			<!-- Phone Number -->
			<div>
				<label for="contact_phonenumber">Phone Number</label><br> <input
					type="text" id="contact_phonenumber" name="phoneNumber"></input> <span
					class="error">A valid phone number is required.</span>
			</div>
			<!-- DOB -->
			<div>
				<label for="contact_birthdate">Date of Birth</label><br> <input
					type="date" id="contact_birthdate" name="birthDate"></input>
				<!-- TODO: Show error message if date of birth is not provided. -->
			</div>
			<!-- Gender -->
			<div>
				<label for="contact_gender">Gender</label><br> <input
					type="radio" name="userGender" value="OTHER">Other<br> <input
					type="radio" name="userGender" value="FEMALE">Female<br> <input
					type="radio" name="userGender" value="MALE">Male<br>
			</div>
			<!-- Submit Button -->
			<div id="contact_submit button">
				<input type="submit" value="Submit"></input>
			</div>
		</form>
	</div>

	<!-- JavaScript Code -->
	<script type="text/javascript" src="webjars/jquery/2.1.4/jquery.js"></script>
	<script type="text/javascript" src="js/validate.js"></script>

</body>
</html>