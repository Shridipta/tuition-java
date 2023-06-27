import java.util.*;

public class Point
{
    int x, y, z;
    Point(int a, int b)
    {
        x = a; y = b;
    }
    Point midPoint(Point p)
    {
        Point p1 = new Point(0, 0);
        p1.x = (p.x + x)/2;
        p1.y = (p.y + y)/2;
        return p1;
    }
    void findDistance(Point p1, Point p2)
    {
        int d= (p2.x-p1.x)*(p2.x-p1.x) +
                (p2.y-p1.y)*(p2.y-p1.y);
        d = (int)Math.sqrt(d);
        System.out.println("Distance = " + d);
    }
    void display()
    {
        System.out.println("x ="+x);
        System.out.println("y ="+y);
        System.out.println("z ="+z);
    }
    public static void main()
    {
        Point p1 = new Point(5, 8);
        Point p2 = new Point(10,12);
        Point p3 = new Point(0, 0);
        p1.findDistance(p1, p2);
        p3 = p1.midPoint(p2);
        p3.display();
    }
    public void change_z(){
        this.z = 5;
    }
}
