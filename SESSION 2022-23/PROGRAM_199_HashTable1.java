import java.util.*;
public class PROGRAM_199_HashTable1
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

        for (int i = 0; i < arr.length; i++)
        {
            int count = 0;
            for (int j = 0; j < arr.length; j++)
            {
                if (arr[j] == arr[i] && j<i)
                    break;
                else if (arr[j] == arr[i])
                    count++;
            }
            if (count >= 1)
                    System.out.println("Frequency of " + arr[i] + "= " + count);
        }
   }
}
