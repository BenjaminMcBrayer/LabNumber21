/**
 * 
 */
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
					var reg = /^(\+?1-?)?(\([2-9]\d{2}\)|[2-9]\d{2})-?[2-9]\d{2}-?\d{4}$/;
					var is_phonenumber=reg.test(input.val());
					if(is_phonenumber){input.removeClass("invalid").addClass("valid");}
					else{input.removeClass("valid").addClass("invalid");}
				});
				
				// Validate form after submission.
				$("#contact_submit button").click(function(event){
					var form_data=$("#contact").serializeArray();
					var error_free=true;
					for (var input in form_data){
						var element=$("#contact_"+form_data[input]['name']);
						var valid=element.hasClass("valid");
						var error_element=$("span", element.parent());
						if (!valid){error_element.removeClass("error").addClass("error_show"); error_free=false;}
						else{error_element.removeClass("error_show").addClass("error");}
					}
					if (!error_free){
						event.preventDefault(); 
					}
					else{
						alert('No errors: Form will be submitted');
					}
				});
		});
