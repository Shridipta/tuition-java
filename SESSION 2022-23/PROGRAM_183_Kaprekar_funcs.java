import java.util.*;
public class PROGRAM_183_Kaprekar_funcs
{
    public void main(int n)
    {
        if(checkKaprekar(n))
            System.out.println("Kaprekar");
        else
            System.out.println("Not Kaprekar");
    }

    int countDigit(int n)
    {
        int c =0, d;
        while(n>0)
        {
            d=n%10;
            c++;
            n/=10;
        }
        return c;
    }
    boolean checkKaprekar(int n)
    {
        int sq = n*n;
        int left = sq/(int)Math.pow(10, countDigit(n));
        int right = sq %(int)Math.pow(10, countDigit(n));
        return ((left+right)==n);
    }
}
