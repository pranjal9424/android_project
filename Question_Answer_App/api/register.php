<?php
       include "db_connect.php";
	   
	   
        $username = $_GET['username'];
	    $password = $_GET['password'];
	    $email = $_GET['email'];
		
		if($username == '' || $password == '' || $email == '')
		{
	
		echo 'please fill all values';
		}
		else{
		$sql = "SELECT * FROM profile WHERE username='$username' OR email='$email'";
	        $check = mysqli_fetch_array(mysqli_query($con,$sql));
		if(isset($check)){
		echo 'username or email already exist';
		}else{
		$sql = "INSERT INTO profile (username,password,email) VALUES('$username','$password','$email')";
		if(mysqli_query($con,$sql)){
			echo 'successfully registered';
	
	}
		else{
				
			echo 'oops! Please try again!';
		
		}
}
			
	        mysqli_close($con);
		}
		