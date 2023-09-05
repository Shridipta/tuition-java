//working

import java.util.Scanner;

public class PROGRAM_288_TwinPrimeRange {
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

        System.out.println("The Twin Prime Numbers are");
        for (int i = a; i < b - 1; i++) {
            if (isprime(i) == true && isprime(i + 2) == true)
                System.out.println("("+i+", "+(i+2)+")");
        }
    }
}
