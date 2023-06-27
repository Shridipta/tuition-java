import java.util.*;

public class PROGRAM_241_Piglatin {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a word");
        String word = sc.next();
        int n = word.length();
        String str = "";
        String vowel = "aeiou";
        int vowelindex = -1;
        for (int i = 0; i < n; i++) {
            char ch = word.charAt(i);
            if (vowel.indexOf(ch) != -1) {
                vowelindex = vowel.indexOf(ch);
                break;
            }

        }
        if (vowelindex != -1)
            str = word.substring(vowelindex-1,n ) + word.substring(0, vowelindex-1) + "ay";
        else
            str = word;
        System.out.println("New word = " + str);
    }
}