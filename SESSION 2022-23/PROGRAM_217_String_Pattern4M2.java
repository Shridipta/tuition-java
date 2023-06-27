import java.util.*;

public class PROGRAM_217_String_Pattern4M2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string");
        String str = sc.next();
        for (int i = str.length() - 1; i >= 0; i++) {
            for (int j = i; j <= str.length() - 1; j++)
                System.out.print(str.charAt(j));
            System.out.println();
        }
    }
}
