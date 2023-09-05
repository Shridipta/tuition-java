//working

import java.util.Scanner;

public class PROGRAM_291_PrimeDecompRange {
    static void decomp(int num) {
        int i = 2;
        while (num > 1) {
            if (num % i == 0) {
                System.out.print(i + " ");
                num = num / i;
            } else
                i++;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the range");
        int m = sc.nextInt();
        int n = sc.nextInt();
        for (int i = m; i < n; i++) {
            System.out.print(i + " = ");
            decomp(i);
            System.out.println();
        }
    }
}
