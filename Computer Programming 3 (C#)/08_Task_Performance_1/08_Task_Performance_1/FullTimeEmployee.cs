using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace _08_Task_Performance_1
{
    internal class FullTimeEmployee : Employee
    {
        private double monthlySalary;

        public void setMonthlySalary(double monthlySalary)
        {
            this.monthlySalary = monthlySalary;
        }

        public double getMonthlySalary()
        {
            return monthlySalary;
        }
    }
}
