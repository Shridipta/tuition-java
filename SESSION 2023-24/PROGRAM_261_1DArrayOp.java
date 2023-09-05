//working

public class PROGRAM_261_1DArrayOp {
    public static void main(String[] args) {
        int arr[] = { 3, 4, 5, 6 };
        int brr[] = { 1, 2, 3, 4, 5 };
        frequency(arr);

        insert(1, 1, arr);
        delete(1, arr);
        union(arr, brr);
        merge(arr, brr);
    }

    static void insert(int pos, int item, int[] arr) {
        int i, n = arr.length;
        for (i = n - 1; i > pos; i--) // shifting the items right
            arr[i] = arr[i - 1]; // last element will be lost
        arr[pos] = item;

        System.out.println("New Array after Insertion");
        for (i = 0; i < n; i++)
            System.out.print(arr[i] + " ");
        System.out.println();
    }

    static void delete(int pos, int[] arr) {
        int i, n = arr.length;
        for (i = pos - 1; i < n - 1; i++)
            arr[i] = arr[i + 1];
        n--;

        System.out.println("New Array after Deletion");
        for (i = 0; i < n; i++)
            System.out.print(arr[i] + " ");
        System.out.println();
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

    static void union(int[] a, int[] b) {
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
        System.out.println("Union Array");
        for (i = 0; i < k; i++)
            System.out.print(c[i] + " ");
        System.out.println();
    }

    static void merge(int a[], int b[]) {
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
            System.out.print(c[i] + " ");
        System.out.println();
    }
}
