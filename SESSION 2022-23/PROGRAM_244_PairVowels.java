import java.util.*;
public class PROGRAM_244_PairVowels {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string");
        String str = sc.nextLine();
        str = str+ " ";
        str = str.toUpperCase();
        String str2 = "AEIOU";
        int count = 0;
        System.out.print("Pair of vowels: ");
        for (int i = 0; i < str.length()-1; i++) {
            char ch = str.charAt(i);
            char ch2 = str.charAt(i+1);
            if (str2.indexOf(ch)>-1 && str2.indexOf(ch2)>-1)
            {
                String p = ch + "" + ch2;
                count++;
                System.out.print(p+ ", ");
            }
        }
        System.out.println("No. of pairs of vowel = " + count);
     }
}
