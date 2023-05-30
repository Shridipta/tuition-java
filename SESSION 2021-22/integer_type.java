public class integer_type
{
    public static void main(int num)
    {
        int i, c = 0, sum = 0;
        for (i = 1; i <= num; i++)
            if (num % i == 0)
            {
                c++;
                sum+=i;
            }     
        if (c == 2)
            System.out.println("Prime");
        else if ( (sum-num) == num)
            System.out.println("perfect");
        else if ((sum-num) > num)
            System.out.println("abundant");
        else if ((sum-num) < num)
            System.out.println("deficient");
    }
}