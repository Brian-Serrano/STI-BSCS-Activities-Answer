<html>
    <head>
        <title>Laboratory Exercise 2</title>
        <meta name="viewport" content="width=device-width, initial-scale=1.0"/>
		<link rel="stylesheet" href="style.css"/>
    </head>
    <body>
	
	<?php
		
		$name = array("Brian", "Serrano");
		
	?>
	
	<div class="row header-content">
		<div class="column-12">
			<?php echo $name[0]." ".$name[1];?>
		</div>
	</div> 
		<!-- end of div: header -->
		<div class="row">
			<div class="column-3 border-profile">
				<div class="row">
					<div class="column-12">
						<img src="login_logo.png"/>
					</div>
				</div>
				<div class="row">
					<div class="column-12">
						<p>Name: <?php echo $name[0]." ".$name[1];?></p>
					</div>
				</div>
				<div class="row">
					<div class="col-12 menu">
						<ul>
							<li>
								Home
							</li>
							<li>
								Subjects
							</li>
							<li>
								Assignment
							</li>
							<li>
								Quiz
							</li>
							<li>
								About
							</li>
						</ul>
					</div>
				</div>
			</div> 
			<div class="column-9">
				<div class="row">
	
	
	<?php
	
		$programmingtopic = array(
		array("HTML, CSS, and JavaScript", "PHP", "ASP.NET"),
		array("Android", "IOS", "Windows"),
		array("Java", "C#.Net", "Visual Basic")
		);
		
		$programmingtitle = array("Web Programming", "Mobile Programming", "Desktop Programming");
		
		$logo = array("html.png", "android.png", "java.png");
		
		for($row = 0; $row < 3; $row++){	
			
			echo "<div class='column-4 menu'><div class='border-subjects'><div class='row'><div class='column-12'><img src='".$logo[$row]."'/></div></div><div class='row'><div class='column-12'><ul><li class='subject'>".$programmingtitle[$row]."</li>";
			
			for($col = 0; $col < 3; $col++){
				echo "<li>".$programmingtopic[$row][$col]."</li>";
			}
			echo "</ul></div></div></div></div>";
		}
		

	?>
				</div>
			</div>
		</div>
    </body>
</html>