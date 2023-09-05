//working

import java.util.*;

public class PROGRAM_268_Exchange {
    String sent, rev;
    int size;

    PROGRAM_268_Exchange() {
        sent = "";
        rev = "";
        size = 0;
    }

    void readsentence() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the sentence");
        sent = sc.nextLine();
    }

    boolean validity() {
        char ch = sent.charAt(sent.length() - 1);
        if (ch != '.')
            return false;
        else
            return true;
    }

    void exfirstlast() {
        int k = 0;
        sent = sent.substring(0, sent.length() - 1);
        sent += " ";
        size = sent.length();
        for (int i = 0; i < size; i++) {
            char ch = sent.charAt(i);
            if (ch == ' ') {
                String word = sent.substring(k, i);
                int l = word.length();
                if (l > 1)
                    rev += word.charAt(word.length() - 1) + word.substring(1, word.length() - 1) + word.charAt(0) + " ";
                else
                    rev += word + " ";
                k = i + 1;
            }
        }
    }

    void display() {
        System.out.println("The new sentence = " + rev);
    }

    public static void main(String[] args) {
        PROGRAM_268_Exchange obj = new PROGRAM_268_Exchange();
        obj.readsentence();
        if (obj.validity() == true) {
            obj.exfirstlast();
            obj.display();
        } else
            System.out.println("Invalid String");
    }
}