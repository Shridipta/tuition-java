import java.util.Scanner;

public class PROGRAM_262_SaddlePoint {
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

        for(i = 0;i<m;i++)
        {
            int k = minOfRow(arr[i]);
            int max = 1;
            for (j = 0;j<m;j++)
            if (arr[j][k]>max)
            max = arr[j][k];
        }
        if(max == arr[i][n])
        {
            System.out.println("Saddle Point = "+i+n);
            return;
        }

        
    }
    int minOfRow(int arr[])
    {

    }
}
