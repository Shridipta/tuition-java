import java.util.*;
public class PROGRAM_139_Centinal_Average_Absolute
{
    public static void main()
    {
        Scanner sc = new Scanner(System.in);
        int d = 0, e = 0, c = 0, sum = 0;
        double avg = 0;
        int n = 0;
        for(;n!= (-99);)
        {
            n = sc.nextInt();
            if ((Math.abs(n)%2 ==1) && (n==(-Math.abs(n))))
                d+=1;
            if ((Math.abs(n)%2 == 0) && (n==Math.abs(n)))
                e+=1;
            sum += Math.abs(n);
            c++;
        }
        avg = (double)sum/c;
        System.out.println("No. of Odd Negative = " + d);
        System.out.println("No. of Even Positive = " + e);
        System.out.println("Average = "+ avg);
    }
}
