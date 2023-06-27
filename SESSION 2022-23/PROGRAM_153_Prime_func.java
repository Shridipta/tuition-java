import java.util.*;
public class PROGRAM_153_Prime_func
{
    public static void main(int x, int y)
    {
        for (int i = x; i<=y ; i++)
            if(isprime(i))
                System.out.print(i + " ");
    }
    static boolean isprime(int num)
    {
        int i, c=0;
        for(i = 1; i<=num ; i++)
            if (num%i == 0)
                c++;
        return (c==2);
    }
}
