using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading;
using System.Threading.Tasks;

namespace ThreadCS
{
    internal static class CSThread
    {
        public static void Loop(int number, int sleepTime)
        {
            for(int i = 1; i <= number; i++)
            {
                Thread.Sleep(sleepTime);
                if (i == number)
                {
                    Console.WriteLine(Thread.CurrentThread.Name + " Aborted");
                    Thread.CurrentThread.Abort();
                }
                Console.WriteLine("----------" + Thread.CurrentThread.Name + "----------");
                Console.WriteLine(Thread.CurrentThread.Priority);
                Console.WriteLine(Thread.CurrentThread.IsAlive);
                Console.WriteLine(i);
            }
        }
    }
}
