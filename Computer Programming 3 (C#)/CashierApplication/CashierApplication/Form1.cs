using ItemNamespace;
using System;
using System.Windows.Forms;

namespace CashierApplication
{
    public partial class frmPurchaseDiscountedItem : Form
    {
        private frmLoginAccount login;
        private DiscountedItem item;

        public frmPurchaseDiscountedItem()
        {
            InitializeComponent();
        }

        private void button2_Click(object sender, EventArgs e)
        {
            item = new DiscountedItem(txtItem.Text, double.Parse(txtPrice.Text), int.Parse(txtQuantity.Text), double.Parse(txtDiscount.Text));
            lblTotalAmountResult.Text = item.getTotalPrice().ToString();
        }

        private void button1_Click(object sender, EventArgs e)
        {
            item.setPayment(double.Parse(txtPaymentReceived.Text));
            lblChangeResult.Text = item.getChange().ToString();
        }

        private void logoutToolStripMenuItem_Click(object sender, EventArgs e)
        {
            Hide();
            login = new frmLoginAccount();
            login.Show();
        }

        private void exitApplicationToolStripMenuItem_Click(object sender, EventArgs e)
        {
            Application.Exit();
        }
    }
}
