<html>
    <head>
        <title>Basic Calculator</title>
    </head>
    <body>
        <h1>Basic Calculator</h1>
        <form method="post">
        First Number:<br>
        <input type="text" name="number1"><br><br>
        Second Number:<br>
        <input type="text" name="number2"><br><br>
        Select Operator:<br><br>
        <input type="radio" name="op" value="add">Add<br>
        <input type="radio" name="op" value="subtract">Subtract<br>
        <input type="radio" name="op" value="multiply">Multiply<br>
        <input type="radio" name="op" value="divide">Divide<br><br>
        Total:<input type="text" value="<?php
		$total = "";
	
		if(isset($_POST['submit']) )
		{
			if(is_numeric($_POST['number1']) && is_numeric($_POST['number2']))
			{
				switch($_POST['op']){
					case "add":
						$total = $_POST['number1'] + $_POST['number2'];
						break;
					case "subtract":
						$total = $_POST['number1'] - $_POST['number2'];
						break;
					case "multiply":
						$total = $_POST['number1'] * $_POST['number2'];
						break;
					case "divide":
						$total = $_POST['number1'] / $_POST['number2'];
						break;
				}
				echo $total;
			} else {
				echo 'Numeric values are required';
			}
		}
		?>"><br><br>
        <button name="submit">Enter</button>
        </form>
    </body>
</html>
