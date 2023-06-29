using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using EmployeeNamespace;

namespace _06_Quiz_1
{
    internal class CompanyProgram
    {
        public CompanyProgram()
        {
            AccessEmployee();
        }

        public void AccessEmployee()
        {
            Employee empOne = new Employee();

            empOne.EmployeeID = 123456789;
            empOne.FirstName = "Rey";
            empOne.LastName = "Acoba";
            empOne.Position = "Academic Head";

            Console.WriteLine("Employee ID: " + empOne.EmployeeID);
            Console.WriteLine("First Name: " + empOne.FirstName);
            Console.WriteLine("Last Name: " + empOne.LastName);
            Console.WriteLine("Position: " + empOne.Position);

            Employee empTwo = new Employee(987654321, "Reina", "Domingo", "Instructor");

            Console.WriteLine("Employee ID: " + empTwo.EmployeeID);
            Console.WriteLine("First Name: " + empTwo.FirstName);
            Console.WriteLine("Last Name: " + empTwo.LastName);
            Console.WriteLine("Position: " + empTwo.Position);

            Console.ReadLine();
        }
    }
}
