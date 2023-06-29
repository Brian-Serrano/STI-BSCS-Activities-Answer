using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace ItemNamespace
{
    internal abstract class Item
    {
        protected string item_name;
        protected double item_price;
        protected int item_quantity;
        private double total_price;

        public Item(string name, double price, int quantity)
        {
            item_name = name;
            item_price = price;
            item_quantity = quantity;
        }

        public abstract double getTotalPrice();
        public abstract void setPayment(double amount);

        public double Total_Price
        {
            get { return total_price; }
            set { total_price = value; }
        }

        public string Item_Name
        {
            get { return item_name; }
            set { item_name = value; }
        }

        public double Item_Price
        {
            get { return item_price; }
            set { item_price = value; }
        }

        public int Item_Quantity
        {
            get { return item_quantity; }
            set { item_quantity = value; }
        }
    }
}
