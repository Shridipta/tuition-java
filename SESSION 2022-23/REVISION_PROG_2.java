import java.util.*;
public class REVISION_PROG_2
{
    public static void main(int num)
    {
        int h=0, l=9, d;
        while(num>0)
        {
            d = num%10;
            if(d>h)
                h=d;
            if (d<l)
                l=d;
            num/=10;
        }
        System.out.println("highest = "+h);
        System.out.println("Lowest = "+l);
    }
}
