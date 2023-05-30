public class PROGRAM_binToDec_112
{
    public static void main(int n)
    {
        int c = 0, r = 0;
        while (n>0)
        {
            int d = n%10;
            r = r+ d*(int) Math.pow(2, c);
            c++;
            n = n/10;
        }
        System.out.println("Decimal = " + r);
    }
}
