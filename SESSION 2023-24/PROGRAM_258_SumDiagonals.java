import java.util.Scanner;

public class PROGRAM_258_SumDiagonals {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows");
        int r = sc.nextInt();
        System.out.println("Enter the number of columns");
        int c = sc.nextInt();
        int arr[][] = new int[r][c];
        int i, j;
        for (i = 0; i < r; i++)
            for (j = 0; j < c; j++) {
                System.out.println("Enter the data");
                arr[i][j] = sc.nextInt();
            }

        int lsum = 0, rsum = 0;
        for (i = 0; i < r; i++)
            for (j = 0; j < c; j++) {
                lsum = lsum + arr[i][i];
                rsum = rsum + arr[i][n - i - 1];
            }
        System.out.println("Left Diagonal Sum = " + lsum);
        System.out.println("Right Diagonal Sum = " + rsum);
    }
}
