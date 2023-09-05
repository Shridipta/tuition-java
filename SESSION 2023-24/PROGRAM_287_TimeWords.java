//working

import java.util.Scanner;

public class PROGRAM_287_TimeWords {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the time in hh:mm format");
        int h = sc.nextInt();
        int m = sc.nextInt();
        if (m >= 1 && m <= 15) {
            h = h % 24;
            System.out.print(m + " minutes past " + h);
        } else if (m >= 45 && m <= 59) {
            h = (h + 1) % 24;
            System.out.print((60 - m) + " minutes to " + h);
        } else
            System.out.print(h + " hour " + m + " minutes");

        if (h >= 12)
            System.out.print(" pm");
        else
            System.out.print(" am");
    }
}
