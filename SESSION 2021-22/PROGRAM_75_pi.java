public class PROGRAM_75_pi
{
    public static void main(int n)
    {
        int i, sign = 1; 
        double term, sum1 = 0, pi = Math.PI;
        for (i = 1; i <= 2*n;)
        {
            term = sign * (4.0/ i);
            sum1 += term;
            sign *= -1;
            i += 2;
        }
        sign = 1; n = n+5000;
        double sum2 = 0;
        for (i = 1; i <= 2*n;)
        {
            term = sign * (4.0/ i);
            sum2 += term;
            sign *= -1;
            i += 2;
        }
        System.out.println("Actual value of Pi = "+ pi);
        System.out.println("1st Approx. value of Pi = "+ sum1);
        System.out.println("1st Calculated value vs actual value  = "+ (pi-sum1));
        System.out.println("2nd Approx. value of Pi = "+ sum2);
        System.out.println("2st Calculated value vs actual value  = "+ (pi-sum2));
    }
}