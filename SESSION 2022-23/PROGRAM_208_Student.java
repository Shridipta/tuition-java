import java.util.*;


public class PROGRAM_208_Student {
    String name;
    int mm, scm, comp;

    public PROGRAM_208_Student() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your name");
        name = sc.nextLine();
        System.out.println("Enter your marks in maths");
        mm = sc.nextInt();
        System.out.println("Enter your marks in science");
        scm = sc.nextInt();
        System.out.println("Enter your marks in computer");
        comp = sc.nextInt();
    }

    int check() {
        if (mm > 90 && scm > 90 && comp > 90)
            return 1;
        double avg = (mm + scm + comp) / 3.0;
        if (avg > 90)
            return 2;
        else if (avg > 80)
            return 3;
        return 0;
    }

    void display() {
        int isEligible = check();
        if (isEligible == 1)
            System.out.println("Science with computer");
        else if (isEligible == 2)
            System.out.println("Bio-science");
        else
            System.out.println("Science with hindi");
    }

    public static void main(String[] args) {
        PROGRAM_208_Student s1 = new PROGRAM_208_Student();
        s1.display();
    }
}
