using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;

namespace StudentGradeApplication
{
    public partial class frmStudentGradeProgram : Form
    {
        public frmStudentGradeProgram()
        {
            InitializeComponent();
        }

        private void button1_Click(object sender, EventArgs e)
        {
            String name = textBox1.Text;
            int grade1 = int.Parse(textBox2.Text);
            int grade2 = int.Parse(textBox3.Text);
            int grade3 = int.Parse(textBox4.Text);
            int grade4 = int.Parse(textBox5.Text);
            int grade5 = int.Parse(textBox6.Text);
            double average = (double)(grade1 + grade2 + grade3 + grade4 + grade5) / 5;
            if(average > 75)
            {
                label8.Text = "The student passed.";
            } else
            {
                label8.Text = "The student failed.";
            }
            label9.Text = "The general average of " + name + " is " + average;
        }
    }
}
