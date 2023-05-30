public class PROGRAM_110
{
    public static void main(int b, int a)
    {
        int quot = 0;
        while (b>=a)
        {
            b = b-a;
            quot++;
        }
        System.out.println("Quotient" + quot);
        System.out.println("Remainder" + b);
    }
}
