import java.util.*;
public class PROGRAM_147_20NDigitArmstrong
{
    public static void main(int n)
    {
        int i, copy, sum, k=0, d;
        for (i= (int)Math.pow(10, n-1); i<= (int)Math.pow(10, n); i++)
        {
            sum=0;
            copy =i;
            while(copy>0) //calculating the sum
            {
                d = copy%10;
                sum+=(int) Math.pow(d, n);
                copy/=10;
            }
            if (sum==i)  //checking if armstrong
            {
                System.out.println(i);
                k++;
            }
            if(k>5)
                return;
        }
    }
}
