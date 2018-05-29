<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html lang="en">

<head>

<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">

<script type="text/javascript" src="webjars/jquery/2.1.4/jquery.js"></script>

<link rel="stylesheet"
	href="https://fonts.googleapis.com/css?family=Inconsolata">

<!-- Styles -->
<style>
h2, head, form, button {
	font-family: 'Inconsolata', serif;
}

p {
	font-family: 'Inconsolata', serif;
	font-size: 10px;
}

input {
	font-family: 'Inconsolata', serif;
	width: 50%;
}

#contact div {
	margin-top: 1em;
}

.error {
	display: none;
	margin-left: 10px;
}

.error_show {
	color: red;
	margin-left: 10px;
}

input.invalid {
	border: 2px solid red;
}

input.valid {
	border: 2px solid green;
}

input[type="radio"] {
	margin-left: -333px;
}

input[name="userGender"] {
	margin-right: -320px;
}
</style>

<!-- JavaScript Code -->
	<script>
		$(document).ready(function() {
			<!-- Real-time Validation -->
				<!--First name cannot be blank-->
				$('#contact_firstname').on('input', function() {
					var input=$(this);
					var is_firstname=input.val();
					if(is_firstname){input.removeClass("invalid").addClass("valid");}
					else{input.removeClass("valid").addClass("invalid");}
				});
				
				<!--Last name cannot be blank.-->
				$('#contact_lastname').on('input', function() {
					var input=$(this);
					var is_lastname=input.val();
					if(is_lastname){input.removeClass("invalid").addClass("valid");}
					else{input.removeClass("valid").addClass("invalid");}
				});
				
				<!--Email must be a valid email address.-->
				$('#contact_email').on('input', function() {
					var input=$(this);
					var re = /^[a-zA-Z0-9.!#$%&'*+/=?^_`{|}~-]+@[a-zA-Z0-9-]+(?:\.[a-zA-Z0-9-]+)*$/;
					var is_email=re.test(input.val());
					if(is_email){input.removeClass("invalid").addClass("valid");}
					else{input.removeClass("valid").addClass("invalid");}
				});
				
				<!--Phone Number must be a valid phone number.-->
				$('#contact_phonenumber').on('input', function() {
					var input=$(this);
					var re = /^(\+?1-?)?(\([2-9]\d{2}\)|[2-9]\d{2})-?[2-9]\d{2}-?\d{4}$/;
					var is_phonenumber=re.test(input.val());
					if(is_phonenumber){input.removeClass("invalid").addClass("valid");}
					else{input.removeClass("valid").addClass("invalid");}
				});
				
		});
	</script>

<title>Please fill out the form to register.</title>

</head>

<body>
	<h2>Please fill out the form to register.</h2>
<div>
	<form action="add" id="contact" method="post">
			<!-- First Name -->
			<div>
				<label for="contact_firstname">First Name</label><br>
				<input type="text" id="contact_firstname" name="firstName"></input>
				<span class="error">This field is required</span>
			</div>
			<!-- Last Name -->
			<div>
				<label for="contact_lastname">Last Name</label><br>
				<input type="text" id="contact_lastname" name="lastName"></input>
				<span class="error">This field is required</span>
			</div>
			<!-- Email -->
			<div>
				<label for="contact_email">Email</label><br>
				<input type="email" id="contact_email" name="emailAddress"></input>
				<span class="error">A valid email address is required.</span>				
			</div>						
			<!-- Phone Number -->
			<div>
				<label for="contact_phonenumber">Phone Number</label><br>
				<input type="text" id="contact_phonenumber" name="phoneNumber"></input>
				<span class="error">A valid phone number is required.</span>								
			</div>
			<!-- DOB -->
			<div>
				<label for="contact_birthdate">Date of Birth</label><br>
				<input type="date" id="contact_birthdate" name="birthDate"></input>
				<!-- TODO: Show error message if date of birth is not provided. -->								
			</div>	
			<!-- FIXME: java.sql.SQLException: Data truncated for column 'userGender' at row 1 -->
			<!-- Gender -->
			<div>
				<label for="contact_gender">Gender</label><br>
				<input type="radio" name="userGender" value='OTHER'>Other<br>
				<input type="radio"	name="userGender" value='FEMALE'>Female<br>
				<input type="radio"	name="userGender" value='MALE'>Male							
			</div>		
			<!-- Submit Button -->
			<div id="contact_submit">				
				<button type="submit" value="submit">Submit</button>
			</div>
	</form>
</div>
</body>
</html>