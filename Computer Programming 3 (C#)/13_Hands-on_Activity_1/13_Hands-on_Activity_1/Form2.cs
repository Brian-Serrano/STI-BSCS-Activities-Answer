using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;

namespace _13_Hands_on_Activity_1
{
    public partial class FrmUpdateMember : Form
    {
        private ClassRegistrationQuery classRegistrationQuery;

        public FrmUpdateMember(ClassRegistrationQuery classRegistrationQuery)
        {
            InitializeComponent();
            this.classRegistrationQuery = classRegistrationQuery;
        }

        private void FrmUpdateMember_Load(object sender, EventArgs e)
        {
            foreach(long id in classRegistrationQuery.GetStudentID())
            {
                cbStudentID.Items.Add(id);
            }
        }

        private void btnConfirm_Click(object sender, EventArgs e)
        {
            if(classRegistrationQuery.UpdateStudent(long.Parse(cbStudentID.SelectedItem.ToString()), txtFirstName.Text, txtLastName.Text, txtMiddleName.Text, int.Parse(txtAge.Text), cbGender.SelectedItem.ToString(), cbProgram.SelectedItem.ToString()))
            {
                Close();
            }
        }

        private void cbStudentID_SelectedIndexChanged(object sender, EventArgs e)
        {
            classRegistrationQuery.SetStudentInfo(cbStudentID.SelectedItem.ToString());
            txtFirstName.Text = classRegistrationQuery._FirstName;
            txtMiddleName.Text = classRegistrationQuery._MiddleName;
            txtLastName.Text = classRegistrationQuery._LastName;
            txtAge.Text = classRegistrationQuery._Age.ToString();
            cbGender.SelectedItem = classRegistrationQuery._Gender;
            cbProgram.SelectedItem = classRegistrationQuery._Program;
        }
    }
}
