public class PROGRAM_Pattern_104_prime_triangle
{
    public static void main(int n)
    {
        int num, i, j, k, count;
        for (i = 1; i<=n; i++)
        {
            num = 2;
            for (j=1; j<=(n-i); j++)
                System.out.print(" ");
            for(k=1; k<=i; k++)
            {
                count = 0;
                for (j = 1 ; j<=num; j++)
                    if (num % j == 0) 
                        count++;
                if(count == 2) 
                    System.out.print(num+" ");
                else 
                    k--;
                num++;
            }
            System.out.println();
        }
    }
}