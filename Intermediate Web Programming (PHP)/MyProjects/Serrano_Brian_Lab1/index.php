<html>
    <head>
        <title>Demo 1</title>
    </head>
    <body>
        <!--Displays the output via PHP syntax -->
        <?php
            $demo1 = "Hello World!";
            echo "$demo1";

            $subject = "Hello Intermediate Web Programming!";

            $PL = "PHP";
        ?>

        <!-- Different ways to display the output via HTML elements -->
        <h1><?php echo "$demo1"?></h1>
        <h3><?php echo "$subject";?></h3>

        <?php echo "<h2>Programming language: $PL </h2>"?>
    </body>
</html>