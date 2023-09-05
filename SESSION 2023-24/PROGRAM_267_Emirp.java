//working

import java.util.Scanner;

public class PROGRAM_267_Emirp {
    int n, rev, f;

    PROGRAM_267_Emirp(int nn) {
        n = nn;
        rev = 0;
        f = 2;
    }

    int isprime(int x, int f) {
        if (f < x) {
            if (x % f != 0) {
                return (isprime(x, ++f));
            } else {
                return 0;
            }
        }
        return 1;
    }

    void isEmirp() {
        int copy = n;
        while (copy > 0) {
            int d = copy % 10;
            rev = rev * 10 + d;
            copy /= 10;
        }
        if (isprime(n, f) == 1 && isprime(rev, f) == 1)
            System.out.println("Emirp Number");
        else
            System.out.println("Not a Emirp Number");
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int n = sc.nextInt();
        PROGRAM_267_Emirp obj = new PROGRAM_267_Emirp(n);
        obj.isEmirp();
    }
}
