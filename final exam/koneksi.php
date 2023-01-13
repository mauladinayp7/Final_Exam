<!DOCTYPE html>

<?php
$db_host = 'http://localhost:8083';
$db_user = 'root';
$db_pass = "";
$db_name = 'final_exam';

$conn = mysqli_connect($db_host, $db_user, $db_pass, $db_name);
if (!$conn) {
  die ('Gagal terhubung dengan MySQL:'.mysqli_connect_error());
}

$sql='SELECT*FROM surat';
$query=mysqli_query($conn,$sql);

if (!$query) {
  die ('SQL Error:' .mysqli_error($conn));
}

?>