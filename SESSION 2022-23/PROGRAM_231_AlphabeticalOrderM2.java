import java.util.*;

public class PROGRAM_231_AlphabeticalOrderM2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a sentence");
        String str = sc.nextLine();
        str += " ";
        int n = str.length();
        String arr[] = new String[n];
        int i, k = 0;

        for (i = 0; i < n; i++) {
            char ch = str.charAt(i);

            if (ch == ' ') {
                int mid = 0;
                int l = 0;
                int u = n;
                String word = str.substring(k, i);
                System.out.println("word = " + word);
                for (int j = 0; j < n; j++) {
                    if (arr[j] != null) {
                        if (word.compareToIgnoreCase(arr[j]) > 0)
                            l = j;
                        else if (word.compareToIgnoreCase(arr[j]) < 0) {
                            u = j;
                            break;
                        }
                        // if (word.compareToIgnoreCase(arr[j]) == 0) {
                        else {
                            u = j + 1;
                            break;
                        }
                    }
                }
                mid = (l + u) / 2;
                arr[mid] = word;
                k = i + 1;
            }
        }
        String newstr = "";
        for (i = 1; i < n; i++)
            if (arr[i] != null)
                newstr += " " + arr[i];
        System.out.println("Sorted String = " + newstr);
    }
}
