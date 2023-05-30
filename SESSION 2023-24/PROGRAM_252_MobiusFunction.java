import java.util.*;

public class PROGRAM_252_MobiusFunction {

    static int M(int n) {
        int p = 0, prev = 0, i;
        if (n == 1)
            return 0;
        for (i = 2; i <= n;) {
            if (n % i == 0) {
                if (i == prev)
                    return 1; 
                p++;
                n /= i;
                prev = i;
            } else
                i++;
        }
        return (int)Math.pow(-1, p);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int num = sc.nextInt();

        System.out.println("Mobius value of n = "+M(num));
    }
}
