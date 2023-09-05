//working

import java.util.Scanner;

public class PROGRAM_270_HappyNumber {
    int n;

    PROGRAM_270_HappyNumber() {
        n = 0;
    }

    void getnum(int nn) {
        n = nn;
    }

    int sum_sq_digits(int x) {
        if (x < 10) return x * x;
        return ((x % 10) * (x % 10)) + sum_sq_digits(x/10);
    }

    void ishappy() {
        while (n > 9) {
            n = sum_sq_digits(n);
        }
        if (n == 1)
            System.out.println("Happy Number");
        else
            System.out.println("Not Happy number");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int nn = sc.nextInt();

        PROGRAM_270_HappyNumber obj = new PROGRAM_270_HappyNumber();
        obj.getnum(nn);
        obj.ishappy();
    }
}
