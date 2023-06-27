import java.util.*;

public class PROGRAM_238_VowelShiftCircularM2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a word");
        String word = sc.next();
        word = word.toLowerCase();
        String str = "";
        String vowel = "aeioua";
        for (int i = 0; i < word.length(); i++) {
            char ch = word.charAt(i);
            int k = vowel.indexOf(ch);
            if (k != -1)
                str += vowel.charAt(k + 1);
            else
                str += ch;
        }
        System.out.println("New word = " + str);
    }

}
