import java.util.*;

public class PROGRAM_243_OnlyFirstLetterUpper {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the sentence");
        String str = sc.nextLine();
        str = " " + str;
        int n = str.length(), i;
        for (i = 0; i < n - 1; i++) {
            char ch = str.charAt(i);
            char ch2 = str.charAt(i);
            if (ch == ' ' && ch2 != ' ')
                System.out.print(Character.toUpperCase(ch2) + ".");
        }
    }
}
