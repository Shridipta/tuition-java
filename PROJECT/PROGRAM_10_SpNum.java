import java.util.*;
public class PROGRAM_10_SpNum
{
    public static void main()
    { 
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), copy = n, d, prod = 1, sum = 0;
        while (copy>0)
        {
            d = copy%10;
            sum+=d;
            prod*=d;
            copy = copy/10;
        }
        if (n == (sum+prod))
        {
            System.out.println("Sp");
        }
        else 
            System.out.println("Not Sp");
    }
}
