import java.util.*;
public class REVISION2_PROG_3
{
    public static void main(int n)
    {
        int copy = n;
        int flag = 0;

        int c = copy%10;
        copy = copy/10;
        while(copy>0)
        {
            int d = copy%10;
            if (c<d)
            {
                flag = 1;
            }
            else{
                c = d;
            }
            copy/=10;
        }
        if (flag == 0)
        {
            System.out.println("ascending");
            return;
        }
        
        copy = n;
        flag = 0;
        c = copy%10;
        copy = copy/10;
        while(copy>0)
        {
            int d = copy%10;
            if (c>d)
            {
                flag = 1;
            }
            else{
                c = d;
            }
            copy/=10;
        }
        if (flag == 0)
        {
            System.out.println("descending");
            return;
        }
        else 
            System.out.println("bouncy");
    }
}
