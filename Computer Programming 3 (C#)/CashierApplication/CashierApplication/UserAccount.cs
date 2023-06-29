using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace UserAccountNamespace
{
    internal abstract class UserAccount
    {
        private string full_name;
        protected string user_name;
        protected string user_password;

        public UserAccount(string name, string uName, string password)
        {
            full_name = name;
            user_name = uName;
            user_password = password;
        }

        public abstract bool validateLogin(string uName, string password);

        public string getFullName()
        {
            return full_name;
        }
    }
}
