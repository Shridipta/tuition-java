public class PROGRAM_141_RoundToNthDecimal
{
    public static void main(double num, int n)
    {
        double pow = Math.pow(10, n+1);
        int d = (int) num%10;
        num = num*pow;
        num = ((int) num/10);
        if (d>=5)
            num = num+1;
        num = num/pow*10;
        System.out.println(num);
    }
}
