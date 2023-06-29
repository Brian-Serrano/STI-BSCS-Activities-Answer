using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;
using UserAccountNamespace;

namespace CashierApplication
{
    public partial class frmLoginAccount : Form
    {
        private frmPurchaseDiscountedItem purchaseItem;
        private Cashier cashier;

        public frmLoginAccount()
        {
            InitializeComponent();
            cashier = new Cashier("Rey Acoba", "STI College Laoag", "ReyKalbu", "kalbu123");
        }

        private void button1_Click(object sender, EventArgs e)
        {
            if(cashier.validateLogin(textBox1.Text, textBox2.Text))
            {
                MessageBox.Show("Welcome " + cashier.getFullName() + " of " + cashier.getDepartment());
                Hide();
                purchaseItem = new frmPurchaseDiscountedItem();
                purchaseItem.Show();
            }
            else
            {
                MessageBox.Show("Wrong Credentials");
            }
        }
    }
}
