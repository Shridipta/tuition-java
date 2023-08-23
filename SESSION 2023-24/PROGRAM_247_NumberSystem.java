import java.util.Scanner;

public class PROGRAM_247_NumberSystem {
    static void binToDec(long num) {
        int sum = 0, c = 0;
        while (num > 0) {
            int d = (int) num % 10;
            sum += (int) Math.pow(2, c) * d;
            c++;
            num /= 10;
        }
        System.out.println("Decimal = " + sum);
    }

    static void decToAny(int num, int base) {
        String str = "";
        while (num > 0) {
            int d = num % base;
            if (d <= 9)
                str = d + str;
            else
                str = (char) (55 + d) + str;
            num /= base;
        }
        System.out.println("Equivalent Number = " + str);
    }

    static void anyToDec(String num, int base) {
        int sum = 0, c = 0;
        num = num.toUpperCase();
        for (int i = num.length() - 1; i >= 0; i--) {
            char ch = num.charAt(i);
            if (ch >= 65 && ch<=90)
                ch -= 55;
            else if (ch >= 48 && ch<=57)
                ch -= 48;
            sum += ch * (int) Math.pow(base, c);
            c++;
        }
        System.out.println("Equivalent Decimal = " + sum);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // System.out.println("Enter a binary number");
        // long n1 = sc.nextLong();
        // binToDec(n1);

        // System.out.println("Enter a decimal number");
        // int n2 = sc.nextInt();
        // System.out.println("Enter the base");
        // int base = sc.nextInt();
        // decToAny(n2, base);
        
        System.out.println("Enter number of any base");
        String n3 = sc.nextLine();
        System.out.println("Enter the base");
        int base = sc.nextInt();
        anyToDec(n3, base);
    }
}
