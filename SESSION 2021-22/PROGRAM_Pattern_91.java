public class PROGRAM_Pattern_91
{
    public static void main(int n)
    {
        int i, j;
        for (i = 1; i <= n; i++)
        {
            for (j = i; j >= 1; j--)
            {
                if (j == i && j % 2 == 1)
                    System.out.print(j);
                else if (j % 2 == 1)
                    System.out.print('*');
                else
                    System.out.print('#');
            }
            System.out.println();
        }
    }
}
