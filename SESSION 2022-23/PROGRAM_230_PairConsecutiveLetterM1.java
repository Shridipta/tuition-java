import java.util.*;
public class PROGRAM_230_PairConsecutiveLetterM1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a sentence");
        String str = sc.nextLine();
        str+=" ";
        int len = str.length(), i, k = 0;
        for(i = 0;i<len; i++)
        {
            char ch = str.charAt(i);
            if (ch == ' ')
            {
                String word = str.substring(k, i);
                if (isConsecutive(word))
                    System.out.println(word);
                k = i+1;
            }
        }
    }
    static boolean isConsecutive(String str)
    {
        int len = str.length(), count =0, i;
        for(i = 0;i<len-1;i++)
        {
            char ch1 = str.charAt(i);
            char ch2 = str.charAt(i+1);
            if ((int)ch1+1 == (int)ch2)
                count++;
        }
        return (count>=1);
    }
}
