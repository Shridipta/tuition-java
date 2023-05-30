public class PROGRAM_119_UniqueNum
{
    public static void main(int num)
    {
        int i, copy,d, c;
        for (i = 0; i<=9; i++)
        {
            copy = num;
            c = 0;
            while (copy>0)
            {
                d = copy%10;
                if (d == i)
                    c++;
                copy = copy/10;
            }
            if (c>1)
            {
                System.out.println("Not an Unique Number");
                return;
            }
        }
        System.out.println("Unique Number");
    }
}
