<?php

include("db_info.php");

//for all the items in the cart
$product = $_POST["product"];
$quantity = $_POST["quantity"];

$query = $mysqli->prepare("SELECT id FROM products name = ?;"); 
$query->bind_param("s", $product);
$query->execute();
$product_id = $query->get_result();

$query = $mysqli->prepare("INSERT INTO cart (product_id, quantity) VALUES (?, ?)"); //how do I get user_id?
$query->bind_param("ii", $product_id, $quantity);
$query->execute();
//

#$response = [];
#$response["status"] = "Mabrouk!";

$json_response = json_encode($response);
echo $json_response;

?>