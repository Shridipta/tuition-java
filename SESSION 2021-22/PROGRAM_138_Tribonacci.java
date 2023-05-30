import java.util.*;
public class PROGRAM_138_Tribonacci
{
    public static void main(int n)
    {
        int a = 1, b = 0, c = 0, d;
        System.out.println(b);
        System.out.println(c);
        for (int i = 1; i<=n-2; i++)
        {
            d = a+b+c;
            a = b;
            b = c;
            c = d;
            System.out.println(d);
        }
    }
}
