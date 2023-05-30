public class PROGRAM_114_circular_prime
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
        for (int i = 1; i<=c;i++)
        {
            int f = n / (int) Math.pow(10, c-1);  //first digit
            n = n % (int) Math.pow(10, c-1);  // removing the first digit
            n = n*10+f; //adding the first digit to the last digit
            System.out.println(n); 
            int count = 0;
            for (int j = 1; j <= n; j++)
            {
                if (n % j == 0)
                    count++;
            }
            if (count > 2)
            {
                System.out.println("Not Circular Prime");
                return;
            }
        }
        System.out.println("Circular Prime");
    }
}
