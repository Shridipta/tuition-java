import java.util.*;
public class projprog_1
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        double x1, x2, y1, y2, d;
        System.out.println("Enter the x and y coordinate of the first point");
        x1 = sc.nextDouble();
        y1 = sc.nextDouble();
        System.out.println("Enter the x and y coordinate of the second point");
        x2 = sc.nextDouble();
        y2 = sc.nextDouble();
        d = Math.sqrt( Math.pow((x2-x1), 2) + Math.pow((y2-y1), 2) );
        System.out.println("Distance between the two points = "+ d);
    }
}