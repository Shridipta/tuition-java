import java.util.*;
public class PROGRAM_137_RandomHighLow
{
    public static void main(int x, int y, int n)
    {
        int high = (int)(x+(y-x)*Math.random());
        int low = high;
        for (int i = 1; i<=n-2;i++)
        {
            int k = (int)(x+(y-x)*Math.random());
            if (k>high)
                high = k;
            else if(k<low)
                low = k;
        }
        System.out.println("Highest" + high);
        System.out.println("Lowest" + low);
    }
}