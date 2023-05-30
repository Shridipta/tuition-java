public class PROGRAM_77_Quadrilateral
{
    public static void main (int a, int b, int c, int d, int an)
    //
    {
        if (a == b && b == c && c == d && an == 90)
        {
            System.out.println("Square");
            return;
        }
        else if (a == b &&  b == c && c == d && an != 90)
        {
            System.out.println("Rhombus");
            return;
        }
        else if (a == b && c == d && an == 90)
            System.out.println("Rectangle");
        else if (a == b && c == d && an != 90 )
            System.out.println("Parallelogram");
        else
            System.out.println("Other Type");
    }
}