using System;
using System.Collections.Generic;
using System.Linq;
using System.Web;

namespace MVCDemo_Serrano_Brian.Models
{
    public class User
    {
        public string LastName { get; set; }
        public string FirstName { get; set; }
        public int Age { get; set; }
        public string Address { get; set; }
        public string ContactNo { get; set; }
        public string Username { get; set; }
        public string Password { get; set; }
    }
}