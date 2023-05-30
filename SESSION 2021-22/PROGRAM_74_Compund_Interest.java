public class PROGRAM_74_Compund_Interest
{
    public static void main(int p, int r, int n)
    {
        int amt = p * (int)Math.pow((1+r/100), n);
        int ci = amt - p;
        System.out.println("Final Amount = " + amt);
        System.out.println("Compund Interest = " + ci);
    }
}
