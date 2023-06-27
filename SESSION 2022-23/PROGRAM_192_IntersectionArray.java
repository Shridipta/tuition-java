import java.util.*;
public class PROGRAM_192_IntersectionArray
{
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
        int n1 = a.length, n2 = b.length, i, j, k = 0, p, q;
        int c[] = new int [n1+n2];
        for (i=0; i<n1; i++)
        {
            p = a[i];
            for (j=0; j<n2; j++)
            {
                q = b[j];
                if (p == q)
                    c[k++] = q;
            }
        }
        System.out.println("Intersection Array");
        for (i=0; i<k; i++)
            System.out.println(c[i]);
    }
}
