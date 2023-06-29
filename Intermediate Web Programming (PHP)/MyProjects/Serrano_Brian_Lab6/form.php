<html>
    <head>
        <title>Demo 1</title>
    </head>
    <style>
        input[type=text] {
            width: 100%;
            padding: 12px 20px;
            margin: 8px 0;
            display: inline-block;
            border: 1px solid #ccc;
            border-radius: 4px;
            box-sizing: border-box;
        }
        input[type=email] {
            width: 100%;
            padding: 12px 20px;
            margin: 8px 0;
            display: inline-block;
            border: 1px solid #ccc;
            border-radius: 4px;
            box-sizing: border-box;
        }

        input[type=submit] {
            width: 100%;
            background-color: #4CAF50;
            color: white;
            padding: 14px 20px;
            margin: 8px 0;
            border: none;
            border-radius: 4px;
            cursor: pointer;
        }

        input[type=submit]:hover {
            background-color: #45a049;
        }

        div {
            border-radius: 5px;
            background-color: #f2f2f2;
            padding: 20px;
        }
    </style>
    <body>
        <h1>Registration Form</h1>
        <div>
		<form action="index.php" method="post">
        <p>Last Name:</p>
            <input type="text" name="lName" placeholder="Last Name..." required><br>
            <p>First Name:</p>
            <input type="text" name="fName" placeholder="First Name..." required><br>
            <p>Middle Initial:</p>
            <input type="text" name="mInitial" placeholder="Middle Initial..." required><br>
            <p>Age:</p>
            <input type="text" name="age" placeholder="Age..." required><br>
            <p>Contact Number:</p>
            <input type="text" name="conNum" placeholder="Contact Number..." required><br>
            <p>Email Address:</p>
            <input type="email" name="email" placeholder="Email Address..." required><br>
            <p>Address:</p>
            <input type="text" name="address" placeholder="Address..." required><br>
            <input type="submit" name="submit">
    </form>
    </div>
	</body>
</html>