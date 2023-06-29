using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace ComputeAverageApp
{
    internal class ComputeAverageProgram
    {
        static void Main(string[] args)
        {
            Console.WriteLine("Enter 5 grades seperated by new line:");
            int[] grades = new int[5];
            double sum = 0;
            for(int i=0; i<5; i++)
            {
                grades[i] = Convert.ToInt32(Console.ReadLine());
                sum += grades[i];
            }
            double average = sum / 5;
            Console.WriteLine("The average is " + average + " and round off to " + (int)(average));
            Console.WriteLine("Press any key to exit.....");
            Console.ReadLine();
        }
    }
}
