import java.util.*;
public class PROGRAM_229_StartEndLetterSame{
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter sentence");
        String str = sc.nextLine();
        str = str +" ";

        int n = str.length(), i, k = 0;

        System.out.println("Words starting and ending with same letter");
        for(i = 0;i<n;i++)
        {
            char ch = str.charAt(i);
            if (ch == ' ')
            {
                String word = str.substring(k, i);
                int n2 = word.length();
                char firstletter = word.charAt(0);
                char secondletter = word.charAt(n2-1);
                if (firstletter == secondletter)
                    System.out.println(word);
                k=i+1;
            }
        }

    }
}