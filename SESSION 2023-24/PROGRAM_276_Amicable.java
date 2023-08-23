import java.util.Scanner;

public class PROGRAM_276_Amicable {
    int a, b;

    PROGRAM_276_Amicable(int a, int b) {
        this.a = a;
        this.b = b;
    }

    int sumOfDivisor(int x) {
        int sum = 0;
        for (int i = 1; i <= x / 2; i++) {
            if (x % i == 0)
                sum += i;
        }
        return sum;
    }

    void printNum() {
        System.out.println("The Amicable Pair Numbers Are ");
        for (int i = b; i <= a; i++) {
            for (int j = b; j <= a; j++) {
                if (sumOfDivisor(j) == i &&
                        sumOfDivisor(i) == j && i < j)
                    System.out.println(i + " " + j);
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the range");
        int b = sc.nextInt();
        int a = sc.nextInt();
        PROGRAM_276_Amicable obj = new PROGRAM_276_Amicable(a, b);
        obj.printNum();
    }
}
