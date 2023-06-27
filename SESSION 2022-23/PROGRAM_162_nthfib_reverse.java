public class PROGRAM_162_nthfib_reverse
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
    public void main(int n)
    {
        int i;
        for (i = n; i>=1; i--)
            System.out.println(nthfib(i));
    }
}
