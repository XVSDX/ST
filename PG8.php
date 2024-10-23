<?php

$countFile = 'visitor_count.txt';

function incrementVisitorCount() {
global $countFile;
$count = 1;
if (file_exists($countFile)) {
$count = intval(file_get_contents($countFile));
$count++;
}
file_put_contents($countFile, $count);
return $count;
}

$visitorCount = incrementVisitorCount();
?>

<!DOCTYPE html>
<html>
<head>
<title>Visitor Count Page</title>
<style>

body {
font-family: Arial, sans-serif;
text-align: center;
}
h1 {
margin-top: 50px;
}
#counter {
font-size: 48px;
margin-top: 20px;
}
</style>
</head>
<body>
<h1>Welcome to the Visitor Count Page</h1>
<p>Number of Visitors:</p>
<div id="counter"><?php echo $visitorCount; ?></div>
</body> 
</html>
