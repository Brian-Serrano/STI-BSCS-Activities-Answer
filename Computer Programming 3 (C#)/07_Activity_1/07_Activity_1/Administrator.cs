using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace UserNamespace
{
    internal class Administrator : User
    {
        private string admin_name;

        public Administrator(string name, string id, string pass) : base(id, pass)
        {
            admin_name = name;
        }

        public override void updatePassword(string newPassword)
        {
            user_password = newPassword;
        }

        public void updateAdminName(string name)
        {
            admin_name = name;
        }

        public string Admin_Name
        {
            get { return admin_name; }
            set { admin_name = value; }
        }
    }
}
