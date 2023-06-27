import java.util.*;

public class PROGRAM_239_ValidSent {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a sentence");
        String str = sc.nextLine();
        str = " " + str;
        String newstr = "";
        int c = 0;
        for (int i = 1; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch == '(')
                c++;
            if (ch == ')')
                c--;
            if (ch == '(' && c<2)
                newstr += '(';
            else if (ch == ')' && c<1)
                newstr += ')';
            else if (ch != '('&& ch != ')')
                newstr += ch;

        }
        System.out.println("New sentence = " + newstr);
    }
}
