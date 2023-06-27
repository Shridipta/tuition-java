import java.util.*;
public class PROGRAM_219_WordExtraction 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the sentence");
        String str = sc.nextLine();
        str += " ";
        int n = str.length(), i, k = 0;
        for (i =0; i<n;i++)
        {
            char ch = str.charAt(i);
            if(ch == ' ')
            {
                String word = str.substring(k, i);
                System.out.println(word);
                k=i+1;
            }
        }
    }
}
