import java.util.*;

public class PROGRAM_254_KaprekarConstant {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int num = sc.nextInt();

        while (num != 6174) {
            int md = makeDescend(num), rmd = reverse(makeDescend(num));
            num = md - rmd;
            System.out.println(md + " - " + rmd + " = " + num);
        }
    }

    static int makeDescend(int num) {
        int sum = 0;
        for (int i = 9; i >= 0; i--) {
            int copy = num;
            while (copy > 0) {
                int d = copy % 10;
                if (d == i)
                    sum = sum * 10 + d;
                copy = copy / 10;
            }
        }
        return sum;
    }

    static int reverse(int num) {
        int sum = 0;
        while (num > 0) {
            int d = num % 10;
            sum = sum * 10 + d;
            num /= 10;
        }
        return sum;
    }
}
