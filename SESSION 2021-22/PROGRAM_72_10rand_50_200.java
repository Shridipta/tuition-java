public class PROGRAM_72_10rand_50_200
{
    public static void main ()
    {
        int i, j, rand_num, prime = 0, c;
        System.out.println("The random numbers between 50 and 200 are: ");
        for (i = 1; i <= 10; i++)
        {
            c = 0;
            rand_num = (int) (50 + (200-50)*Math.random());
            System.out.println(rand_num);
            for (j = 1; j <= rand_num; j++)
                if (rand_num % j == 0)
                    c++;
            if (c == 2)
                prime++;
        }
        System.out.println("The number of prime random nums between 50 and 200 is" + prime);
    }
}
