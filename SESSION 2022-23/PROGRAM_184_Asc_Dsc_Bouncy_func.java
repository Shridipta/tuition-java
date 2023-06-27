import java.util.*;
public class PROGRAM_184_Asc_Dsc_Bouncy_func
{
    public static void main()
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println();
    }

    int countDigit(int n)
    {
        int c =0, d;
        while(n>0)
        {
            d=n%10;
            c++;
            n/=10;
        }
        return c;
    }

    void checkNum(int num)
    {
        int d1, d2, c=countDigit(num), asc=0, dsc=0;
        d1 = num%10; num/=10;
        while(num>0)
        {
            d2 = num%10;
            if(d1>d2)
            {
                asc++;
            }
            else if (d1<d2)
                dsc++;
        }
        if(c==asc)
            System.out.println("Ascending");
        else if (c==dsc)
            System.out.println("Descending");
        else
            System.out.println("Bouncy");
    }
}