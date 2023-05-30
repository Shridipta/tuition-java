import java.util.*;

public class PROGRAM_250_CyclicNumber_M2_sum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int num = sc.nextInt();

        int c1 = 0, c2 = 0, d, copy = num, sum1 = 0, sum2 = 0, flag = 0;
        while (copy > 0) {
            d = copy % 10;
            sum1 += d;
            c1++;
            copy /= 10;
        }
        
        for (int i = 1; i <= c1; i++) {
            int p = num * i;
            copy = p;
            c2 = 0;
            sum2 = 0;
            while (copy > 0) {
                d = copy % 10;
                sum2+=d;
                c2++;
                copy /= 10;
            }
            if (sum2 != sum1 || c1!=c2)
            {
                flag = 1;
                break;
            }
        }
        if (flag == 0)
        System.out.println("Cyclic Number");
        else
        System.out.println("Not a Cyclic Number");
    }
}
