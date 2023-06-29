using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace EmployeeNamespace
{
    internal class Employee
    {
        private long employeeID;
        private string firstName;
        private string lastName;
        private string position;

        public Employee()
        {
            this.employeeID = 0;
            this.firstName = string.Empty;
            this.lastName = string.Empty;
            this.position = string.Empty;
        }

        public Employee(long employeeID, string firstName, string lastName, string position)
        {
            this.employeeID = employeeID;
            this.firstName = firstName;
            this.lastName = lastName;
            this.position = position;
        }

        public long EmployeeID
        {
            get { return employeeID; }
            set { employeeID = value; }
        }

        public string FirstName
        {
            get { return firstName; }
            set { firstName = value; }
        }

        public string LastName
        {
            get { return lastName; }
            set { lastName = value; }
        }

        public string Position
        {
            get { return position; }
            set { position = value; }
        }
    }
}
