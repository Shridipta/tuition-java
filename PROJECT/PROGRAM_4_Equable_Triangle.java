import java.util.*;
public class PROGRAM_4_Equable_Triangle
{
    public void main()
    {
        Scanner sc = new Scanner(System.in);
        double a =  sc.nextDouble();
        double b =  sc.nextDouble();
        double c =  sc.nextDouble();
        double peri = a+b+c;
        double s = (a+b+c)/2;
        double area = Math.sqrt( s*(s-a)*(s-b)*(s-c) );
        if (area == peri)
            System.out.println("Equable Triangle");
        else 
            System.out.println("Non Equable Triangle");
    }
}
