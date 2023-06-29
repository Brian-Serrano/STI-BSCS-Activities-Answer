using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace ItemNamespace
{
    internal class DiscountedItem : Item
    {
        private double item_discount;
        private double discounted_price;
        private double payment_amount;
        private double change;

        public DiscountedItem(string name, double price, int quantity, double discount) : base(name, price, quantity)
        {
            item_discount = discount;
        }

        public override double getTotalPrice()
        {
            discounted_price = item_price - (item_price * (item_discount * 0.01));
            Total_Price =  item_quantity * (discounted_price);
            return Total_Price;
        }

        public override void setPayment(double amount)
        {
            payment_amount = amount;
            change = payment_amount - Total_Price;
        }

        public double getChange()
        {
            return change;
        }

        public double Item_Discount
        {
            get { return item_discount; }
            set { item_discount = value; }
        }

        public double Discounted_Price
        {
            get { return discounted_price; }
            set { discounted_price = value; }
        }

        public double Payment_Amount
        {
            get { return payment_amount; }
            set { payment_amount = value; }
        }

        public double Change
        {
            get { return change; }
            set { change = value; }
        }
    }
}
