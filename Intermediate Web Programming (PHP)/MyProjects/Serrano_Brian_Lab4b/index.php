<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
</head>
<body>
    <h1>Know Your Healthful Food!</h1>
    <?php
    
    if(isset($_POST['submit'])){
        switch($_POST['food']){
            case 'Almond':
                echo "<h2>Almond has magnesium, vitamin E, iron, calcium, and fiber.</h2>";
                break;
            case 'Oatmeal':
                echo "<h2>Oats contain complex carbohydrates, as well as water-soluble fiber.</h2>";
                break;
            case 'Broccoli':
                echo "<h2>Broccoli provides good amounts of fiber, calcium, potassium, folate, and phytonutrient.</h2>";
                break;
            case 'Apple':
                echo "<h2>Apples are an excellent source of antioxidants, which combat free radicals.</h2>";
                break;
            case 'Avocados':
                echo "<h2>Avocados provide healthful fats, as well as B vitamins, vitamin K, and vitamin E.</h2>";
                break;
            case 'Chicken':
                echo "<h2>Chicken is cost-effective meat that is an excellent source of protein.</h2>";
                break;
            default:
                echo "Data for ".$_POST['food']." is not available. Please try again!";
        }
    }
    
    ?>
    <form action="index.php" method="post">
        <p>Enter a food</p>
        <input type="text" name="food">
        <input type="submit" name="submit">
    </form>
</body>
</html>