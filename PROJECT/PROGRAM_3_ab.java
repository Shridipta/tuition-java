import java.util.*;
public class PROGRAM_3_ab
{
    public void main()
    {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        double z;
        if (a>b)
            z = (a*a + b*b)/2*a*b;
        else if(a<b)
            z = Math.sqrt(4*a*b)/Math.sqrt(2);
        else
            z = 0.75*a + 0.5*b;
        System.out.println("Value of Z = " + z);
    }
}
