import java.util.*;

public class PROGRAM_201_SelectionSort {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements");
        int n = sc.nextInt();
        int arr[] = new int[n];

        System.out.println("Enter the array elements");
        for (int i = 0; i < n; i++)
            arr[i] = sc.nextInt();

        int i, j, pos, temp, min;
        for (i = 0; i < n - 1; i++) {
            min = arr[i];
            pos = i;
            for (j = i + 1; j < n; j++)
                if (arr[j] < min) {
                    min = arr[j];
                    pos = j;
                }
            temp = arr[i];
            arr[i] = arr[pos];
            arr[pos] = temp;
        }
        System.out.println("Array in ascending order");
        for (i = 0; i < n; i++)
            System.out.println(arr[i]);
    }
}
