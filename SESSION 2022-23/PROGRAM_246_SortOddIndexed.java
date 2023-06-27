import java.util.*;

class PROGRAM_246_SortOddIndexed
{
    public static void main(String[] args) {
        
        Scanner sc = new Scanner (System.in);
        int a[] = new int[10];
        System.out.println("Enter the elements");
        for(int i = 0;i<10;i++)
            a[i] = sc.nextInt();

        for(int i = 0;i<10-1;i++)
        {
            for (int j = 0;j<10-i-1;j++)
            {
                if (j%2 == 1)
                    if (a[j]<a[j+2])
                    {
                        int temp = a[j];
                        a[j] = a[j+2];
                        a[j+2] = temp;
                    }
            } 
        }
        for(int i = 0;i<10;i++)
        System.out.print(a[i] + " " );
        
        
    }
}