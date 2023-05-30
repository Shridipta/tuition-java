import java.util.*;

public class PROGRAM_249_CyclicNumber_M3_array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int num = sc.nextInt();

        int copy = num, c1 = 0, c2 = 0, d, flag = 0;
        int a[] = new int[num]; // digits into array of original number
        while (copy > 0) {
            d = copy % 10;

            a[c1++] = d;
            copy /= 10;
        }
        // for (int i = 0;i<c1;i++)
        // System.out.print(a[i] + " ");
        for (int i = 0; i < c1; i++) // sorting the digits array
            for (int j = 0; j < c1-i-1; j++)
                if (a[j] > a[j + 1]) {
                    int temp = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = temp;
                }
        for (int i = 0;i<c1;i++)
        System.out.print(a[i] + " ");
        
        for (int i = 1; i <= c1; i++) { // checking the n multiples of n-digited number
            int p = num * i;
            int b[] = new int[p];
            copy = p;
            c2 = 0;
            while (copy > 0) { // digits into array of multiple of number
                d = copy % 10;
                b[c2++] = d;
                copy /= 10;
            }
            for (int j = 0; j < c2; i++) // sorting the digits array
                for (int k = 0; k < c1-j-1; k++)
                    if (a[k] > a[k + 1]) {
                        int temp = a[k];
                        a[k] = a[k + 1];
                        a[k + 1] = temp;
                    }
            for (int j = 0; j < c1; j++) // sorting the digits array
                if (a[j] != b[j])
                    flag = 1;
            if (flag == 1) {
                System.out.println("Not a Cyclic Number");
                break;
            }

        }
    }
}
