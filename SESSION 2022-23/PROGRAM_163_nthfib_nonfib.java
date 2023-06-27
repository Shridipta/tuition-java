import java.util.*;
public class PROGRAM_163_nthfib_nonfib
{
    public int nthfib(int n)
    {
        int a=1, b=0, c=0, i;
        for (i=1; i<=n; i++)
        {
            c=a+b;
            a=b; b=c;
        }
        return c;
    }
    // public void main(int n)
    // {
        // int i, c=0, k=0;
        // while(true)
        // {
            // for(i = nthfib(k)+1; i<nthfib(k+1); i++)
            // {
                // if (c<n)
                // {
                    // System.out.println(i);
                    // c++;
                // }
                // else
                    // return;
            // }
            // k++;
        // }
    // }
    public void main(int n)
    {
        int i, c=0, k=1;
        while(c<n)
        {
            k++;
            for(i = nthfib(k)+1; i<nthfib(k+1); i++)
            {
                if (c<n)
                {
                    System.out.println(i);
                    c++;
                }
            }
        }
    }
}
