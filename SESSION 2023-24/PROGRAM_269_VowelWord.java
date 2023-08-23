import java.util.*;

public class PROGRAM_269_VowelWord {
    String str;
    int freq;

    PROGRAM_269_VowelWord() {
        str = "";
        freq = 0;
    }

    void readstr() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the sentence");
        str = sc.nextLine();
    }

    void freq_vowel() {
        int k = 0;
        str += " ";
        String vowels = "AEIOUaeiou";
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch == ' ') {
                String word = str.substring(k, i);
                if (vowels.indexOf(word.charAt(0)) != -1)
                    freq++;
                k = i + 1;
            }
        }
    }

    void display() {
        System.out.println("The sentence is " + str);
        System.out.println("Number of words starting with vowels is " + freq);
    }

    public static void main(String[] args) {
        PROGRAM_269_VowelWord obj = new PROGRAM_269_VowelWord();
        obj.readstr();
        obj.freq_vowel();
        obj.display();
    }
}
