using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace StudentNamespace
{
    internal class StudentInfo
    {
        private string studentID;
        private string firstName;
        private string lastName;

        public StudentInfo()
        {
            studentID = "";
            firstName = "";
            lastName = "";
        }

        public StudentInfo(string studentID, string firstName, string lastName)
        {
            this.studentID = studentID;
            this.firstName = firstName;
            this.lastName = lastName;
        }

        public string StudentID
        {
            get { return studentID; }
            set { this.studentID = value; }
        }

        public string FirstName
        {
            get { return firstName; }
            set { this.firstName = value; }
        }

        public string LastName
        {
            get { return lastName; }
            set { this.lastName = value; }
        }
    }
}
