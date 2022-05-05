<?php

include("db_info.php");

$product_type = $_GET["email"];
$password = $_GET["password"];

$query = $mysqli->prepare("SELECT name, price, quantity FROM products WHERE product_type_id = (SELECT id FROM products WHERE product_type  = ?);");
$query->bind_param("s", $product_type);
$query->execute();

$array = $query->get_result();

$response = [];

while($products = $array->fetch_assoc()){
    $response[] = $products;
}

$json_response = json_encode($response);
echo $json_response;

?>