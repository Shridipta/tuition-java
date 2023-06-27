import java.util.*;
public class PROGRAM_205_Population
{
    private float p,r;
    public PROGRAM_205_Population(int a, int b)
    {
        p = a;
        r = b;
    }
    void print()
    {
        int i;
        for(i = 1;i<=7;i++)
        {
            p = (float) (p*(1+r/100.0));
            System.out.println("Population at end of 200"+i+" is "+p);
        }
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter initial population and growth rate");
        int a = sc.nextInt();
        int b = sc.nextInt();
        PROGRAM_205_Population p1 = new PROGRAM_205_Population(a, b);
        p1.print();
    }
}
