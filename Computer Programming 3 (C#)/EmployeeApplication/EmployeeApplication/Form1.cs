using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;
using EmployeeNamespace;

namespace EmployeeApplication
{
    public partial class frmEmployeeDatabase : Form
    {
        private DataTable table;
        public frmEmployeeDatabase()
        {
            InitializeComponent();

            table = new DataTable();
            table.Columns.Add("id", typeof(long));
            table.Columns.Add("firstName", typeof(string));
            table.Columns.Add("lastName", typeof(string));
            table.Columns.Add("position", typeof(string));

            dgvEmployee.DataSource = table;
        }

        private void button1_Click(object sender, EventArgs e)
        {
            Employee employee = new Employee(long.Parse(txtEmployeeID.Text), txtFirstName.Text, txtLastName.Text, txtPosition.Text);

            table.Rows.Add(employee.EmployeeID, employee.FirstName, employee.LastName, employee.Position);
        }
    }
}
