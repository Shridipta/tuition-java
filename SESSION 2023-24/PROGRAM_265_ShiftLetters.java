import java.util.*;

public class PROGRAM_265_ShiftLetters {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the sentence");
        String str = sc.nextLine();

        int pos = 0;
        int n = str.length();
        String word[] = new String[n];

        if (str.charAt(n - 1) != '.') // validity
        {
            System.out.println("Invalid. Full Stop not there.");
            return;
        } else if (str.toUpperCase().equals(str) == false) // validity
        {
            System.out.println("Invalid. Not in UpperCase.");
            return;
        }

        //extracting words into array
        int k = 0;
        for (int i = 0; i < n; i++) {
            char ch = str.charAt(i);
            if (ch == ' ' || ch == '.') {
                word[k++] = str.substring(pos, i);
                pos = i + 1;
            }
        }

        for (int i = 0; i < word.length; i++) {
            System.out.println(word[i]);
        }

        
        for (int i = 0; i < k - 1; i++) { //can also sort with null values in the array
            for (int j = 0; j < k - i - 1; j++) {
                if (word[j].compareTo(word[j + 1]) > 0) {
                    String temp = word[j];
                    word[j] = word[j + 1];
                    word[j + 1] = temp;
                }
            }
        }

    //     for (int i = 0; i < n; i++) {
    //         String w = sort(word[i]);
    //         System.out.println(w + " ");
    //     }
    //     for (int i = 0; i < n; i++) {
    //         String w = word[i];
    //         k = w.indexOf('E');
    //         String nw = w.substring(k) + w.substring(0, k) + 'O';
    //         System.out.println(nw + " ");
    //     }
    // }

    // static String sort(String w) {
    //     String s = "";
    //     int i, j, n = w.length();
    //     for (char ch = 'A'; ch < 'Z'; ch++) {
    //         for (i = 0; i < n; i++) {
    //             if (ch == w.charAt(i))
    //                 s += ch;
    //         }
    //     }
    //     return s;
    }
}
