import java.util.Scanner;

public class PROGRAM_256_SumRowColumn {
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
        int m = arr.length, n = arr[0].length;
        int sum = 0;
        for (i = 0; i < m; i++) {
            for (j = 0; j < n; j++)
                sum += arr[i][j];
            System.out.println("Sum of row " + (i + 1) + " = " + sum);
        }
        for (i = 0; i < n; i++) {
            sum = 0;
            for (j = 0; j < m; j++)
                sum += arr[i][j];
            System.out.println("Sum of column " + (i + 1) + " = " + sum);
        }
    }
}
