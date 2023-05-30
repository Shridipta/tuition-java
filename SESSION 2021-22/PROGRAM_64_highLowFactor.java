public class PROGRAM_64_highLowFactor
{
    public static void main (int num)
    {
        int i, h = 1;
        for (i=2; i<num; i++)
            if (num % i == 0)
                h = i;
        System.out.println("Highest Factor = " + h);
        System.out.println("Lowest Factor = " + num/h);
    }
}
