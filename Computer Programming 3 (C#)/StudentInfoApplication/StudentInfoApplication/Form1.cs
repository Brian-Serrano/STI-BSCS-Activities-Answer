using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;
using StudentNamespace;

namespace StudentInfoApplication
{
    public partial class frmStudentInfo : Form
    {
        public frmStudentInfo()
        {
            InitializeComponent();
        }

        private void btnSubmit_Click(object sender, EventArgs e)
        {
            StudentInfo student = new StudentInfo(txtStudentID.Text, txtFirstName.Text, txtLastName.Text);

            lbStudentID.Items.Add(student.StudentID);
            lbLastName.Items.Add(student.FirstName);
            lbFirstName.Items.Add(student.LastName);
        }
    }
}
