import java.util.*;
public class PROGRAM_171_reverse_Palindrome
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
    public static void main(int num)
    {
        if (reverse(num) == num)
            System.out.println("Palindrome");
        else
            System.out.println("Not Palindrome");
    }
}
