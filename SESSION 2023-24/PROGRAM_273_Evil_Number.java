import java.util.*;

public class PROGRAM_273_Evil_Number {
    int N;

    void accept() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of N");
        N = sc.nextInt();
    }

    boolean isEvil(int x) {
        int count = 0;
        while (x > 0) {
            int d = x % 2;
            if (d == 1)
                count++;
            x /= 2;
        }
        return (count % 2 == 0);
    }

    void display() {
        if (isEvil(N) == true)
            System.out.println("Evil Number");
        else
            System.out.println("Not Evil Number");
    }

    public static void main(String[] args) {
        PROGRAM_273_Evil_Number obj = new PROGRAM_273_Evil_Number();
        obj.accept();
        obj.display();
    }
}
