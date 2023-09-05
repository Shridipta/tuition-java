//not working

import java.util.Scanner;

public class PROGRAM_262_SaddlePoint {
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
        System.out.println("Enter the number of rows");
        int m = sc.nextInt();
        System.out.println("Enter the number of columns");
        int n = sc.nextInt();
        int arr[][] = new int[m][n];
        int i, j;

        for (i = 0; i < m; i++)
            for (j = 0; j < n; j++) {
                System.out.println("Enter the data");
                arr[i][j] = sc.nextInt();
            }

        print(arr);

        for (i = 0; i < m; i++) {
            int k = minOfRow(arr[i]);
            int max = arr[i][k];

            for (j = 0; j < n; j++) {
                if (arr[j][k] > max) {
                    max = arr[j][k];
                }
            }
            if (max == arr[i][k]) {
                System.out.println("Saddle Point at " + i + ", " + k);
                System.out.println("Saddle Point = " + arr[i][k]);
                return;
            }
        }

        System.out.println("No saddle point found.");
    }

    static int minOfRow(int[] row) {
        int minIndex = 0;

        for (int i = 1; i < row.length; i++) {
            if (row[i] < row[minIndex]) {
                minIndex = i;
            }
        }
        return minIndex;
    }
}