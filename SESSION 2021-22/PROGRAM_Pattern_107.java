public class PROGRAM_Pattern_107
{
    public static void main(int n)
    {
        int copy, c = 0;
        copy = n;
        while (copy > 0)
        {
            c = c + 1;
            copy = copy / 10;
        }
        while (n > 0)
        {
            System.out.println(n / (int) Math.pow(10,(c - 1)));
            n = n % (int) Math.pow(10, (c - 1));
            c = c - 1;
        }
    }
}
