import java.util.*;
public class PROGRAM_5_Discount
{
    public void main()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Cost Price");
        int cp = sc.nextInt();
        double d = 0.0, net = 0.0;
        if (cp<=2000)
        {
            d = 5.0*100.0/cp;
            System.out.println("Calculator");
        }
        else if (2000 < cp <= 5000)
        {
            d = 10.0*100.0/cp;
            System.out.println("School Bag");
        }
        else if(cp>=5001 && cp<=10000)
        {
            d = 14.0*100.0/cp;
            System.out.println("Wrist Watch");
        }
        else
        {
            d = 20.0*100.0/cp;
            System.out.println("Electric Iron");
        }
    }
}
