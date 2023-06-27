import java.util.*;

public class PROGRAM_227_FrequencyVowelEachWord {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the sentence");
        String str = sc.nextLine();
        str+=' ';
        String vowel = "AEIOUaeiou";
        int n = str.length(), i, j, k = 0;

        for (i = 0; i < n; i++) {
            char ch = str.charAt(i);
            int count = 0;
            if (ch == ' ') {
                String word = str.substring(k, i);
                for (j = 0; j < vowel.length(); j++) {
                    for (k = 0; k < word.length(); k++)
                        if (vowel.charAt(j) == word.charAt(k))
                            count++;
                }
                System.out.println("Frequency of vowels in '" + word + "' is " + count);
                k = i + 1;
            }
        }

    }
}