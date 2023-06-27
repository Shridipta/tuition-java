import java.util.*;

public class PROGRAM_230_PairConsecutiveLetterM2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a sentence");
        String str = sc.nextLine();
        str += " ";
        int len = str.length(), i, k = 0, flag = 0;
        for (i = 0; i < len-1; i++) {
            char ch = str.charAt(i);
            char ch2 = str.charAt(i + 1);
            if ((int) ch + 1 == (int) ch2)
                flag = 1;
            if (ch == ' ') {
                String word = str.substring(k, i);
                if (flag == 1)
                    System.out.println(word);
                flag = 0;
                k = i + 1;
            }
        }
    }
}
