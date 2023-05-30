import java.util.*;
public class projprog_2
{
    public static void main (String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the basic pay");
        double basic_pay, d_allow, hr_allow, prov_fund, net_pay, gross_pay;
        basic_pay = sc.nextDouble();
        d_allow = 25 * basic_pay / 100.0;
        hr_allow = 15 * basic_pay / 100.0;
        prov_fund = 8.33 * basic_pay / 100.0;
        net_pay = basic_pay + d_allow + hr_allow;
        gross_pay = net_pay - prov_fund;

        /*
        Dearness Allowance = 25% of basic pay
         House Rent Allowance = 15% of basic pay
         Provident Fund = 8.33% of basic pay
         Net Pay = Basic Pay + Dearness Allowance + House Rent Allowance
         Gross pay = Net pay – Provident Fund*/

    }
}
