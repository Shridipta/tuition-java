import java.util.*;

public class PROGRAM_206_Quad {
    public float a, b, c, d;

    public PROGRAM_206_Quad(int x, int y, int z) {
        a = x;
        b = y;
        c = z;
        d = 0;
    }

    void calculate() {
        d = (b * b) - (4 * a * c);
        if (d < 0)
            System.out.println("Roots are not possible");
        else {
            double r1 = (-b + Math.sqrt(d)) / (2.0 * a);
            double r2 = (-b - Math.sqrt(d)) / (2.0 * a);
            System.out.println("First root = " + r1);
            System.out.println("Second root = " + r2);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of the coefficients");
        int x = sc.nextInt();
        int y = sc.nextInt();
        int z = sc.nextInt();
        PROGRAM_206_Quad q1 = new PROGRAM_206_Quad(x, y, z);
        q1.calculate();
    }
}
