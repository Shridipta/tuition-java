import java.util.*;

public class PROGRAM_209_TelBill {
    int bno, call;
    double amt;
    String name;

    public PROGRAM_209_TelBill() {
        bno = 0;
        amt = 0.0;
        name = "";
    }

    public PROGRAM_209_TelBill(int bno, int call, String name) {
        this.bno = bno;
        this.call = call;
        this.name = name;
    }

    void display() {
        amt = 0.25 * call;
        System.out.println("The amount is = " + amt);
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter name, bill no and no of calls");
        String name = sc.nextLine();
        int bno = sc.nextInt();
        int call = sc.nextInt();
        PROGRAM_209_TelBill b1 = new PROGRAM_209_TelBill(bno, call, name);
        b1.display();
    }
}