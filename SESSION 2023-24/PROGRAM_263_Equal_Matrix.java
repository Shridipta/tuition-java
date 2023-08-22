import java.util.Scanner;

public class PROGRAM_263_Equal_Matrix {
    int arr[][], row, col;

    PROGRAM_263_Equal_Matrix(int m, int n) {
        arr = new int[m][n];
        row = m;
        col = n;
    }

    void acceptData() {
        Scanner sc = new Scanner(System.in);
        int i, j;
        for (i = 0; i < row; i++)
            for (j = 0; j < col; j++) {
                System.out.println("Enter the data");
                arr[i][j] = sc.nextInt();
            }
    }

    void checkEqual(PROGRAM_263_Equal_Matrix M) {
        int i, j, flag = 0;
        for (i = 0; i < row; i++)
            for (j = 0; j < col; j++)
                if (arr[i][j] != M.arr[i][j]) {
                    flag = 1;
                    break;
                }
        if (flag == 1)
            System.out.println("Unequal");
        else
            System.out.println("Equal");
    }

    void display() {
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++)
                System.out.print(arr[i][j] + " ");
            System.out.println();
        }
    }

    public static void main(String[] args) {
        PROGRAM_263_Equal_Matrix obj1 = new PROGRAM_263_Equal_Matrix(3, 4);
        PROGRAM_263_Equal_Matrix obj2 = new PROGRAM_263_Equal_Matrix(3, 4);
        obj1.acceptData();
        obj2.acceptData();
        obj1.display();
        obj2.display();
        obj1.checkEqual(obj2);
    }
}
