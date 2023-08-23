import java.util.*;

public class PROGRAM_274_Potential_Sent {
    String str;
    String words[];

    PROGRAM_274_Potential_Sent() {
        str = "";
    }

    void accept() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the sentence");
        str = sc.nextLine().toUpperCase();
        words = new String[str.length()];
    }

    boolean validity() {
        char last = str.charAt(str.length() - 1);
        if (last == '.' || last == '?' || last == '!')
            return true;
        else
            return false;
    }

    int potential(String word) {
        int sum = 0;
        for (int i = 0; i < word.length(); i++) {
            sum += word.charAt(i);
        }
        return sum;
    }

    void extract() {
        int k = 0, c = 0;
        str += " ";
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch == ' ') {
                words[c++] = str.substring(k, i);
                k = i + 1;
                System.out.println(words[c]);
            }
        }
    }

    void arrange() {
        for (int i = 0; i < words.length; i++) {
            for (int j = 0; j < words.length; j++) {
                if (potential(words[j]) > potential(words[j + 1])) {
                    String temp = words[j];
                    words[j] = words[j + 1];
                    words[j + 1] = temp;
                }
            }
        }
    }

    void display() {
        if (validity() == true) {
            for (int i = 0; i < words.length; i++)
                System.out.println(words[i] + " = " + potential(words[i]));
            arrange();
            for (int i = 0; i < words.length; i++)
                System.out.print(words[i] + " ");
        } else
            System.out.println("INVALID INPUT");

    }

    public static void main(String[] args) {
        PROGRAM_274_Potential_Sent obj = new PROGRAM_274_Potential_Sent();
        obj.accept();
        obj.extract();
        obj.display();
    }
}
