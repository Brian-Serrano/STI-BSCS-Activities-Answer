using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace _04_Hands_on_Activity_2
{
    internal class Program
    {
        static void Main(string[] args)
        {
            Console.Write("Enter the number of apples you want to purchase: ");
            int apples = Convert.ToInt32(Console.ReadLine());
            double price = apples * 32.5;
            Console.WriteLine("The total price of " + apples + " apples is " + price + ",");
            Console.WriteLine("The value of the converted price is " + (int)price);
            Console.ReadLine();
        }
    }
}
