<!DOCTYPE html>
<html lang="en">

<head>

<meta charset="utf-8" />

<title>Demo</title>

<link rel="stylesheet" href="../css/demo.css" type="text/css" />

</head>

<body>
<?php
$option = $_GET['option'];

if ( $option == 1 ) {
    $data = [ 'Tramadol', 'Amoxicillin', 'Norvasc' ];
    // will encode to JSON array: ["Tramadol","Amoxicillin","Norvasc"]
    // accessed as example in JavaScript like: result[1] (returns "Amoxicillin")
} else {
    $data = [ 'name' => 'Dr Malcom Fixer', 'phone' => '850-356-2354', 'email' => 'drfixer@mypractice.com'];
    // will encode to JSON object: {"name":"Dr Malcom Fixer","phone":850-356-2354, "email":drfixer@mypractice.com}  
    // accessed as example in JavaScript like: result.name or result['name'] (returns "Dr Malcom Fixer")
}

header('Content-type: application/json');
echo json_encode( $data );
?>
</body>

</html>


