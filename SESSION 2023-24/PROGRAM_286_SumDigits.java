import java.util.Scanner;

public class PROGRAM_286_SumDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter value of m");
        int m = sc.nextInt(); 
        System.out.println("Enter value of n");
        int n = sc.nextInt();
        int i, temp, copy, sum, d;
        if (n>m)
        {
            temp = m;
            m = n;
            n = temp;
        }
        for (i = m; ;i++) {
            copy = i;
            sum = 0;
            while(copy>0)
            {
                d = copy%10;
                sum+=d;
                copy/=10;
            }
            if(sum>n)
                break;
        }
        System.out.println("smallest number > m whose sum of digits > n "+i);
    }
}
