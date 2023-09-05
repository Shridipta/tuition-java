//working

import java.util.Scanner;

public class PROGRAM_260_SymmetricMatrix {
    static void print(int arr[][]) {
        int n = arr.length;
        int i, j;
        System.out.println("The Matrix is");
        for (i = 0; i < n; i++) {
            for (j = 0; j < n; j++)
                System.out.print(arr[i][j] + "\t");
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows");
        int n = sc.nextInt();
        int arr[][] = new int[n][n];
        int i, j;
        for (i = 0; i < n; i++)
            for (j = 0; j < n; j++) {
                System.out.println("Enter the data");
                arr[i][j] = sc.nextInt();
            }

        print(arr);
        int flag = 0;
        for (i = 0; i < n; i++)
            for (j = 0; j < n; j++) {
                if (arr[i][j] != arr[j][i]) {
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
