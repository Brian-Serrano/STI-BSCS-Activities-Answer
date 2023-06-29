using System;
using System.Collections.Generic;
using System.Linq;
using System.Web;

namespace Reservation_Serrano_Brian
{
    public class Guest
    {
        public string fn;
        public string ad;
        public string idt;
        public string idn;
        public string rn;
        public string io;
        public string rp;
        public string tc;

        public Guest(string fn, string ad, string idt, string idn, string rn, string io, string rp, string tc)
        {
            this.fn = fn;
            this.ad = ad;
            this.idt = idt;
            this.idn = idn;
            this.rn = rn;
            this.io = io;
            this.rp = rp;
            this.tc = tc;
        }
    }
}