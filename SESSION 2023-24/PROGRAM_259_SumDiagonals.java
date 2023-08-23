import java.util.Scanner;

public class PROGRAM_259_SumDiagonals {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows and columns");
        int n = sc.nextInt();
        int arr[][] = new int[n][n];
        int i, j;
        for (i = 0; i < n; i++)
            for (j = 0; j < n; j++) {
                System.out.println("Enter the data");
                arr[i][j] = sc.nextInt();
            }

        int lsum = 0, rsum = 0;
        for (i = 0; i < n; i++)
            for (j = 0; j < n; j++) {
                lsum = lsum + arr[i][i];
                rsum = rsum + arr[i][n - i - 1];
            }
        System.out.println("Left Diagonal Sum = " + lsum);
        System.out.println("Right Diagonal Sum = " + rsum);
    }
}
