//working

import java.util.Scanner;

public class PROGRAM_293_SumFibNonFib {
    static boolean isFib(int n) {
        int a = 1, b = 0, c = 0;
        while (c <= n) {
            c = a + b;
            a = b;
            b = c;
            if (c == n)
                return true;
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the fibonacci number");
        int n = sc.nextInt();
        if (isFib(n) == false) {
            System.out.println("Not a Fibonacci Number");
            return;
        }

        int sumf = 0, sumnf = 0, d;
        while (n > 0) {
            d = n % 10;

            // if(d==0 || d==1 || d==2 || d==3 || d==5 || d==8)
            if (isFib(d) == true)
                sumf += d;
            else
                sumnf += d;
            n /= 10;
        }
        System.out.println("Sum of Fibonacci Digits = " + sumf);
        System.out.println("Sum of Non Fibonacci Digits = " + sumnf);
    }
}
