import java.util.Scanner;

public class PROGRAM_278_Parenthesis {
    String str;

    PROGRAM_278_Parenthesis(String s) {
        str = s;
    }

    int check() {
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch == '(')
                count++;
        }
        if (count > 1)
            return -1;
        else
            return 1;
    }

    void show() {
        if (check() == 1) {
            System.out.println("String is valid");
            int c1 = str.indexOf('(');
            int c2 = str.lastIndexOf(')');
            String f = str.substring(0, c1);
            String l = str.substring(c2+1);
            System.out.println(f + l);
        } else
            System.out.println("String is not valid");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the sentence");
        String str = sc.nextLine().toUpperCase();
        PROGRAM_278_Parenthesis obj = new PROGRAM_278_Parenthesis(str);
        obj.show();
    }
}
