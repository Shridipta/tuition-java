import java.util.*;
public class REVISION_PROG_1
{
    public static void main()
    {
        int a = 1, b = 0, c, i, sum=0;
        for (i = 1; i <= 10; i++)
        {
            c = a + 2 * b;
            sum+=c;
            System.out.println(c +" ");
            a = b;
            b = c;
        }
        System.out.println("Sum =" + sum);
    }
}
