public class PROGRAM_264_2DArrayOp {
    int row, col;
    int arr[][];

    public static void main(String[] args) {

    }

    void findSum() {
        int lsm = 0, rsm = 0, i, j;
        for (i = 0; i < row; i++) {
            for (j = 0; j < col; j++) {
                if (i >= j)
                    lsm += arr[i][j];
                if (j >= i)
                    rsm += arr[i][j];
            }

        }
    }

    void boundarySum() {
        int bsum = 0, nsum = 0, i, j;
        for (i = 0; i < row; i++) {
            for (j = 0; j < col; j++) {
                if (i == 0 || i == row || j == 0 || j == col - 1)
                    bsum += arr[i][j];
                else
                    nsum += arr[i][j];
            }
        }
    }
    void swapRows(int x, int y)
    {
        int i, j, temp;
        for (i = 0; i < row; i++) {
            
        }
    }
}
