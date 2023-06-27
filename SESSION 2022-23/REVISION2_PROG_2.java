import java.util.*;
public class REVISION2_PROG_2
{
   public static void main(int n)
    { 
        int i, j, a = 1, b = 0, c;
        for (i = 1; i<=n;)
        {
            c = a+b;
            for (j = b+1; j<c ;j++)
                if (i<=n)
                {
                    System.out.print(j + " ");
                    i++;
                }
            a = b;b = c;
        }
    }
}
