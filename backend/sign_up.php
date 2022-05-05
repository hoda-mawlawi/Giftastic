<?php

include("db_info.php");

$name = $_POST["name"];
$email = $_POST["email"];
$password = $_POST["password"];

$query = $mysqli->prepare("SELECT id FROM user_types WHERE user_type = 'shopper';");
$query->execute();
$user_type_id = $query->get_result();

$query = $mysqli->prepare("INSERT INTO users (name, email, password, user_type_id) VALUES (?, ?, ?, ?)");
$query->bind_param("sssi", $name, $email, $password, $user_type_id);
$query->execute();

#$response = [];
#$response["status"] = "Mabrouk!";

$json_response = json_encode($response);
echo $json_response;

?>