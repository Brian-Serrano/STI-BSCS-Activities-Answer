using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.IO;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;

namespace FrmRegistration
{
    public partial class FrmRegistration : Form
    {
        public FrmRegistration()
        {
            InitializeComponent();
        }

        private void btnRegister_Click(object sender, EventArgs e)
        {
            string docPath = Environment.GetFolderPath(Environment.SpecialFolder.MyDocuments);
            using (StreamWriter outputFile = new StreamWriter(Path.Combine(docPath, txtStudentNo.Text + ".txt")))
            {
                outputFile.WriteLine("Student No.: " + txtStudentNo.Text);
                outputFile.WriteLine("Full Name: " + txtLastName.Text + ", " + txtFirstName.Text + ", " + txtMI.Text);
                outputFile.WriteLine("Program: " + cbProgram.SelectedItem.ToString());
                outputFile.WriteLine("Gender: " + cbGender.SelectedItem.ToString());
                outputFile.WriteLine("Age: " + txtAge.Text);
                outputFile.WriteLine("Birthday: " + dtpBirthday.Text);
                outputFile.WriteLine("Contact No.: " + txtContactNo.Text);
            }
        }

        private void btnRecords_Click(object sender, EventArgs e)
        {
            FrmStudentRecord record = new FrmStudentRecord();
            record.ShowDialog();
        }
    }
}
