public class PROGRAM_63_Simultanious_Eq
{
    public static void main (int a, int b, int m, int c, int d, int n)
    {
        m = -m; n = -n;
        double x = ((b*n) - (d*m)) / ((a*d) - (c*b));
        double y = ((m*c) - (n*a)) / ((a*d) - (c*b));
        System.out.println("x = "+x);
        System.out.println("y = "+y);
    }
}
