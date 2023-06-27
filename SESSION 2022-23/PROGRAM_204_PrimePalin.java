import java.util.*;

public class PROGRAM_204_PrimePalin {
    private int num, f, rev;

    public PROGRAM_204_PrimePalin(int n) {
        num = n;
        f = 0;
        rev = 0;
    }

    int prime() {
        int i, c = 0;
        for (i = 1; i <= num; i++) {
            if (num % i == 0)
                c++;
        }
        if (c == 2)
            f = 1;
        return f;
    }

    int reverse() {
        int copy = num;
        int d = 0;
        while (copy > 0) {
            d = copy % 10;
            rev = rev * 10 + d;
            copy /= 10;
        }
        return rev;
    }

    void display() {
        if (prime() == 1 && reverse() == num)
            System.out.println("Prime and Palindrome");
        else
            System.out.println("Not Prime and Palindrome");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int n = sc.nextInt();
        PROGRAM_204_PrimePalin c1 = new PROGRAM_204_PrimePalin(n);
        c1.display();
    }
}
