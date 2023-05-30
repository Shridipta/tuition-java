public class PROGRAM_134_Successive_Div
{
    public static void main()
    {
        int flag = 0, copy, i, j, c= 0;
        for (i = 10000000; i<=100000000; i++)
        {
            copy = i; flag = 0;
            for (j = 8; j>=2; j--)
            {
                if (copy % j != 0)
                    flag = 1;
                copy = copy/10;
            }
            if (flag == 0)
            {
                c++;    
                System.out.println(i);
            }
        }
        System.out.println(c);     //gives 2227
    }
}
