import java.util.Scanner;

public class PROGRAM_258_TransposeMatrix {
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
        int tran[][] = new int[c][r];
        System.out.println("Transposed Matrix");
        for (i = 0; i < c; i++) {
            for (j = 0; j < r; j++)
                System.out.println(tran[i][j] + " ");
            System.out.println();
        }
    }
}
