using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace _08_Task_Performance_1
{
    internal class PartTimeEmployee : Employee
    {
        private double ratePerHour;
        private double wage;
        private int hoursWorked;

        public void setWage(double ratePerHour, int hoursWorked)
        {
            this.ratePerHour = ratePerHour;
            this.hoursWorked = hoursWorked;
        }

        public double getWage()
        {
            wage = ratePerHour * hoursWorked;
            return wage;
        }
    }
}
