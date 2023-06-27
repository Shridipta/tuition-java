import java.util.*;
public class PROGRAM_159_AdamNumber
{
    public static void main(int num)
    {
        int c = 0, copy = num;
        double num1, num2, sum;
        while (copy>0)
        {
            c++;
            copy/=10;
        }
        if(c%2 !=0)
        {
            System.out.println("Not Adam Number");
            return;
        }
        num1 = num% Math.pow(10, (c/2));
        num2 = Math.floor(num/ Math.pow(10, (c/2)));
        sum = num1+num2;
        if( Math.sqrt(sum) == Math.floor(Math.sqrt(sum)))
            System.out.println("Adam");
        else
            System.out.println("Not Adam");
    }
}
