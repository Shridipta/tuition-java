import java.util.Scanner;

public class PROGRAM_248_LuckyNumbers {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of n");
        int n = sc.nextInt();

        int arr[] = new int[n];
        int i, k = 0, c = 2;

        for (i = 0; i < n; i++)
            arr[i] = i + 1;

        while (c <= n) 
        {
            for (i = 0; i < n; i++)
                if (i + 1 % c != 0)
                    arr[k++] = arr[i];
            n = k;
            c++;
            k = 0;
        }

        System.out.println("Lucky Numbers are");
        for (i = 0; i < n; i++)
            System.out.println(arr[i]);
    }
}
