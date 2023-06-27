import java.util.*;

public class PROGRAM_217_String_Pattern5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int n = sc.nextInt();
        int k = 1;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                if (k % 2 == 0)
                    System.out.print("#");
                else
                    System.out.print("$");
                k++;
            }
            System.out.println();
        }
    }
}
