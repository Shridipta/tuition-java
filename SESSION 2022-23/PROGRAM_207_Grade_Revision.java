import java.util.*;

public class PROGRAM_207_Grade_Revision {
    String name;
    int bas, expn;
    double inc, nbas;

    public PROGRAM_207_Grade_Revision() {
        name = "";
        bas = 0;
        expn = 0;
        inc = 0.0;
        nbas = 0.0;
    }

    void accept() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter name, basic salary and experience in years");
        name = sc.nextLine();
        bas = sc.nextInt();
        expn = sc.nextInt();
    }

    void increment() {
        if (bas < 3)
            inc = 1000.0 + (10 / 1000) * bas;
        if (bas < 5)
            inc = 3000.0 + (12 / 1000) * bas;
        if (bas < 10)
            inc = 5000.0 + (15 / 1000) * bas;
        else
            inc = 8000.0 + (20 / 1000) * bas;
    }
    void display()
    {
        nbas=bas+inc;
        System.out.println("Name = "+name);
        System.out.println("Basic salary = "+bas);
        System.out.println("Experience in years = "+expn);
        System.out.println("Increment in salary = "+inc);
        System.out.println("New basic salary = "+nbas);
    }
    public static void main(String[] args) {
        PROGRAM_207_Grade_Revision gr1 = new PROGRAM_207_Grade_Revision();
        gr1.accept();
        gr1.increment();
        gr1.display();
    }
}
