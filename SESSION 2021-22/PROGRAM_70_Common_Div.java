public class PROGRAM_70_Common_Div
{
    public static void main (int a, int b)
    {
        int i, sum = 0;
        System.out.println("The common divisors of a and b are :-");
        for (i = 2; i < a; i++)
            if (a % i == 0 && b % i == 0 )
            {
                System.out.println(i);
                sum += i;
            }
        System.out.println("The sum of the common divisors of a and b = " + sum);
    }
}