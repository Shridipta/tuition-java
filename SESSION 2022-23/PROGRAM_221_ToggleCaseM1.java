import java.util.*;

public class PROGRAM_221_ToggleCaseM1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the word");
        String str = sc.nextLine();
        int n = str.length(), i;
        String newstr = "";
        for (i = 0; i < n; i++) {
            char ch = str.charAt(i);
            int ch_ascii = (int) ch;
            if (ch_ascii >= 97 && ch_ascii <= 122)
                newstr = newstr + (char) (ch_ascii - 32);
            else if (ch_ascii >= 65 && ch_ascii <= 90)
                newstr = newstr + (char) (ch_ascii + 32);
            else
                newstr += ch;

        }
        System.out.println("Toggled Case String = " + newstr);

    }
}
