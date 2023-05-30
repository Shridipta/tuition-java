public class PROGRAM_118_Fibo
{
    public static void main(int n)
    {
        int a = 1, b = 0, c = 0;
        while (c <= n)
        {
            c = a+b;
            a = b;
            b = c;
            if (c == n)
            {
                System.out.println("It is there");
                return;
            }
        }
        System.out.println("It is not there");
    }
}
