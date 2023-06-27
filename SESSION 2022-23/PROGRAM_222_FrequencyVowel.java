import java.util.*;

public class PROGRAM_222_FrequencyVowel {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string");
        String str = sc.nextLine();
        String vowel = "AEIOUaeiou";
        int n = str.length(), i, j;

        for (i = 0; i < vowel.length(); i++) {
            int count = 0;
            for (j = 0; j < n; j++)
                if (vowel.charAt(i) == str.charAt(j))
                    count++;
            if (count > 0)
                System.out.println("Frequency of " + vowel.charAt(i) + " is " + count);
        }

    }
}