import java.util.*;
public class PROGRAM_202_Marks
{
    public static void main()
    {
        int arr[] = new int[101], i, n, marks;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of students");
        n = sc.nextInt();
        for (i = 0; i<101;i++)
            arr[i] = 0;
        for(i=1;i<=n;i++)
        {
            System.out.println("Enter marks");
            marks = sc.nextInt();
            arr[marks]++;
        }
        for(i = 0;i<n;i++)
        {
            if(arr[i]>0)
                System.out.println(arr[i] + "marks if obtained by ");
        }
    }
}
