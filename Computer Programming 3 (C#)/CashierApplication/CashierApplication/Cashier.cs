using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace UserAccountNamespace
{
    internal class Cashier : UserAccount
    {
        private string department;

        public Cashier(string name, string department, string uName, string password) : base(name, uName, password)
        {
            this.department = department;
        }

        public override bool validateLogin(string uName, string password)
        {
            return user_name.Equals(uName) && user_password.Equals(password);
        }

        public string getDepartment()
        {
            return department;
        }
    }
}
