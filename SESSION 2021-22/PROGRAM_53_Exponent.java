public class PROGRAM_53_Exponent
{
    public void main(int x, int n)
    {
        double term = 1;
        int i;
        for (i = 1; i <= Math.abs(n); i++)
            term *= x;
        if (n < 0)
            term = 1.0 / term;
        System.out.println("Exponentiated Result = " + term);
    }
}
