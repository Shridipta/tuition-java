public class good_approz
{
    public static void main (int n)
    {
        int i = 1, k, j, l, p, q; 
        double term, sum = 0, pi = Math.PI;
        for (k = 1; k <= n;)
        {
            j = 1; l = 1;
            for (p = 1; p <= k; p++)
                j*=p;
            for (q = 1; q <= i; l+=2)
                l*=q;
            term = 2* (j/l);
            sum += term;
            i+=2;
        }
        System.out.println(sum);
    }
}