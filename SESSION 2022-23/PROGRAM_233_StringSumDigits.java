import java.util.*;

public class PROGRAM_233_StringSumDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        String str = sc.nextLine();
        int n = str.length(), i, sum = 0;
        for (i = 0; i < n; i++) {
            char ch = str.charAt(i);
            sum += ((int) ch - 48);
        }
        System.out.println("Sum of digits in the string = " + sum);
    }
}
