
//working full
import java.util.Scanner;

public class PROGRAM_281_CircularPrime {
    int n;

    PROGRAM_281_CircularPrime(int nn) {
        n = nn;
    }

    boolean isprime(int x) {
        for (int i = 2; i * i <= x; i++) {
            if (x % i == 0) {
                return false;
            }
        }
        return true;
    }

    int countDigits(int x) {
        int count = 0;
        while (x > 0) {
            x /= 10;
            count++;
        }
        return count;
    }

    void display() {
        int copy = n, flag = 0;
        do {
            System.out.println(copy);
            int d = copy / (int) Math.pow(10, countDigits(copy) - 1);
            copy = copy % (int) Math.pow(10, countDigits(copy) - 1);
            copy = copy * 10 + d;
            if (isprime(copy) == false)
                flag = 1;
        } while (copy != n);
        if (flag == 1)
            System.out.println(n + " IS NOT A CIRCULAR PRIME");
        else
            System.out.println(n + " IS A CIRCULAR PRIME");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int n = sc.nextInt();
        PROGRAM_281_CircularPrime obj = new PROGRAM_281_CircularPrime(n);
        obj.display();
    }

}
