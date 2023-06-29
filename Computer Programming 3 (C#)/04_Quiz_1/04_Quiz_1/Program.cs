using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace _04_Quiz_1
{
    internal class Program
    {
        static void Main(string[] args)
        {
            string[] classMates = new string[]
            {
                "Joli", "Jonas", "John", "Paolo", "Lester", "Wayne"
            };

            foreach(string c in classMates)
            {
                Console.WriteLine(c);
            }

            string[,] alphabetLetters = new string[,]
            {
                { "A", "B", "C" }, { "D", "E", "F" }
            };

            foreach (string row in alphabetLetters)
            {
                foreach (char c in row)
                {
                    Console.WriteLine(c);
                }
            }

            string helloWorld = "Hello World!";
            Console.WriteLine(helloWorld.Contains("hello"));

            Console.ReadLine();
        }
    }
}
