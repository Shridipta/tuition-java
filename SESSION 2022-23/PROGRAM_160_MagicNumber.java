import java.util.*;
public class PROGRAM_160_MagicNumber
{
    public static void main(int n)
    {
        int sum = 0;
        while (n > 0 || sum > 9)
        {
            if (n == 0)
            {
                n = sum;
                sum = 0;
            }
            sum = sum+ (n % 10);
            n = n/10;
        }
        if (sum ==1)
            System.out.println("Magic Number");
        else
            System.out.println("Not Magic number");
    }
}
