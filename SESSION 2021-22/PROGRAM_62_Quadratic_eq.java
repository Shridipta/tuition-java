public class PROGRAM_62_Quadratic_eq
{
    public static void main (int a, int b, int c)
    {
        double dis = b*b - 4*a*c;
        double r1, r2;
        if (dis < 0)
        {
            System.out.println("The roots are imaginary");
            return;
        }
        r1 = (-b + Math.sqrt(dis))/(2*a);
        r2 = (-b - Math.sqrt(dis))/(2*a);
        if (dis > 0)
            System.out.println("The roots are real and unequal");
        else
            System.out.println("The roots are real and equal");
        System.out.println("the first root is = " + r1);
        System.out.println("the second root is = " + r2);
    }
}
