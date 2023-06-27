import java.util.*;

public class PROGRAM_220_PalindromeStringM2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the word");
        String str = sc.nextLine();
        int n = str.length(), i, k = 0;
        for (i = 0; i < n / 2; i++) {
            if (str.charAt(i) != str.charAt(n - i - 1)) {
                k = 1;
                break;
            }
        }
        if (k == 0)
            System.out.println("Palindrome");
        else
            System.out.println("Not Palindrome");

    }
}
