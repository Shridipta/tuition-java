import java.util.*;

public class PROGRAM_217_String_Pattern3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter string");
        String str = sc.next();

        for (int i = 0; i <= str.length()-1; i++) {
            for (int j = i; j >= 0; j--)
                System.out.print(str.charAt(j));
            System.out.println();
        }

    }

}

