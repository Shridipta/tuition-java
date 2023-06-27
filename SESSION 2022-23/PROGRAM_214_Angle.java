import java.util.*;
public class PROGRAM_214_Angle    //replace all PROGRAM_214_Angle with Angle
{
    int deg, min;
    public PROGRAM_214_Angle(int deg, int min)
    {
        this.deg = deg;
        this.min = min;
    }

    PROGRAM_214_Angle sumAngle (PROGRAM_214_Angle a1, PROGRAM_214_Angle a2)
    {
        int sum = a1.deg *60 + a1.min + a2.deg*60 + a2.min;
        PROGRAM_214_Angle a3 = new PROGRAM_214_Angle(0, 0);
        a3.deg = sum/60;
        sum = sum%60;
        a3.min = sum;
        return a3;
    }

    void diffAngle(PROGRAM_214_Angle a1)
    {
        int diff = (this.deg*60 + this.min) - (a1.deg*60 + a1.min);
        int diffdeg = diff/60;
        diff = diff%60;
        int diffmin = diff;
        System.out.println("Degrees = " + diffdeg + "Minutes = " + diffmin);
    }

    void display()
    {
        System.out.println("Degrees = " + this.deg + "Minutes = " + this.min);
    }

    public static void main(String[] args)
    {
        System.out.println("Enter degrees and minutes");
        System.out.println("Enter another degrees and minutes");
        Scanner sc = new Scanner(System.in);
        int deg1 = sc.nextInt();
        int min1 =  sc.nextInt();
        PROGRAM_214_Angle a1 = new PROGRAM_214_Angle(deg1, min1);
        int deg2 = sc.nextInt();
        int min2 =  sc.nextInt();
        PROGRAM_214_Angle a2 = new PROGRAM_214_Angle(deg2, min2);
        PROGRAM_214_Angle a3 = new PROGRAM_214_Angle(0, 0);
        a3 = a3.sumAngle (a1, a2);
        a3.display();
        a1.diffAngle(a2);
    }
}

