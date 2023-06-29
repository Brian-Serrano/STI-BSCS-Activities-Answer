using System;
using System.Collections.Generic;
using System.Linq;
using System.Web;
using System.Web.UI;
using System.Web.UI.WebControls;

namespace Reservation_Serrano_Brian
{
    public partial class _default : System.Web.UI.Page
    {
        protected void Checkout_Click(object sender, EventArgs e)
        {
            Guest guest = new Guest(full_name.Text, address.Text, id_type.Text, id_number.Text,
                room_number.Text, in_out.Text, rate.Text, charges.Text);
            Session["Guest"] = guest;
            Response.Redirect("output.aspx");
        }

        protected void Cancel_Click(object sender, EventArgs e)
        {
            Response.Redirect("default.aspx");
        }
    }
}