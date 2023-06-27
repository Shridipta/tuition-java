import java.util.*;
public class REVISION2_PROG_6
{
    public static void main(int n)
    {
        int copy, c = 0;
        copy = n;
        while (copy > 0){
            c = c + 1;
            copy = copy / 10;
        }
        int l = n % 10;   //last digit
        int f = n / (int) Math.pow(10, c-1);  //first digit
        int mid = n % (int) Math.pow(10, c-1);  // removing the first digit
        mid = mid/10;  // removing the last digit
        mid = l* (int) Math.pow(10, c-1) + mid*10 + f;  //adding the first and last digit 
        System.out.println(mid);   // finally! printing it...
    }
}
