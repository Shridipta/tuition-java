import java.util.*;;

public class PROGRAM_223_WordReverseOrder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string");
        String str = sc.nextLine();
        str += " ";
        String newstr = "";
        int n = str.length(), i, k =0;

        for (i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch == ' ')
            {
                String word = str.substring(k, i);
                newstr = word + " " + newstr;
                k = i+1;
            }
        }
        System.out.println(newstr);
        
    }
}
