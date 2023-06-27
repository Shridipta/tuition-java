import java.util.*;

public class PROGRAM_215_Line {
    int x1, y1, x2, y2;
    double length;

    PROGRAM_215_Line(int a, int b, int c, int d) {
        x1 = a;
        y1 = b;
        x2 = c;
        y2 = d;
    }

    void distance() {
        length = (x2 - x1) * (x2 - x1) + (y2 - y1) * (y2 - y1);
        length = Math.sqrt(length);
        System.out.println("Distance = " + length);
    }

    void midpoint() {
        double x = (x2 + x1) / 2.0;
        double y = (y2 + y1) / 2.0;
        System.out.println("x = " + x + "y = " + y);
    }

    void display() {
        System.out.println("1st endpoint of line" + x1 + ", " + y1);
        System.out.println("2nd endpoint of line" + x2 + ", " + y2);
        System.out.println("length = " + length);
    }

    PROGRAM_215_Line compare(PROGRAM_215_Line l) {
        if (l.length > length)
            return l;
        else
            return this;

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 2 points of 1st line");
        int a1 = sc.nextInt();
        int b1 = sc.nextInt();
        int c1 = sc.nextInt();
        int d1 = sc.nextInt();
        PROGRAM_215_Line l1 = new PROGRAM_215_Line(a1, b1, c1, d1);

        System.out.println("Enter 2 points of 2nd line");
        int a2 = sc.nextInt();
        int b2 = sc.nextInt();
        int c2 = sc.nextInt();
        int d2 = sc.nextInt();
        PROGRAM_215_Line l2 = new PROGRAM_215_Line(a2, b2, c2, d2);

        l1.distance();
        l2.distance();
        PROGRAM_215_Line l3 = new PROGRAM_215_Line(0, 0, 0, 0);
        l3 = l1.compare(l2);
        l3.display();
    }
}
