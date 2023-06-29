<html>
    <head>
        <title>Laboratory Exercise 2</title>
        <meta name="viewport" content="width=device-width, initial-scale=1.0"/>
		<link rel="stylesheet" href="style.css"/>
    </head>
    <body>
	<!-- php code here-->
	
	<?php
	
		$FirstName = "Juan";
		$LastName = "Dela Cruz";
		//Programming1
		$Programming1Title = "Web Programming";
		$Programming1Topic1 = "HTML, CSS, and JavaScript";
		$Programming1Topic2 = "PHP";
		$Programming1Topic3 = "ASP.NET";
		$Programming1Logo = "html.png";
		//Programming2
		$Programming2Title = "Mobile Programming";
		$Programming2Topic1 = "Android";
		$Programming2Topic2 = "IOS";
		$Programming2Topic3 = "Windows";
		$Programming2Logo = "android.png";
		//Programming3
		$Programming3Title = "Desktop Programming";
		$Programming3Topic1 = "Java";
		$Programming3Topic2 = "C#.Net";
		$Programming3Topic3 = "Visual Basic";
		$Programming3Logo = "java.png";
	

	?>
    <div class="row header-content">
		<div class="column-12">
			<?php echo "$FirstName ". "$LastName"?>
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
						<p>Name: <?php echo "$FirstName ". "$LastName"?></p>
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
				<!-- end of row: menu -->
			</div> 
			<!-- end of row: profile -->
			<!-- 2nd Column: Programming Subjects -->
			<div class="column-9">
				<div class="row">
					<div class="column-4 menu">
						<div class="border-subjects">
							<div class="row">
								<div class="column-12">
									<img src="<?php echo "$Programming1Logo"?>"/>
								</div>
							</div>
							<div class="row">
								<div class="column-12">
									<ul>	
										<li class="subject">
											<?php echo "$Programming1Title";?>
										</li>
										<li>
											<?php echo "$Programming1Topic1";?>
										</li>
										<li>
											<?php echo "$Programming1Topic2";?>
										</li>
										<li>
											<?php echo "$Programming1Topic3";?>
										</li>
									</ul>
								</div>
							</div>
						</div>
					</div>
					<div class="column-4 menu">
						<div class="border-subjects">
							<div class="row">
								<div class="column-12">
									<img id="img-android" src="<?php echo "$Programming2Logo";?>"/>
								</div>
							</div>
							<div class="row">
								<div class="column-12">
									<ul>	
										<li class="subject">
											<?php echo "$Programming2Title";?>
										</li>
										<li>
											<?php echo "$Programming2Topic1";?>
										</li>
										<li>
											<?php echo "$Programming2Topic2";?>
										</li>
										<li>
											<?php echo "$Programming2Topic3";?>
										</li>
									</ul>
								</div>
							</div>
						</div>
					</div>
					<div class="column-4 menu">
						<div class="border-subjects">
							<div class="row">
								<div class="column-12">
									<img src="<?php echo "$Programming3Logo";?>"/>
								</div>
							</div>
							<div class="row">
								<div class="column-12">
									<ul>	
										<li class="subject">
											<?php echo "$Programming3Title";?>
										</li>
										<li>
											<?php echo "$Programming3Topic1";?>
										</li>
										<li>
											<?php echo "$Programming3Topic2";?>
										</li>
										<li>
											<?php echo "$Programming3Topic3";?>
										</li>
									</ul>
								</div>
							</div>
						</div>
					</div>
				</div><!-- end of row -->
			</div>
		</div>
    </body>
</html>