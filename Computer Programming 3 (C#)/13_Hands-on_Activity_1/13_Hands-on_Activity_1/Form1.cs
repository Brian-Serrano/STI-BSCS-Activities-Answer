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
    public partial class FrmClubRegistration : Form
    {
        private ClassRegistrationQuery classRegistrationQuery;
        private int ID, Age, count = 1;
        private string FirstName, MiddleName, LastName, Gender, Program;
        private long StudentId;

        private void btnUpdate_Click(object sender, EventArgs e)
        {
            FrmUpdateMember update = new FrmUpdateMember(classRegistrationQuery);
            update.ShowDialog();
        }

        private void btnRefresh_Click(object sender, EventArgs e)
        {
            RefreshListOfClubMembers();
        }

        private void btnRegister_Click(object sender, EventArgs e)
        {
            StudentId = long.Parse(txtStudentID.Text);
            FirstName = txtFirstName.Text;
            MiddleName = txtMiddleName.Text;
            LastName = txtLastName.Text;
            Age = int.Parse(txtAge.Text);
            Gender = cbGender.SelectedItem.ToString();
            Program = cbProgram.SelectedItem.ToString();
            classRegistrationQuery.RegisterStudent(RegistrationID(), StudentId, FirstName, MiddleName, LastName, Age, Gender, Program);
        }

        private void FrmClubRegistration_Load(object sender, EventArgs e)
        {
            classRegistrationQuery = new ClassRegistrationQuery();
            RefreshListOfClubMembers();
        }

        public FrmClubRegistration()
        {
            InitializeComponent();
        }

        public void RefreshListOfClubMembers()
        {
            classRegistrationQuery.DisplayList();
            dgvClubMembers.DataSource = classRegistrationQuery.bindingSource;
        }

        public int RegistrationID()
        {
            ID = classRegistrationQuery.GetLargestValueID();
            return ID + count;
        }
    }
}
