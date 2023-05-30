public class PROGRAM_116_Triangular
{
    public static void main(int n)
    {
        int s = 0;
        for (int i = 1;s<=n;i++)
        {
            s += i;
            System.out.println(s);
            if (s==n)
            {
                System.out.println("Triangular Number");
                break;
            }
            else if (s>n)
            {
                System.out.println("Not a Triangular Number");
            }
        }

    }
}
