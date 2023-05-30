public class PROGRAM_136_Primorial_XY
{
    public static void main(int x, int y)
    {
        int i, j, k, c;
        for (i = x; i<=y ; i++)
        {
            int f = 1;
            for (j = 1; j<=i ; j++) //finding the primorial
            {
                c = 0;
                for (k = 1 ; k<=j; k++) //checking if prime
                    c++;
                if (c==2)
                    f*=j;
            }
            System.out.println(f);
        }
    }
}
