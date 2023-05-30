import java.util.*;

public class PROGRAM_250_CyclicNumber_M1_sirfunc {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int num = sc.nextInt();

        int i, copy = num;
        int count = countDigits(num);
        for (i = 2; i <= count; i++)
            if (isequal(num * i, num) == false) {
                System.out.println("Not Cyclic Number");
                return;
            }
        System.out.println("Cyclic Number");
    }

    static boolean isequal(int n1, int n2) {
        int copy, d1, d2;
        while (n1 > 0) {
            int count = 0;
            d1 = n1 % 10;

            copy = n2;
            while (copy > 0) {
                d2 = copy % 10;
                if (d1 == d2)
                    count++;
                copy /= 10;
            }
            if (count == 0)
                return false;
            n1 /= 10;
        }
        return true;
    }

    static int countDigits(int n) {
        int count = 0;
        while (n > 0) {
            count++;
            n /= 10;
        }
        return count;
    }
}
