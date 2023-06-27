import java.util.*;

public class PROGRAM_213_Point
{
    int x, y, z;
    PROGRAM_213_Point(int a, int b)
    {
        x = a; y = b;
    }
    PROGRAM_213_Point midPROGRAM_213_Point(PROGRAM_213_Point p)
    {
        PROGRAM_213_Point p1 = new PROGRAM_213_Point(0, 0);
        p1.x = (p.x + x)/2;
        p1.y = (p.y + y)/2;
        return p1;
    }
    void findDistance(PROGRAM_213_Point p1, PROGRAM_213_Point p2)
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
        PROGRAM_213_Point p1 = new PROGRAM_213_Point(5, 8);
        PROGRAM_213_Point p2 = new PROGRAM_213_Point(10,12);
        PROGRAM_213_Point p3 = new PROGRAM_213_Point(0, 0);
        p1.findDistance(p1, p2);
        p3 = p1.midPROGRAM_213_Point(p2);
        p3.display();
    }
    public void change_z(){
        this.z = 5;
    }
}
