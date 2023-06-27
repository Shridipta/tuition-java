import java.util.*;
public class REVISION_PROG_3
{
    public static void main(int a, int b)
    {
        while(a!=b)
        {
            if (a>b)
                a = a-b;
            if (b>a)
                b=b-a;
        }
        System.out.println("HCF= " + a);
    }
}
