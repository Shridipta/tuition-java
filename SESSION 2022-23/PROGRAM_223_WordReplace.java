import java.util.*;

public class PROGRAM_223_WordReplace {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter the text");
        String str = sc.nextLine();
        System.out.println("Enter the word to be replaced");
        String search = sc.nextLine();
        System.out.println("Enter the new word");
        String repl = sc.nextLine();

        str += " ";
        String newstr = "";
        int n = str.length(), i, k = 0;

        for (i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch == ' ') {
                String word = str.substring(k, i);
                if (word.equals(search))
                    newstr = newstr + " " + repl;
                else
                    newstr = newstr + " " + word;
                k = i + 1;
            }
        }
        System.out.println(newstr);

    }
}
