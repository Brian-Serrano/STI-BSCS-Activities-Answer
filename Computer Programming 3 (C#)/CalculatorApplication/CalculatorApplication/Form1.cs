using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;

namespace CalculatorApplication
{
    public partial class FrmCalculator : Form
    {
        private CalculatorClass cal;
        private double num1 = 0;
        private double num2 = 0;
        private Formula<double> method;

        public FrmCalculator()
        {
            InitializeComponent();
            cal = new CalculatorClass();
            cbOperator.SelectedItem = cbOperator.Items[0];
        }

        private void btnEqual_Click(object sender, EventArgs e)
        {
            num1 = double.Parse(!string.IsNullOrEmpty(txtBoxInput1.Text) ? txtBoxInput1.Text : "0");
            num2 = double.Parse(!string.IsNullOrEmpty(txtBoxInput2.Text) ? txtBoxInput2.Text : "0");

            switch (cbOperator.SelectedItem.ToString())
            {
                case "+":
                    method = cal.GetSum;
                    break;
                case "-":
                    method = cal.GetDifference;
                    break;
                case "*":
                    method = cal.GetProduct;
                    break;
                case "/":
                    method = cal.GetQuotient;
                    break;
            }
            cal.CalculateEvent += new Formula<double>(method);
            lblDisplayTotal.Text = cal.formula(num1, num2).ToString();
            cal.CalculateEvent -= new Formula<double>(method);
        }
    }
}
