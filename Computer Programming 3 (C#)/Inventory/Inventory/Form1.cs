using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Text.RegularExpressions;
using System.Threading.Tasks;
using System.Windows.Forms;

namespace Inventory
{
    public partial class frmAddProduct : Form
    {
        private int _Quantity;
        private double _SellPrice;
        private string _ProductName, _Category, _MfgDate, _ExpDate, _Description;

        private BindingSource showProductList;

        private void frmAddProduct_Load(object sender, EventArgs e)
        {
            string[] ListOfProductCategory = new string[]
            {
                "Beverages", "Bread/Bakery", "Canned/Jarred Goods", "Dairy", "Frozen Foods", "Meat", "Personal Care", "Other"
            };

            foreach(string lopc in ListOfProductCategory)
            {
                cbCategory.Items.Add(lopc);
            }
        }

        private void btnAddProduct_Click(object sender, EventArgs e)
        {
            try
            {
                _ProductName = Product_Name(txtProductName.Text);
            }
            catch (StringFormatException ex)
            {
                MessageBox.Show("Message: " + ex.Message);
                return;
            }
            _Category = cbCategory.Text;
            _MfgDate = dtPickerMfgDate.Value.ToString("yyyy-MM-dd");
            _ExpDate = dtPickerExpDate.Value.ToString("yyyy-MM-dd");
            _Description = richTxtDescription.Text;
            try
            {
                _Quantity = Quantity(txtQuantity.Text);
            }
            catch (NumberFormatException ex)
            {
                MessageBox.Show("Message: " + ex.Message);
                return;
            }
            try
            {
                _SellPrice = SellingPrice(txtSellPrice.Text);
            }
            catch (CurrencyFormatException ex)
            {
                MessageBox.Show("Message: " + ex.Message);
                return;
            }
            showProductList.Add(new ProductClass(_ProductName, _Category, _MfgDate,
            _ExpDate, _SellPrice, _Quantity, _Description));
            gridViewProductList.AutoSizeColumnsMode = DataGridViewAutoSizeColumnsMode.Fill;
            gridViewProductList.DataSource = showProductList;
        }

        public frmAddProduct()
        {
            InitializeComponent();

            showProductList = new BindingSource();
        }

        public string Product_Name(string name)
        {
            if (!Regex.IsMatch(name, @"^[a-zA-Z]+$"))
                throw new StringFormatException("Not valid string");
            return name;
        }
        public int Quantity(string qty)
        {
            if (!Regex.IsMatch(qty, @"^[0-9]"))
                throw new NumberFormatException("Not valid number");
            return Convert.ToInt32(qty);
        }
        public double SellingPrice(string price)
        {
            if (!Regex.IsMatch(price.ToString(), @"^(\d*\.)?\d+$"))
                throw new CurrencyFormatException("Not valid currency");
            return Convert.ToDouble(price);
        }
    }

    class NumberFormatException : Exception
    {
        public NumberFormatException(string message) : base(message) { }
    }

    class StringFormatException : Exception
    {
        public StringFormatException(string message) : base(message) { }
    }

    class CurrencyFormatException : Exception
    {
        public CurrencyFormatException(string message) : base(message) { }
    }
}
