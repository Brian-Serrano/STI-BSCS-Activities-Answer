using System.Web;
using System.Web.Mvc;

namespace MVCDemo_Serrano_Brian
{
    public class FilterConfig
    {
        public static void RegisterGlobalFilters(GlobalFilterCollection filters)
        {
            filters.Add(new HandleErrorAttribute());
        }
    }
}
