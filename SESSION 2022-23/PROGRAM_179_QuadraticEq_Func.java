import java.util.*;
public class PROGRAM_179_QuadraticEq_Func
{
    public static void main(int a, int b, int c)
    {
        int d = discriminant(a, b, c);
        if(d<0)
        {
            System.out.println("Complex Root");
            return;
        }
        else if(d==0)
        {
            System.out.println("Root are real and equal");
            findroots(a, b, c);
        }
        else
        {
            System.out.println("Root are real and unequal");
            findroots(a, b, c);
        }
    }

    static int discriminant(int a, int b, int c)
    {
        return b*b-4*a*c;
    }

    static void findroots(int a, int b, int c)
    {
        int d = discriminant(a, b, c);
        double r1 = (-b + Math.sqrt(d))/(2*a);
        System.out.println("First Root = ");
        double r2 = (-b - Math.sqrt(d))/(2*a);
        System.out.println("Second Root = ");
    }
}
