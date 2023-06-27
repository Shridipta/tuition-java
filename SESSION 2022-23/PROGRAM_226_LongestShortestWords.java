import java.util.*;
public class PROGRAM_226_LongestShortestWords{
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter sentence");
        String str = sc.nextLine();
        str = str +" ";

        int n = str.length(), i, k = 0;
        int max = 0, min = n;

        String minword ="";
        String maxword ="";
        for(i = 0;i<n;i++)
        {
            char ch = str.charAt(i);
            if (ch == ' ')
            {
                String word = str.substring(k, i);
                if(word.length() > max)
                {
                    max = word.length();
                    maxword = word;
                }
                else if (word.length() < min)
                {
                    min = word.length();
                    minword = word;
                }
                k=i+1;
            }

        }
        System.out.println("Shortest Word = "+minword);
        System.out.println("Longest Word = "+maxword);

    }
}