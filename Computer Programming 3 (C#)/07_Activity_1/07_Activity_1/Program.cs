using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using UserNamespace;

namespace _07_Activity_1
{
    internal class Program
    {
        static void Main(string[] args)
        {
            Administrator admin = new Administrator("Rey Acoba", "12345", "rey65");

            Console.WriteLine("Admin Name: " + admin.Admin_Name);
            Console.WriteLine("User ID: " + admin.User_ID);
            Console.WriteLine("User Password: " + admin.User_Password);

            admin.updatePassword("reina55");

            Console.WriteLine("New Password: " + admin.User_Password);

            admin.updateAdminName("Reina Domingo");

            Console.WriteLine("New Admin Name: " + admin.Admin_Name);

            Console.WriteLine("Login Password rey65: " + admin.verifyLogin("12345", "rey65"));
            Console.WriteLine("Login Password reina55: " + admin.verifyLogin("12345", "reina55"));

            Console.ReadLine();
        }
    }
}
