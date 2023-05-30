public class PROGRAM_124_firstLastdigit
{
    public static void main(int n)
    {
        for(int i = (int)Math.pow(10, n-1); i<= (int)Math.pow(10, n); i++)
        {
            int l = i %10;
            int f=  i/(int)Math.pow(10, n-1);
            if (l == f)
                System.out.println(i);
        }
    }
}
