import java.util.*;
public class PROGRAM_127_Amicable
{
    public static void main(int a, int b)
    {
        int i, j, c = 0, d = 0;
        for (i = 1; i<a; i++)
            if (a%i == 0)
                c+=i;
        for (j = 1;j<b; j++)
            if(b%j == 0)
                d+=j;
        if (c==b && d ==a)
            System.out.println("Amicable Number");
        else
            System.out.println("Not an Amicable Number");
    }
}
