using System;
using System.Collections.Generic;
using System.Linq;
using System.Web;

namespace StudentRegistration_Serrano_Brian
{
    public class Student
    {
        public long student_id;
        public string first_name, last_name, middle_name, address, section;
        public int age, year;

        public Student(long si, string fn, string ln, string mn, string ad, string s, int ag, int y)
        {
            student_id = si;
            first_name = fn;
            last_name = ln;
            middle_name = mn;
            address = ad;
            section = s;
            age = ag;
            year = y;
        }
    }
}