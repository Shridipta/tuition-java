public class PROGRAM_121_Octal_Dec
{
    public static void main(int n)
    {
        int c = 0, d, dec = 0;
        while (n>0)
        {
            d = n%10;
            dec+=d*Math.pow(8, c);
            c++;
            n = n/10;
        }
        System.out.println("Decimal = "+dec);
    }
}
