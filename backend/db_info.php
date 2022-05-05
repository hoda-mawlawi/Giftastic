<?php

    $db_host = "localhost";
    $db_user = "root";
    $dp_pass = null;
    $db_name = "giftasticdb";

    $mysqli = new mysqli();

    if (mysqli_connect_errno()) {
        die("Connection Failed");
    }
?>