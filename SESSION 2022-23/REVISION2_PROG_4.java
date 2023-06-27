import java.util.*;
public class REVISION2_PROG_4
{
   public static void main()
    {
        int a = 1, b = 0, c, i, count, j;
        for(i = 1; ; )
        {
            c = a+b;
            count = 0;
            for (j = 1; j <= c; j++)
                if (c%j == 0)
                    count++;
            if (count == 2)
            {
                if (c>100)
                    return;
                if (c >10)
                    System.out.println(c + " ");
                i++;
            }
            a = b;
            b = c;
        }
    }
}
