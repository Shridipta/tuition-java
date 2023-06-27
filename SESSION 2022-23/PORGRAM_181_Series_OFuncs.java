import java.util.*;
public class PORGRAM_181_Series_OFuncs
{
    public void main()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of x");
        int x = sc.nextInt();
        System.out.println("Enter the limit");
        int n = sc.nextInt();
        series(x, n);
        System.out.println("Enter the limit for Second Series");
        series(x);
    }

    void series(int x, int n)
    {
        int i, sign=1;
        double sum=0, term;
        for (i=1;i<=n;i++)
        {
            term = Math.pow(x, i)/(i+1);
            sum+=term*sign;
            sign*=-1;
        }
        System.out.println("Sum = "+sum);
    }
    void series(int n)
    {
        int a = 1, b=0, c = 0, i;
        for(i=1;i<=n;i++)
        {
            c=2*b+a;
            System.out.println(c);
            a=b;b=c;
        }
    }
}
