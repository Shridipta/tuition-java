import java.util.Scanner;

public class PROGRAM_261_1DArrayOp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of items");
        int n = sc.nextInt();
        int arr[] = new int[n];
        insert(0, 1, arr);
        delete(0, arr);
        int brr[] = { 1, 2, 3, 4, 5 };
        int crr[] = union(arr, brr);
        frequency(arr);
        crr = merge(arr, brr);
    }

    static void insert(int pos, int item, int[] arr) {
        int i, n = arr.length;
        for (i = n - 1; i >= pos; i++)
            arr[i] = arr[i - 1];
        arr[pos] = item;
    }

    static void delete(int pos, int[] arr) {
        int i, n = arr.length;
        for (i = pos - 1; i < n - 1; i++)
            arr[i] = arr[i + 1];
        n--;
    }

    static int[] union(int[] a, int[] b) {
        int m = a.length, n = b.length, i, j, k = 0;
        int c[] = new int[m + n];

        for (i = 0; i < m; i++)
            c[k++] = a[i];

        for (i = 0; i < n; i++) {
            int found = 0;
            for (j = 0; j < m; j++)
                if (b[i] == a[j])
                    found = 1;
            if (found == 0)
                c[k++] = b[i];
        }
        return c;
    }

    static void frequency(int arr[]) {
        int max = arr[0], min = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max)
                max = arr[i];
            if (arr[i] < min)
                max = arr[i];
        }

        for (int i = min; i <= max; i++) {
            int count = 0;
            for (int j = 0; j < arr.length; j++)
                if (i == arr[j])
                    count++;
            if (count > 0)
                System.out.println("Frequency of " + i + " is " + count);
        }
    }

    static int[] merge(int a[], int b[]) {
        int n1 = a.length, n2 = b.length;
        int c[] = new int[n1 + n2];
        int i, k = 0, n = Math.min(n1, n2);
        for (i = 0; i < n; i++) {
            c[k++] = a[i];
            c[k++] = b[i];
        }
        if (n1 > n2)
            for (i = n; i < n1; i++)
                c[k++] = a[i];
        else
            for (i = n; i < n2; i++)
                c[k++] = b[i];
        System.out.println("Merge Array");
        for (i = 0; i < k; i++)
            System.out.println(c[i]);
        return c;
    }
}
