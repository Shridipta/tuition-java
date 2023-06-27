import java.util.*;

public class PROGRAM_218_BreakSentLines {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i;
        String str2 = "";
        System.out.println("Enter the sentence");
        String str = sc.nextLine();
        str += " ";
        for (i = 0; i <= str.length() - 1; i++) {
            char s = str.charAt(i);
            str2 += s;
            if (s == ' ')
                System.out.println(str2);
        }
    }
}
