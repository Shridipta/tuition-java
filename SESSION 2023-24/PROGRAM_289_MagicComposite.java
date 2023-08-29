//working

import java.util.Scanner;

public class PROGRAM_289_MagicComposite {
    static boolean ismagic(int n) {
        int sum = 0;
        while (n > 0 || sum > 9) {
            if (n == 0) {
                n = sum;
                sum = 0;
            }
            sum = sum + (n % 10);
            n = n / 10;
        }
        return (sum == 1);

    }

    static boolean isprime(int x) {
        for (int i = 2; i < x; i++) {
            if (x % i == 0)
                return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the range");
        int a = sc.nextInt();
        int b = sc.nextInt();

        System.out.println("The Composite Magic Numbers are");
        for (int i = a; i <= b; i++) {
            if (isprime(i) == false && ismagic(i) == true)
                System.out.println(i);
        }
    }
}
