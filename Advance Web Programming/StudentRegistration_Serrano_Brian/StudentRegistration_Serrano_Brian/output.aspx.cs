using System;
using System.Collections.Generic;
using System.Linq;
using System.Web;
using System.Web.UI;
using System.Web.UI.WebControls;

namespace StudentRegistration_Serrano_Brian
{
    public partial class WebForm2 : System.Web.UI.Page
    {
        protected void Page_Load(object sender, EventArgs e)
        {
            Student student = Session["Student"] as Student;
            output.Text = "Student ID: " + student.student_id + ", Name: " + student.first_name + " " + student.middle_name + " " +
                student.last_name + ", Age: " + student.age + ", Address: " + student.address + ", Year and Section: " + student.year + 
                " - " + student.section;
        }
    }
}