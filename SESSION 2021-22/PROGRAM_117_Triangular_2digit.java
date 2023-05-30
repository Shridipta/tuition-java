public class PROGRAM_117_Triangular_2digit
{
    public static void main()
    {
        int s, j, i;
        for (j = 1;j<=100;j++)
        {
            s = 0;
            for (i = 1;i<=j;i++)
            {
                s += i;
                if (s==j)
                {
                    System.out.println(j);
                    break;
                } 
            }
        }
    }
}
