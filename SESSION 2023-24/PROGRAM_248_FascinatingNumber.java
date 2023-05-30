import java.util.*;

public class PROGRAM_248_FascinatingNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of n");
        int n = sc.nextInt();
        int a = n, b = n * 2, c = n * 3;
        int r = a * 1000000 + b * 1000 + c;
        int flag = 0;

        for (int j = 0; j <= 9; j++) {
            int copy = r;
            int count = 0;

            while (copy > 0) {
                int d = copy % 10;
                if (d == j)
                    count++;
                copy /= 10;
            }
            if (count >= 2) {
                flag = 1;
                break;
            }
        }
        if (flag == 0)
            System.out.println("Fascinating Number");
        else
            System.out.println("Not Fascinating Number");
    }
}
