<?php
include "db_connect.php";

$stmt = " SELECT * FROM aptitude";

$result = mysqli_query($con,$stmt);
$json = array();
while($row = mysqli_fetch_array($result))     
{
    array_push($json,array(
        'question' => utf8_encode($row['question']),
		'answer' => utf8_encode($row['answer'])
    ));
    // print_r($json);
}
    $jsonstring = json_encode(["result" => $json],JSON_PRETTY_PRINT);
	echo $jsonstring;
?>