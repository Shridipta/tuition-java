import java.util.Scanner;
public class PROGRAM_59_Income_Tax
{
    public static void main ()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your income = ");
        double income = sc.nextDouble();
        double income_tax;

        if (income <= 250000)
            income_tax = 0;
        else if (income <= 500000)
            income_tax = (10 * (income-250000)/100);
        else if (income <= 1000000)
            income_tax = 10000 + (15 * (income-500000)/100);
        else 
            income_tax = 30000 + (30 * (income-1000000)/100);
        System.out.println("The income tax = (in lakhs)" + income_tax);
    }
}
