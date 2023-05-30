public class PROGRAM_120_RemDigit
{
    public static void main(int num, int c)
    {
        int rev = 0, d, s = 0;
        while (num>0)
        {
            d = num%10;
            if (d != c)
                s=s*10+d;
            num = num/10;
        }
        while (s>0)
        {
            d = s%10;
            rev = rev*10+d;
            s = s/10;
        }
        System.out.println(rev);
    }
}
