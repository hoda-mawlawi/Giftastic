<?php

include("db_info.php");

$query = $mysqli->prepare("SELECT product_type FROM product_types");
$query->execute();

$array = $query->get_result();

$response = [];

while($occ = $array->fetch_assoc()){
    $response[] = $occ;
}

$json_response = json_encode($response);
echo $json_response;

?>