import java.util.*;

public class PROGRAM_232_StringEncryptCircular {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a word");
        String word = sc.next();
        System.out.println("Enter position of encryption ");
        int n = sc.nextInt();
        word = word.toLowerCase();
        String str = "";
        for (int i = 0; i < word.length(); i++) {
            char ch = word.charAt(i);
            str += (char) ((ch +n-97) % 26+ 97);
        }
        System.out.println("Encrypted word = " + str);
    }
}
