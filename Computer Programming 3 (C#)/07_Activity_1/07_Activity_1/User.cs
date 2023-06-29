using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace UserNamespace
{
    internal abstract class User
    {
        private string user_id;
        protected string user_password;

        public User(string id, string pass)
        {
            user_id = id;
            user_password = pass;
        }

        public bool verifyLogin(string id, string pass)
        {
            return user_password.Equals(pass) && user_id.Equals(id);
        }

        public abstract void updatePassword(string newPassword);

        public string User_ID
        {
            get { return user_id; }
            set { user_id = value; }
        }

        public string User_Password
        {
            get { return user_password; }
            set { user_password = value; }
        }
    }
}
