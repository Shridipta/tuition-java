import java.util.*;
public class PROGRAM_185_ReverseArray
{
    public static void main()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of numbers");
        int n = sc.nextInt();
        int arr[] = new int[n];
        int i , temp;
        for(i=0;i<n;i++)
        {
            System.out.println("Enter the element");
            arr[i]=sc.nextInt();
        }
        for(i=0;i<n/2;i++)
        {
            temp=arr[i];
            arr[i] = arr[n-i-1];
            arr[n-i-1]=temp;
        }
        System.out.println("Array in Reverse");
        for(i=0;i<n;i++)
        System.out.println(arr[i]);
   }
}
