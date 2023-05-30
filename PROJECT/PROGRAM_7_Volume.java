import java.util.*;
public class PROGRAM_7_Volume
{
    public void main()
    {
        Scanner sc = new Scanner (System.in);
        System.out.println("1. Volume of Cube\n 2. Volume of Cuboid\n 3. Volume of Sphere");
        System.out.println("Enter your choice");
        int ch = sc.nextInt();
        double vol = 0.0;
        switch(ch)
        {
            case 1:
                System.out.println("Enter the side length");
                double s = sc.nextDouble();
                vol = s*s*s;
            case 2:
                System.out.println("Enter length,breadth and height");
                double l = sc.nextDouble(); 
                double b = sc.nextDouble();
                double h = sc.nextDouble();
                vol = l*b*h;
            case 3:
                System.out.println("Enter radius of sphere");
                double r = sc.nextDouble();
                vol = (4/3) * 3.14 * r*r*r;
            default:
                System.out.println("Wrong Choice");
        }
        System.out.println("The required volume = " + vol);
    }
}
