import java.util.*;
public class REVISION_PROG_8
{
    public static void main(int num)
    {
        int c=0, copy=num, m, l, f;
        while(copy>0)
        {
            c+=1;
            copy/=10;
        }
        f = num/ (int)Math.pow(10, c-1);
        m= num% (int)Math.pow(10, c-1);
        m = m*10+f;
        System.out.println("Result = "+m);
    }
}
