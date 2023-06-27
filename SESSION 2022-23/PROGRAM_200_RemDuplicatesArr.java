import java.util.*;
public class PROGRAM_200_RemDuplicatesArr
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter the elements");
        for (int i = 0;i<n;i++)
            arr[i] = sc.nextInt();

        n = arr.length; int i, j, count, k=0;
        for (i=0; i<n; i++)
        {
            count = 0;
            for (j=i+1; j<n; j++)
            {
                if(arr[i] == arr[j])
                    count++;
            }
            if (count == 0)
                arr[k++] = arr[i];
        }
        System.out.println("Array without duplicates");
        for (i=0; i<arr.length; i++)
        {
            System.out.println(arr[i]);
        }
    }
}
