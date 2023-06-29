<html>
    <head>
        <title>Demo 1</title>
    </head>
    <style>
        table {
            border-collapse: collapse;
            margin: 25px 0;
            font-size: 0.9em;
            font-family: sans-serif;
            min-width: 400px;
            box-shadow: 0 0 20px rgba(0, 0, 0, 0.15);
        }
    </style>
    <body>

        <table border="1">
            <tr>
                <th>Inputs</th>
                <th>Required</th>
            </tr>

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

        if(isset($_POST['submit'])){

            $person = new FormInfoClass();
            $person->setLName($_POST['lName']);
            $person->setFName($_POST['fName']);
            $person->setMInitial($_POST['mInitial']);
            $person->setAge($_POST['age']);
            $person->setConNum($_POST['conNum']);
            $person->setEmail($_POST['email']);
            $person->setAddress($_POST['address']);

            echo "<tr>
                <td>Last Name</td>
                <td>".$person->getLName()."</td>
            </tr>";
            echo "<tr>
                <td>First Name</td>
                <td>".$person->getFName()."</td>
            </tr>";
            echo "<tr>
                <td>Middle Initial</td>
                <td>".$person->getMInitial()."</td>
            </tr>";
            echo "<tr>
                <td>Age</td>
                <td>".$person->getAge()."</td>
            </tr>";
            echo "<tr>
                <td>Contact Number</td>
                <td>".$person->getConNum()."</td>
            </tr>";
            echo "<tr>
                <td>Email</td>
                <td>".$person->getEmail()."</td>
            </tr>";
            echo "<tr>
                <td>Address</td>
                <td>".$person->getAddress()."</td>
            </tr>";
        }

        ?>

        </table>

	</body>
</html>