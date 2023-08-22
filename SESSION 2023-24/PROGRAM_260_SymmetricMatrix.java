import java.util.Scanner;

public class PROGRAM_260_SymmetricMatrix {
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
        int flag = 0;
        for (i = 0; i < m; i++)
            for (j = 0; j < n; j++) {
                if (arr[i][j] == arr[j][i]) {
                    flag = 1;
                    break;
                }
            }
        if (flag == 1)
            System.out.println("Not Symmetric Matrix");
        else
            System.out.println("Symmetric Matrix");
    }

}
