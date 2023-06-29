using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading;
using System.Threading.Tasks;

namespace ThreadCS
{
    internal class Program
    {
        static void Main(string[] args)
        {
            Thread thread1 = new Thread(new ThreadStart(() => CSThread.Loop(10, 500)));
            Thread thread2 = new Thread(new ThreadStart(() => CSThread.Loop(5, 1000)));
            Thread thread3 = new Thread(new ThreadStart(() => CSThread.Loop(3, 1500)));

            thread1.Name = "Thread 1";
            thread2.Name = "Thread 2";
            thread3.Name = "Thread 3";

            thread1.Priority = ThreadPriority.Lowest;
            thread2.Priority = ThreadPriority.Normal;
            thread3.Priority = ThreadPriority.Highest;

            thread1.Start();
            thread1.Join();
            thread2.Start();
            thread2.Join();
            thread3.Start();
            thread3.Join();

            Console.ReadLine();
        }
    }
}
