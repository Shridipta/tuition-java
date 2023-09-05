import java.util.Scanner;
import java.util.StringTokenizer;

public class PROGRAM_272_Paragraph {
    int n;
    String p;
    String words[];
    int freq[];
    int count;

    PROGRAM_272_Paragraph() {
        n = 0;
        p = "";
        count = 0;
    }

    int accept() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of sentences");
        n = sc.nextInt();
        if (n > 3 || n < 1) {
            System.out.println("Invalid Input");
            return -1;
        }
        for (int i = 0; i < n; i++) {
            System.out.println("Enter the " + (i + 1) + " sentence");
            String str = sc.nextLine().toUpperCase();
            if (validity(str) == false) {
                System.out.println("Invalid Sentence - Paragraph");
                return -1;
            } else
                p += str.substring(0, str.length() - 1);
        }
        return 0;
    }

    boolean validity(String s) {
        char ch = s.charAt(s.length()-1);
        if (ch != '.' && ch != '?')
            return false;
        else
            return true;
    }

    void extractDistinctWords() {
        StringTokenizer st = new StringTokenizer(p);
        int c = st.countTokens();
        count = c;
        words = new String[c];

        int flag = 0, k = 0;
        while (c > 0) {
            String w = st.nextToken();
            for (int j = 0; j < words.length; j++) {
                if (w == words[j])
                    flag = 1;
            }
            if (flag == 0)
                words[k++] = w;
            n--;
        }
    }

    void countFreq() {
        freq = new int[count];
        for (int i = 0; i < words.length; i++) {
            StringTokenizer st = new StringTokenizer(p);
            int c = count, f = 0;
            while (c > 0) {

                String w = st.nextToken();
                if (words[i].equals(w))
                    f++;
                c--;

            }
            freq[i] = f;
        }
    }

    void arrange() {
        for (int i = 0; i < freq.length; i++) {
            for (int j = 0; j < freq.length - i - 1; j++) {
                if (freq[j] > freq[j + 1]) {
                    int temp1 = freq[j];
                    freq[j] = freq[j + 1];
                    freq[j + 1] = temp1;

                    String temp2 = words[j];
                    words[j] = words[j + 1];
                    words[j + 1] = temp2;
                }
            }
        }
    }

    void display() {
        System.out.println("Number of words in para = " + count);
        System.out.println("Words Frequency");
        for (int i = 0; i < words.length; i++) {
            System.out.println(words[i] + " = " + freq[i]);
        }
    }

    public static void main(String[] args) {
        PROGRAM_272_Paragraph obj = new PROGRAM_272_Paragraph();
        int e = obj.accept();
        if (e != -1) {
            obj.extractDistinctWords();
            obj.countFreq();
            obj.arrange();
            obj.display();
        }
    }
}
