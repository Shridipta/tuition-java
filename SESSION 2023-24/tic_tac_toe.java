import java.util.*;
public class tic_tac_toe {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Size? ");
        int n = sc.nextInt();
        int a[] = new int[n];
        for (int i = 0; i< n;i++)
        {
            a[i][] = new int[n];
            for (int j = 0; j<n;j++)
            {
                a[i][j] = 0;
            }
        }
        
        for(int i = 0;i<n;i++)
        {
            for (int j = 0; j<n;j++)
            {
                System.out.println(a[i][j] +" "); 
            }
            System.out.println();
        }

    }
}
