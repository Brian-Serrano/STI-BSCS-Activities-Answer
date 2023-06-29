<html>
    <head>
        <title>Demo 1</title>
    </head>
    <body>
		<h1>D-I-Y Cake</h1>
		<?php

		$numbers = array(
		array("Heart", "Chocolate", "Cookies"),
		array("Rectangle", "Vanilla", "Spun-sugar Flowers"),
		array("Square", "Lemon", "Mini Chocolate Candies"),
		array("Round", "Cheesecake", "Marshmallows")
		);
		echo "<table border = '1'><tr>
		<th>Cake Shape</th>
		<th>Cake Flavor</th>
		<th>Cake Toppings</th>
		</tr>
		<tr>";
		for ($row = 0; $row < 4; $row++) {
			echo "<tr>";
			for ($col = 0; $col < 3; $col++) {
			  echo "<td><input type = 'radio' name='radio".$col."'>".$numbers[$row][$col]."</td>";
			}
			echo "</tr>";
		}
		echo "</tr></table>";
		
		?>
	</body>
</html>