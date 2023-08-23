import java.util.Scanner;

public class PROGRAM_282_Matrix {
    int A[][];
    int M;
    int sum;

    PROGRAM_282_Matrix() {
        M = 0;
        sum = 0;
    }

    void accept_display() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows and columns");
        M = sc.nextInt();

        if (M > 3 && M < 10) {
            A = new int[M][M];
            int i, j;
            for (i = 0; i < M; i++)
                for (j = 0; j < M; j++) {
                    System.out.println("Enter the data");
                    A[i][j] = sc.nextInt();
                }
            display();
        } else
            System.out.println("THE MATRIX IS OUT OF RANGE.");

    }

    void sortrow() {
        int i, j, k, temp;
        for (k = 0; k < 3; k++) {
            for (i = 0; i < 3; i++) {
                for (j = i + 1; j < 3; j++) {
                    if (A[k][i] > A[k][j]) {
                        temp = A[k][i];
                        A[k][i] = A[k][j];
                        A[k][j] = temp;
                    }
                }
            }
        }
    }

    void transpose() {
        int i, j;
        int[][] tran = new int[M][M];
        for (i = 0; i < M; i++) {
            for (j = 0; j < M; j++)
                tran[i][j] = A[j][i];
        }
        A = tran;
    }

    void rearrange() { // sort row-col
        sortrow();
        transpose();
        sortrow();
        transpose();
    }

    void arrange() {
        int c = 0, d = 0;
        int arr[] = new int[(M - 2) * (M - 2)];
        for (int i = 1; i < M - 1; i++) {
            for (int j = 1; j < M - 1; j++) {
                arr[c++] = A[i][j];
            }
        }

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        for (int i = 1; i < M - 1; i++) {
            for (int j = 1; j < M - 1; j++) {
                A[i][j] = arr[d++];
            }
        }

    }

    void printMatrix() {
        int i, j;
        for (i = 0; i < M; i++) {
            for (j = 0; j < M; j++)
                System.out.print(A[i][j] + "\t");
            System.out.println();
        }
    }

    void printDiagonals() {
        int i, j;
        for (i = 0; i < M; i++) {
            for (j = 0; j < M; j++) {
                if (i == j || i == (M - j - 1))
                    System.out.print("" + A[i][j] + " ");
                else
                    System.out.print("  ");
            }
            System.out.println();
        }
    }

    void sumDiagonals() {
        int sum = 0, i, j;
        for (i = 0; i < M; i++)
            for (j = 0; j < M; j++) {
                if (i == j || i == (M - j - 1))
                    sum += A[i][j];
            }
        System.out.println("SUM OF THE DIAGONAL ELEMENTS = " + sum);

    }

    void display() {

        System.out.println("ORIGINAL MATRIX");
        printMatrix();

        System.out.println("REARRANGED MATRIX");
        arrange();
        printMatrix();

        System.out.println("DIAGONAL ELEMENTS");
        printDiagonals();

        sumDiagonals();
    }

    public static void main(String[] args) {
        PROGRAM_282_Matrix obj = new PROGRAM_282_Matrix();
        obj.accept_display();
    }
}
