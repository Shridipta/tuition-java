import java.util.*;

public class PROGRAM_221_ToggleCaseM2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the word");
        String str = sc.nextLine();
        int n = str.length(), i;
        String newstr = "";

        for (i = 0; i < n; i++) {
            char ch = str.charAt(i);
            if (ch >= 'A' && ch <= 'Z')
                newstr = newstr + (char) (ch + 32);
            else if (ch >= 'a' && ch <= 'z')
                newstr = newstr + (char) (ch - 32);
            else
                newstr += ch;

        }
        System.out.println("Toggled Case String = " + newstr);

    }
}
