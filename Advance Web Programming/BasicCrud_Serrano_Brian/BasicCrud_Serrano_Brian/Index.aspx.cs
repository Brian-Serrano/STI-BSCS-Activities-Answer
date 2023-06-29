using System;
using System.Collections.Generic;
using System.Data.SqlClient;
using System.Diagnostics;
using System.Linq;
using System.Web;
using System.Web.UI;
using System.Web.UI.WebControls;

namespace BasicCrud_Serrano_Brian
{
    public partial class Index : System.Web.UI.Page
    {
        protected void Page_Load(object sender, EventArgs e)
        {
            using (DB_UserAccountsEntities context = new DB_UserAccountsEntities())
            {
                GridView1.DataSource = context.tbl_employeeInfo.ToList();
                GridView1.DataBind();
                SubmitButton.Text = "Add User";
            }
        }

        protected void SubmitButton_Click(object sender, EventArgs e)
        {
            using (DB_UserAccountsEntities context = new DB_UserAccountsEntities())
            {
                if (Convert.ToBoolean(ViewState["Mode"]))
                {
                    tbl_employeeInfo entity = context.tbl_employeeInfo.Find(Convert.ToInt32(ViewState["Id"]));
                    entity.last_name = last_name.Text;
                    entity.first_name = first_name.Text;
                    entity.age = Convert.ToInt32(age.Text);
                    entity.birthday = Convert.ToDateTime(birthday.Text);
                    entity.contact_number = contact_number.Text;
                    entity.address = address.Text;
                }
                else
                {
                    context.tbl_employeeInfo.Add(new tbl_employeeInfo { last_name = last_name.Text, first_name = first_name.Text, age = Convert.ToInt32(age.Text), birthday = Convert.ToDateTime(birthday.Text), contact_number = contact_number.Text, address = address.Text });
                }
                context.SaveChanges();
                Response.Redirect(Request.RawUrl);
            }
            
        }

        protected void GridView1_RowCommand(object sender, GridViewCommandEventArgs e)
        {
            int rowIndex = Convert.ToInt32(e.CommandArgument);
            using (DB_UserAccountsEntities context = new DB_UserAccountsEntities())
            {
                tbl_employeeInfo entity = context.tbl_employeeInfo.Find(Convert.ToInt32(GridView1.Rows[rowIndex].Cells[2].Text));

                if (e.CommandName == "StupidWebForm")
                {
                    last_name.Text = entity.last_name;
                    first_name.Text = entity.first_name;
                    age.Text = entity.age.ToString();
                    birthday.Text = entity.birthday.ToString("yyyy-MM-dd");
                    contact_number.Text = entity.contact_number;
                    address.Text = entity.address;
                    ViewState["Mode"] = true;
                    ViewState["Id"] = entity.Id;
                    SubmitButton.Text = "Update User";
                }
                if(e.CommandName == "Delete")
                {
                    context.tbl_employeeInfo.Remove(entity);
                    context.SaveChanges();
                    Response.Redirect(Request.RawUrl);
                }
            }
        }
    }
}