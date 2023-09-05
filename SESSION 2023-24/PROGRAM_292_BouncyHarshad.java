//working

import java.util.Scanner;

public class PROGRAM_292_BouncyHarshad {
    static boolean isHarshad(int num) {
        int sum = 0, copy = num;
        while (copy > 0) {
            int d = copy % 10;
            sum += d;
            copy /= 10;
        }
        return (num % sum == 0);
    }

    static int countDigit(int num) {
        int c = 0, d;
        while (num > 0) {
            d = num % 10;
            c++;
            num /= 10;
        }
        return c;
    }

    static boolean isBouncy(int num) {
        int d1, d2, c = countDigit(num) - 1, asc = 0, dsc = 0;
        d1 = num % 10;
        num /= 10;
        while (num > 0) {
            d2 = num % 10;
            if (d1 > d2) {
                asc++;
            } else if (d1 < d2)
                dsc++;
            num /= 10;
        }
        return (c != asc && c != dsc);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int n = sc.nextInt();

        if (isHarshad(n) == true && isBouncy(n) == true)
            System.out.println("Bouncy Harshad Number");
        else
            System.out.println("Not Bouncy Harshad Number");
    }
}
