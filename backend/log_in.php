
<?php

include("db_info.php");

$email = $_GET["email"];
$password = $_GET["password"];

$query = $mysqli->prepare("SELECT name FROM users WHERE email = ? AND password = ?;");
$query->bind_param("ss", $email, $password);
$query->execute();

$array = $query->get_result();

$response = [];

while($user = $array->fetch_assoc()){
    $response[] = $user;
}

$json_response = json_encode($response);
echo $json_response;

?>