import java.util.*;
public class PROGRAM_148_Series
{
    public static void main(int n){
        int a =1, i, j, sum=0, c;
        for(i = 1; i<=n ;i++)
        {
            sum = 0;
            c = a;
            for (j=1; j<=i;j++)
            {
                System.out.print(c+" ");
                sum +=c;
                c+=2;
            }
            System.out.print(sum);
            System.out.println();
            a+=2;
        }
    }
}