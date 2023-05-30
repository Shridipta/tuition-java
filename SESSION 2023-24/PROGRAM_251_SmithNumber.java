import java.util.*;

public class PROGRAM_251_SmithNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int num = sc.nextInt();

        int sum1 = sumDigits(num), sum2 = 0;
        for (int i = 2; i <= num; i++)
            if (num % i == 0) {
                sum2 += sumDigits(i);
                num /= i;
                i--;
            }

        if (sum1 == sum2)
            System.out.println("Smith Number");
        else
            System.out.println("Not Smith Number");
    }

    static int sumDigits(int num) {
        int sum = 0;
        while (num > 0) {
            int d = num % 10;
            sum += d;
            num = num / 10;
        }
        return sum;
    }
}
