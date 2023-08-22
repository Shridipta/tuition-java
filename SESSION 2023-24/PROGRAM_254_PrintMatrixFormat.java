import java.util.Scanner;

public class PROGRAM_254_PrintMatrixFormat {
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
        System.out.println("The data in matrix format");
        for (i = 0; i < r; i++) {
            for (j = 0; j < c; j++)
                System.out.print(arr[i][j]);
            System.out.println();
        }
    }
}
