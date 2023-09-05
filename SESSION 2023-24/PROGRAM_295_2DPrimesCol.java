import java.util.Scanner;

public class PROGRAM_295_2DPrimesCol {
    static boolean isprime(int x) {
        for (int i = 2; i < x; i++) {
            if (x % i == 0)
                return false;
        }
        return true;
    }

    static void print(int arr[][]) {
        int i, j;
        int r = arr.length, c = arr[0].length;
        for (i = 0; i < r; i++) {
            for (j = 0; j < c; j++)
                System.out.print(arr[i][j] + "\t");
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows and columns");
        int r = sc.nextInt();
        int c = sc.nextInt();

        int arr[][] = new int[r][c];
        int i, j, k = 1;
        for (i = 0; i < r; i++)
            for (j = 0; j < c; j++) {
                k++;
                if (isprime(k) == false)
                    j--;
                else
                    arr[j][i] = k;
            }

        System.out.println("Matrix of m*n prime Numbers columnwise");
        print(arr);
    }
}
