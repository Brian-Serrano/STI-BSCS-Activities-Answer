public class MyProgram {
    public static void main(String[] args) {
        String employee_name = "Jess Diaz";
        double gross_pay = 25000;
        double withholding_tax = gross_pay * 0.15;
        double sss_contribution = gross_pay * 0.0363;
        double medicare = gross_pay * 0.0125;
        double pagibig = 100.00;
        double net_pay = gross_pay - withholding_tax - sss_contribution - medicare - pagibig;
        System.out.println ("Employee Name:        " + employee_name);
        System.out.println ("Gross Pay:            " + gross_pay);
        System.out.println ("_________________________________");
        System.out.println ("Deductions            Amount");
        System.out.println ("Witholding Tax:       " + withholding_tax);
        System.out.println ("SSS Contribution:     " + sss_contribution);
        System.out.println ("Medicare:             " + medicare);
        System.out.println ("Pagibig Contribution: " + pagibig);
        System.out.println ("_________________________________");
        System.out.println ("Net Pay:              " + net_pay);
    }
}
