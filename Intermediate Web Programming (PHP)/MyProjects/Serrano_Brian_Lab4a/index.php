<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>04 Laboratory Exercise 1</title>
</head>
<body>
    <h1>Odd or Even Number Checker</h1>
    <?php
    
    if(isset($_POST['submit'])){
        if(is_numeric($_POST['number'])){
            if($_POST['number']%2==0){
                echo "<h2>".$_POST['number']." is an Even number!</h2>";
            } else {
                echo "<h2>".$_POST['number']." is an Odd number!</h2>";
            }
        } else {
            echo "Enter numeric values";
        }
    }
    
    ?>
    <form action="index.php" method="post">
        <p>Enter a number</p>
        <input type="text" name="number">
        <input type="submit" name="submit">
    </form>
</body>
</html>