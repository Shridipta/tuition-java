import java.util.*;
public class PROGRAM_173_reverse_4digit_palindrome
{
    public static int reverse(int num)
    {
        int r=0, d;
        while(num>0)
        {
            d=num%10;
            r=r*10+d;
            num/=10;
        }
        return r;
    }
    public static void main()
    {
        int i;
        for (i =1000; i<= 9999; i++)
            if (reverse(i) == i)
                System.out.println(i);
    }
}
