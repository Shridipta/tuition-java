import java.util.*;

public class PROGRAM_216_Fraction
{
    int num, den;
    PROGRAM_216_Fraction (int num, int den)
    {
        this.num = num;
        this.den = den;
    }
    int hcf(int a, int b)
    {
        while(a!=b)
        {
            if(a>b)
            a = a-b;
            else if(b>a)
            b = b-a;
        }
        return a;
    }
    int lcm(int a, int b)
    {
        int hcf1 = hcf(a, b);
        return (a*b)/hcf1;
    }
    void reduce ()
    {
        int hcf2 = hcf(num, den);
        num = num/hcf2;
        den = den/hcf2;
    }
    void display()
    {
        System.out.println(num + "/" + den);
    }
    PROGRAM_216_Fraction addTo (PROGRAM_216_Fraction f)
    {
        int lcm1 = lcm(den, f.den);
        PROGRAM_216_Fraction f3 = new PROGRAM_216_Fraction(0, 0);
        f3.den = lcm1;
        f3.num = (lcm1/den)*num +(lcm1/f.den)*f.num;
        return f3;

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter first fraction");
        int num1 = sc.nextInt();
        int den1 = sc.nextInt();
        System.out.println("Enter second fraction");
        int num2 = sc.nextInt();
        int den2 = sc.nextInt();
        PROGRAM_216_Fraction f1 = new PROGRAM_216_Fraction(num1, den1);
        PROGRAM_216_Fraction f2 = new PROGRAM_216_Fraction(num2, den2);
        f1.reduce();
        f1.display();
        f2.reduce();
        f2.display();
        PROGRAM_216_Fraction f3 = f1.addTo(f2);
        f3.reduce();
        f3.display();
    }
}