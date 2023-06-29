using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace _05_Quiz_1
{
    internal class Program
    {
        static void Main(string[] args)
        {
            Console.WriteLine(GetSum(5));
            Console.WriteLine(GetSum(5, 3));
            Console.WriteLine(GetSum(5.0, 6.0));

            PrintEmployees();
            Console.ReadLine();
        }

        private static int GetSum(int num)
        {
            return num + num;
        }

        private static int GetSum(int num1, int num2)
        {
            return num1 + num2;
        }

        private static double GetSum(double num1, double num2)
        {
            return num1 + num2;
        }

        private struct Employee
        {
            public int employeeID;
            public string firstName;
            public string lastName;
            public string position;
        }

        private static Employee empOne()
        {
            return new Employee
            {
                employeeID = 123456,
                firstName = "Reina",
                lastName = "Domingo",
                position = "Instructor"
            };
        }

        private static Employee empTwo()
        {
            return new Employee
            {
                employeeID = 654321,
                firstName = "Rey",
                lastName = "Acoba",
                position = "Academic Head"
            };
        }

        private static void PrintEmployees()
        {
            Console.WriteLine("Employee 1");
            Console.WriteLine("Employee ID: " + empOne().employeeID);
            Console.WriteLine("First Name: " + empOne().firstName);
            Console.WriteLine("Last Name: " + empOne().lastName);
            Console.WriteLine("Position: " + empOne().position);

            Console.WriteLine("Employee 2");
            Console.WriteLine("Employee ID: " + empTwo().employeeID);
            Console.WriteLine("First Name: " + empTwo().firstName);
            Console.WriteLine("Last Name: " + empTwo().lastName);
            Console.WriteLine("Position: " + empTwo().position);
        }
    }
}
