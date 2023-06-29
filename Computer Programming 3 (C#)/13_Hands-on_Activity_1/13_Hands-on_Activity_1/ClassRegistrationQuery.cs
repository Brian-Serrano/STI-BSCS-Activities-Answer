using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Data.SqlClient;
using System.Data;
using System.Windows.Forms;

namespace _13_Hands_on_Activity_1
{
    public class ClassRegistrationQuery
    {
        private SqlConnection sqlConnect;
        private SqlCommand sqlCommand;
        private SqlDataAdapter sqlAdapter;
        private SqlDataReader sqlReader;
        public DataTable dataTable;
        public BindingSource bindingSource;
        private string connectionString;
        public string _FirstName, _MiddleName, _LastName, _Gender, _Program;
        public int _Age;

        public ClassRegistrationQuery()
        {
            connectionString = "Server=LAPTOP-APKOGHND\\SQLEXPRESS; Initial Catalog=ClubDB; Integrated Security=SSPI;";
            sqlConnect = new SqlConnection(connectionString);
            dataTable = new DataTable();
            bindingSource = new BindingSource();
        }

        public bool DisplayList()
        {
            string ViewClubMembers = "SELECT StudentId, FirstName, MiddleName, LastName, Age, Gender, Program FROM ClubMembers";
            sqlAdapter = new SqlDataAdapter(ViewClubMembers, sqlConnect);
            dataTable.Clear();
            sqlAdapter.Fill(dataTable);
            bindingSource.DataSource = dataTable;
            return true;
        }

        public bool RegisterStudent(int ID, long StudentID, string FirstName, string MiddleName, string LastName, int Age, string Gender, string Program)
        {
            sqlCommand = new SqlCommand("INSERT INTO ClubMembers VALUES(@ID, @StudentID, @FirstName, @MiddleName, @LastName, @Age, @Gender, @Program)", sqlConnect);
            sqlCommand.Parameters.Add("@ID", SqlDbType.Int).Value = ID;
            sqlCommand.Parameters.Add("@RegistrationID", SqlDbType.BigInt).Value = StudentID;
            sqlCommand.Parameters.Add("@StudentID", SqlDbType.VarChar).Value = StudentID;
            sqlCommand.Parameters.Add("@FirstName", SqlDbType.VarChar).Value = FirstName;
            sqlCommand.Parameters.Add("@MiddleName", SqlDbType.VarChar).Value = MiddleName;
            sqlCommand.Parameters.Add("@LastName", SqlDbType.VarChar).Value = LastName;
            sqlCommand.Parameters.Add("@Age", SqlDbType.Int).Value = Age;
            sqlCommand.Parameters.Add("@Gender", SqlDbType.VarChar).Value = Gender;
            sqlCommand.Parameters.Add("@Program", SqlDbType.VarChar).Value = Program;
            sqlConnect.Open();
            sqlCommand.ExecuteNonQuery();
            sqlConnect.Close();
            return true;
        }

        public List<long> GetStudentID()
        {
            string idQuery = "SELECT StudentId FROM ClubMembers";
            sqlCommand = new SqlCommand(idQuery, sqlConnect);
            sqlConnect.Open();

            sqlReader = sqlCommand.ExecuteReader();

            List<long> studentID = new List<long>();

            while (sqlReader.Read())
            {
                studentID.Add(sqlReader.GetInt64(0));
            }

            sqlReader.Close();
            sqlConnect.Close();

            return studentID;
        }

        public bool SetStudentInfo(string studentId)
        {
            string infoQuery = "SELECT FirstName, MiddleName, LastName, Age, Gender, Program FROM ClubMembers WHERE StudentId = " + studentId;
            sqlCommand = new SqlCommand(infoQuery, sqlConnect);
            sqlConnect.Open();

            sqlReader = sqlCommand.ExecuteReader();

            while (sqlReader.Read())
            {
                _FirstName = sqlReader.GetString(0);
                _MiddleName = sqlReader.GetString(1);
                _LastName = sqlReader.GetString(2);
                _Age = sqlReader.GetInt32(3);
                _Gender = sqlReader.GetString(4);
                _Program = sqlReader.GetString(5);
            }

            sqlReader.Close();
            sqlConnect.Close();
            return true;
        }

        public bool UpdateStudent(long studentId, string firstName, string lastName, string middleName, int age, string gender, string program)
        {
            string updateQuery = "UPDATE ClubMembers SET FirstName = '" + firstName + "', LastName = '" + lastName + "', MiddleName = '" + middleName + "', Age = " + age + ", Gender = '" + gender + "', Program = '" + program + "' WHERE StudentId = '" + studentId + "';";

            sqlCommand = new SqlCommand(updateQuery, sqlConnect);

            sqlConnect.Open();
            sqlCommand.ExecuteNonQuery();
            sqlConnect.Close();

            return true;
        }

        public int GetLargestValueID()
        {
            string idQuery = "SELECT MAX(ID) FROM ClubMembers";
            sqlCommand = new SqlCommand(idQuery, sqlConnect);
            sqlConnect.Open();

            int id = (int)sqlCommand.ExecuteScalar();

            sqlConnect.Close();

            return id;
        }
    }
}
