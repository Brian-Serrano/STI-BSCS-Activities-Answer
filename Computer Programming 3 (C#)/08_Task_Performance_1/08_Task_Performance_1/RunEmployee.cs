using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace _08_Task_Performance_1
{
    internal class RunEmployee
    {
        static void Main(string[] args)
        {
            Console.WriteLine("Enter name: ");
            string name = Console.ReadLine();
            Console.WriteLine("Press F for Full Time or P for Part Time: ");
            char ch = Convert.ToChar(Console.ReadLine());

            if (ch == 'P')
            {
                Console.WriteLine("Enter rate per hour and no of hours worked separated by space: ");
                double rh = Convert.ToDouble(Console.ReadLine());
                int hw = Convert.ToInt32(Console.ReadLine());

                PartTimeEmployee e = new PartTimeEmployee();
                e.setName(name);
                e.setWage(rh, hw);

                Console.WriteLine("Name: " + e.getName());
                Console.WriteLine("Wage: " + e.getWage());
            }
            else if (ch == 'F')
            {
                Console.WriteLine("Enter monthly salary: ");
                double ms = Convert.ToDouble(Console.ReadLine());

                FullTimeEmployee e = new FullTimeEmployee();
                e.setName(name);
                e.setMonthlySalary(ms);

                Console.WriteLine("Name: " + e.getName());
                Console.WriteLine("Monthly Salary: " + e.getMonthlySalary());
            }
            else
            {
                Console.WriteLine("Enter only F or P.");
            }

            Console.ReadLine();
        }
    }
}
