public class PROGRAM_DescendingOrder_111
{
    public static void main(int n)
    {
        int r = 0;
        for (int i = 9; i>=0; i--)
        {
            int copy = n;
            while (copy>0)
            {
                int d = copy%10;
                if (d == i)
                    r = r*10+d;
                copy = copy/10;
            }
        }
        System.out.println("New number" + r);
    }
}
