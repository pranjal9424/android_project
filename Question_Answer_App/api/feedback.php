<?php
       include "db_connect.php";
	   
	   
        $name = $_GET['name'];
	    $email = $_GET['email'];
		$message = $_GET['message'];
		
		
		
		if($name == '' || $email == '' || $message == '')
		{
	
		echo 'please fill all values';
		}
		else{
		$sql = "SELECT * FROM feedback WHERE email='$email'";
	        $check = mysqli_fetch_array(mysqli_query($con,$sql));
		if(isset($check)){
		echo 'email already exist';
		}else{
		$sql = "INSERT INTO feedback (name,email,message) VALUES('$name','$email','$message')";
		if(mysqli_query($con,$sql)){
			echo 'successfully registered';
	
	}
		else{
				
			echo 'oops! Please try again!';
		
		}
}
			
	        mysqli_close($con);
		}
		