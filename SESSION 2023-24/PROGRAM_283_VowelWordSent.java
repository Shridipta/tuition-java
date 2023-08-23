import java.util.Scanner;
import java.util.StringTokenizer;

public class PROGRAM_283_VowelWordSent {
    String str;

    PROGRAM_283_VowelWordSent(String s) {
        str = s;
    }

    boolean validity() {
        char ch = str.charAt(str.length() - 1);
        if (ch != '.' && ch != '?' && ch != '!')
            return false;
        else
            return true;
    }

    boolean isVoweled(String word) {
        String v = "aeiouAEIOU";
        char ch1 = word.charAt(0);
        char ch2 = word.charAt(word.length() - 1);
        if (v.indexOf(ch1) > -1 && v.indexOf(ch2) > -1)
            return true;
        else
            return false;
    }

    void display() {
        if (validity() == false)
        {
            System.out.println("INVALID INPUT");
            return;
        }
        str = str.substring(0, str.length()-1);
        StringTokenizer st = new StringTokenizer(str);
        int n = st.countTokens();
        String s1 = "", s2 = "";
        int count = 0;
        while (n > 0) {
            String word = st.nextToken();
            if (isVoweled(word) == true)
            {
                s1 += word + " ";
                count++;
            }
            else
                s2 += word + " ";
            n--;
        }
        System.out.println("NUMBER OF WORDS BEGINNING AND ENDING WITH A VOWEL = " + count);
        System.out.println(s1 + s2);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string");
        String str = sc.nextLine();
        PROGRAM_283_VowelWordSent obj = new PROGRAM_283_VowelWordSent(str);
        obj.display();
    }
}
