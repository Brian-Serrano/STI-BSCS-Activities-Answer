<html>
    <head>
        <title>Demo 1</title>
    </head>
    <style>
        #customers {
            font-family: Arial, Helvetica, sans-serif;
            border-collapse: collapse;
            width: 100%;
        }

        #customers td, #customers th {
            border: 1px solid #ddd;
            padding: 8px;
        }

        #customers tr:nth-child(even){background-color: #f2f2f2;}

        #customers tr:hover {background-color: #ddd;}

        #customers th {
            padding-top: 12px;
            padding-bottom: 12px;
            text-align: left;
            background-color: #04AA6D;
            color: white;
        }
    </style>
    <body>

        <?php

        class FormInfoClass {
            private $lName;
            private $fName;
            private $mInitial;
            private $age;
            private $conNum;
            private $email;
            private $address;

            public function setLName($lName){
                $this->lName = $lName;
            }
            public function getLName(){
                return $this->lName;
            }
            public function setFName($fName){
                $this->fName = $fName;
            }
            public function getFName(){
                return $this->fName;
            }
            public function setMInitial($mInitial){
                $this->mInitial = $mInitial;
            }
            public function getMInitial(){
                return $this->mInitial;
            }
            public function setAge($age){
                $this->age = $age;
            }
            public function getAge(){
                return $this->age;
            }
            public function setConNum($conNum){
                $this->conNum = $conNum;
            }
            public function getConNum(){
                return $this->conNum;
            }
            public function setEmail($email){
                $this->email = $email;
            }
            public function getEmail(){
                return $this->email;
            }
            public function setAddress($address){
                $this->address = $address;
            }
            public function getAddress(){
                return $this->address;
            }
        }

        class MyDB extends FormInfoClass {
            public function connect(){
                $conn = mysqli_connect('localhost', 'root', '', 'mwdb');
                if (!$conn) {
                    die("Connection failed: " . mysqli_connect_error());
                }
                return $conn;
            }
            public function query(){
                
                $this->setLName($_POST['lName']);
                $this->setFName($_POST['fName']);
                $this->setMInitial($_POST['mInitial']);
                $this->setAge($_POST['age']);
                $this->setConNum($_POST['conNum']);
                $this->setEmail($_POST['email']);
                $this->setAddress($_POST['address']);

                $query = "INSERT INTO person (lName, fName, mInitial, age, conNum, email, address) VALUES 
                ('".$this->getLName()."',
                '".$this->getFName()."',
                '".$this->getMInitial()."',
                '".$this->getAge()."',
                '".$this->getConNum()."',
                '".$this->getEmail()."',
                '".$this->getAddress()."');";
                $query_run = mysqli_query($this->connect(), $query);
                if(!$query_run) {
                    header('location:form.php?error=queryfailed');
                    exit();
                }
                $query2 = "SELECT * FROM person";
                $query_run2 = mysqli_query($this->connect(), $query2);
                if(!$query_run2) {
                    header('location:form.php?error=queryfailed');
                    exit();
                }

                if (mysqli_num_rows($query_run2) > 0){
					echo "<table id='customers'>
						<tr>
							<th>Last Name</th>
							<th>First Name</th>
							<th>Middle Initial</th>
							<th>Age</th>
							<th>Contact Number</th>
							<th>Email</th>
                            <th>Address</th>
						</tr>";
					foreach($query_run2 as $row){
		                echo "<tr>
							<td>" . $row['lName'] . "</td>
							<td>" . $row['fName'] . "</td>
							<td>" . $row['mInitial'] . "</td>
							<td>" . $row['age'] . "</td>
							<td>" . $row['conNum'] . "</td>
							<td>" . $row['email'] . "</td>
                            <td>" . $row['address'] . "</td>
						</tr>";
					}
					echo "</table>";
				} else {
	                echo "0 results";
				}
            }
        }

        if(isset($_POST['submit'])){

            $db = new MyDB();
            $db->query();

        }

        ?>
	</body>
</html>