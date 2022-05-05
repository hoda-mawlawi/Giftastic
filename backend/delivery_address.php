<?php

include("db_info.php");

$country = $_POST["country"];
$city = $_POST["city"];
$street = $_POST["street"];
$building = $_POST["building"];
$floor = $_POST["floor"];
$note = $_POST["note"];

$query = $mysqli->prepare("INSERT INTO addresses (country, city, street, building, floor, note) VALUES (?, ?, ?, ?, ?, ?)");
$query->bind_param("ssssss", $country, $city, $street, $building, $floor, $note);
$query->execute();

#$response = [];
#$response["status"] = "Mabrouk!";

$json_response = json_encode($response);
echo $json_response;

?>