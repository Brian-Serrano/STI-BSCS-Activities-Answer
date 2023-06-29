using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace DataTypesApp
{
    internal class DataTypesProgram
    {
        static void Main(string[] args)
        {
            Console.Write("Enter the pieces of apple: ");
            int numOfApples = Convert.ToInt32(Console.ReadLine());
            Console.Write("Enter total price of " + numOfApples + " apple(s): ");
            double price = Convert.ToDouble(Console.ReadLine());
            Console.WriteLine("The total price of " + numOfApples + " apple(s) is " + price);
            Console.WriteLine("The value of original price is " + price);
            Console.WriteLine("The value of converted price is " + (int)(price));
            Console.WriteLine("Press any key to exit.....");
            Console.ReadLine();
        }
    }
}
