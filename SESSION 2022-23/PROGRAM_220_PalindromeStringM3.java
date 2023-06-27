import java.util.*;

public class PROGRAM_220_PalindromeStringM3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the word");
        String str = sc.nextLine();
        int n = str.length(), i;
        String revstr = "";

        for (i = 0; i < n; i++) {
            char ch = str.charAt(i);
            revstr = ch + revstr;
        }
        if (revstr.equals(str))
            System.out.println("Palindrome");
        else
            System.out.println("Not Palindrome");
    }
}
