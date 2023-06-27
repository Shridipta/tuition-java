import java.util.*;
public class PROGRAM_154_Highest_func
{
    public static void main(int a, int b, int c, int d)
    {
        int highest = max(max(a, b), max(c, d));
        System.out.println("Highest = "+highest);
    }
    static int max(int a, int b)
    {
    return (a>b ? a : b);
    }
}
