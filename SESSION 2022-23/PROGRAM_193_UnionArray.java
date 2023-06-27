import java.util.*;

public class PROGRAM_193_UnionArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of elements");
        int n = sc.nextInt();
        int a[] = new int[n];
        System.out.println("Enter the elements");
        for (int i = 0; i < n; i++)
            a[i] = sc.nextInt();

        System.out.println("Enter the number of elements");
        n = sc.nextInt();
        int b[] = new int[n];
        System.out.println("Enter the elements");
        for (int i = 0; i < n; i++)
            b[i] = sc.nextInt();

        int n1 = a.length, n2 = b.length, i, j, k = 0, count;
        int c[] = new int[n1 + n2];
        for (i = 0; i < n1; i++)
            c[k++] = a[i];
        for (i = 0; i < n2; i++) {
            count = 0;
            for (j = 0; j < n1; j++)
                if (a[j] == b[i])
                    count++;
            if (count == 0)
                c[k++] = b[i];
        }
        System.out.println("Union Array");
        for (i = 0; i < k; i++)
            System.out.println(c[i]);
    }
}
