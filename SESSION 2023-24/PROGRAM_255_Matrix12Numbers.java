public class PROGRAM_255_Matrix12Numbers {
    public static void main(String[] args) {
        int arr[][] = new int[3][4];
        int i, j, k = 0;
        for (i = 0; i < 3; i++)
            for (j = 0; j < 4; j++)
                arr[j][i] = k++;
        System.out.println("Matrix of 1st 12 Natural Numbers");
        for (i = 0; i < 3; i++) {
            for (j = 0; j < 4; j++)
                for (j = 0; j < 4; j++)
                    System.out.print(arr[i][j]);
            System.out.println();
        }
    }
}
