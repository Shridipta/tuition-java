public class PROGRAM_66_X_Power_N
{
    public void main(int x, int n)
    {
        int i, sign;
        double prod = 1.0;
        for (i = 1; i<=Math.abs(n); i++)
            prod *= x;
        if (n < 0.0)
            prod = 1.0 / prod;
        System.out.println("Exponentiated result = "+prod);
    }
}
