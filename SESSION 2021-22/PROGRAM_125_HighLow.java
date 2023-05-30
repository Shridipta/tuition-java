import java.util.*;
public class PROGRAM_125_HighLow
{
    public static void main(int n)
    {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int big = num, small = num;
        for (int i = 1; i<=n-1;i++)
        {
            num = sc.nextInt();
            if (num>big)
                big = num;
            if(num<small)
                small = num; 
        }
        System.out.println("Small = "+small);
        System.out.println("Big = "+big);
    }
}
