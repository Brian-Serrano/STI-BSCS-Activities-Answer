using System;
using System.Collections.Generic;
using System.Linq;
using System.Web;
using System.Web.UI;
using System.Web.UI.WebControls;

namespace StudentRegistration_Serrano_Brian
{
    public partial class WebForm1 : System.Web.UI.Page
    {
        protected void Page_Load(object sender, EventArgs e)
        {

        }
        protected void MyButton_Click(object sender, EventArgs e)
        {
            try
            {
                Student student = new Student(long.Parse(student_id.Text), first_name.Text, last_name.Text, middle_name.Text, address.Text, section.Text, Int32.Parse(age.Text), Int32.Parse(year.Text));
                Session["Student"] = student;
                Response.Redirect("output.aspx");
            }
            catch(Exception ex)
            {
                error.Text = ex.Message;
            }
        }
    }
}