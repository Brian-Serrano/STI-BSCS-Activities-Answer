using System;
using System.Collections.Generic;
using System.Linq;
using System.Web;
using System.Web.UI;
using System.Web.UI.WebControls;

namespace Reservation_Serrano_Brian
{
    public partial class output : System.Web.UI.Page
    {
        protected void Page_Load(object sender, EventArgs e)
        {
            Guest guest = Session["Guest"] as Guest;
            full_name.Text = "Full Name: " + guest.fn;
            address.Text = "Address: " + guest.ad;
            id_type.Text = "ID Type: " + guest.idt;
            id_number.Text = "ID Number: " + guest.idn;
            room_number.Text = "Room Number: " + guest.rn;
            in_out.Text = "Date in and Date out: " + guest.io;
            rate.Text = "Rate/Period: " + guest.rp;
            charges.Text = "Total Charges: " + guest.tc;
        }
    }
}