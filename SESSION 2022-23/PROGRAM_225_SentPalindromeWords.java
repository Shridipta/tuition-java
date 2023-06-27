import java.util.*;
public class PROGRAM_225_SentPalindromeWords {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter sentence");
        String str = sc.nextLine();

        str = str +" ";
        int n = str.length(), i, k = 0;

        for(i = 0;i<n;i++)
        {
            char ch = str.charAt(i);
            if (ch == ' ')
            {
                String word = str.substring(k, i);

                if (word.equals(reverse(word)))
                    System.out.println(word);
                k=i+1;
            }
        }

    }
    static String reverse(String word)
    {       
        String revword = "";
        for (int j = 0; j<word.length();j++)
        revword = word.charAt(j) + revword;
        return revword;
    }
}
