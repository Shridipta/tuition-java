import java.util.*;
public class PROGRAM_155_HighLow_func
{
    public void main()
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Number of numbers = ");
        int n = sc.nextInt();
        System.out.println("Enter the numbers ");
        int highest = 0, i;
        for (i = 1; i<=n;i++)
        {
            int num = sc.nextInt();
            highest = max(highest, num);
        }
        System.out.println("Max = "+ highest);
    }
    int max(int a, int b)
    {
        return (a>b ? a : b);
    }
}
