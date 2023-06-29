<html>
    <head>
        <title>Web Portfolio</title>
        <meta name="viewport" content="width=device-width, initial-scale=1.0"/>
		<link rel="stylesheet" href="portfolio.css"/>
    </head>
    <body>
	<!-- php code here-->
	
	<?php
	
		$FirstName = "Brian";
		$LastName = "Serrano";
        $Brgy = "Baclig";
        $Municipality = "Cabugao";
        $Province = "Ilocos Sur";
        $Age = "21";
        $game1 = "Minecraft";
        $game2 = "Dragon City";
        $game3 = "Geometry Dash";
        $game4 = "Survivalcraft";
        $game5 = "Hungry Shark Evolution";
        $game6 = "Subway Surf";
        $game7 = "Wordscapes";
        $game8 = "Word Cookies";
        $game9 = "Chess King Learn";
        $game10 = "Color Switch";
        $game11 = "Ski Safari 2";
        $game12 = "Beach Buggy Racing";
        $app1 = "Facebook";
        $app2 = "Messenger";
        $app3 = "STI eLMS";
        $app4 = "One STI Student Portal";
        $app5 = "MS Teams";
        $app6 = "MS Word";
        $app7 = "PDF Reader";
        $app8 = "Video Compressor";
        $app9 = "Screen Recorder";
        $app10 = "Helium";
        $app11 = "Parallel Space";
        $app12 = "Analyze This";
        $app13 = "Blokada";
        $app14 = "Play Games";
        $app15 = "Word Breaker";
        $app16 = "ES File Explorer";
        $app17 = "Auto Clicker";



	

	?>
    <div class="row header-content">
		<div class="column-12">
			<?php echo "$FirstName ". "$LastName"?>
		</div>
	</div>
    <div class="row">
			<div class="column-6">
				<div class="row">
					<div class="column-12">
                        <img src="data:image/png;base64,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">
                    </div>
					<div class="column-12">
                        <h2>My Apps</h2>
						<table class="table">
							<tr>
								<td class="chess"><?php echo "$game1"?></td>
								<td class="chess"><?php echo "$game2"?></td>
								<td class="chess"><?php echo "$game3"?></td>
							</tr>
							<tr>
								<td class="chess"><?php echo "$game4"?></td>
								<td class="chess"><?php echo "$game5"?></td>
								<td class="chess"><?php echo "$game6"?></td>
							</tr>
							<tr>
								<td class="chess"><?php echo "$game7"?></td>
								<td class="chess"><?php echo "$game8"?></td>
								<td class="chess"><?php echo "$game9"?></td>
							</tr>
							<tr>
								<td class="chess"><?php echo "$game10"?></td>
								<td class="chess"><?php echo "$game11"?></td>
								<td class="chess"><?php echo "$game12"?></td>
							</tr>
							<tr>
								<td class="chess"><?php echo "$app1"?></td>
								<td class="chess"><?php echo "$app2"?></td>
								<td class="chess"><?php echo "$app3"?></td>
							</tr>
							<tr>
								<td class="chess"><?php echo "$app4"?></td>
								<td class="chess"><?php echo "$app5"?></td>
								<td class="chess"><?php echo "$app6"?></td>
							</tr>
							<tr>
								<td class="chess"><?php echo "$app7"?></td>
								<td class="chess"><?php echo "$app8"?></td>
								<td class="chess"><?php echo "$app9"?></td>
							</tr>
							<tr>
								<td class="chess"><?php echo "$app10"?></td>
								<td class="chess"><?php echo "$app11"?></td>
								<td class="chess"><?php echo "$app12"?></td>
							</tr>
							<tr>
								<td class="chess"><?php echo "$app13"?></td>
								<td class="chess"><?php echo "$app14"?></td>
								<td class="chess"><?php echo "$app15"?></td>
							</tr>
							<tr>
								<td class="chess"><?php echo "$app16"?></td>
								<td class="chess"><?php echo "$app17"?></td>
							</tr>
						</table>
                    </div>
                </div>
            </div>
            <div class="column-6">
				<div class="row">
					<div class="column-12">
                        <h1>Welcome to My Portfolio</h1>
                        <p>I am <?php echo "$FirstName ". "$LastName"?>. I am from <?php echo "$Brgy ". "$Municipality ". "$Province"?>. I am <?php echo "$Age "?> years old. My hobby is playing mobile games. I study from STI College Laoag. Click the buttons below for my social media account.</p>
					</div>
                    <div class="column-5">
                        <div class="button">
							<a href="https://www.youtube.com/channel/UCdStNXAona8r3rvUtRx0-Dw">Youtube</a>
                        </div>
                    </div>
                    <div class="column-5">
                        <div class="button">
							<a href="https://www.facebook.com/profile.php?id=100004889958627">Facebook</a>
						</div>
                    </div>
                    <div class="column-12">
                        <img src="data:image/jpeg;base64,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">
                    </div>
				</div>    
			</div>
    </body>
</html>