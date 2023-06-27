import java.util.*;
public class PROGRAM_238_VowelShiftCircularM1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a word");
        String word = sc.next();
        word = word.toLowerCase();
        String str = "";
        String vowel = "aeiou";
        for (int i = 0; i < word.length(); i++) {
            char ch = word.charAt(i);
            int vowelindex = vowel.indexOf(ch);
            if (vowelindex != -1)
                str += vowel.charAt((vowelindex+1)%5);
            else
                str+=ch;
        }
        System.out.println("New word = " + str);
    }
}
