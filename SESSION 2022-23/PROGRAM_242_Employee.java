import java.util.*;

public class PROGRAM_242_Employee {
    String name;
    int empcode;
    double salary, gross, tax;

    PROGRAM_242_Employee() {
        name = "";
        empcode = 0;
        salary = gross = tax = 0.0;
    }

    void accept() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter name, employee code, salary");
        name = sc.nextLine();
        empcode = sc.nextInt();
        salary = sc.nextDouble();
    }

    void calculate() {
        gross = salary + 80 / 100.0 * salary + 30 / 100.0 * salary;
        if (gross <= 300000)
            tax = 0.0;
        else if (gross <= 60000)
            tax = salary + 10 / 100.0 * 300000;
        else if (gross > 600000)
            tax = salary + 10 / 100.0 * 300000;

    }

    void display() {
        System.out.println("name = " + name);
        System.out.println("employee code = " + empcode);
        System.out.println("gross = " + gross);
        System.out.println("tax = " + tax);
        System.out.println("salary" + salary);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of employees = ");
        int n = sc.nextInt();
        PROGRAM_242_Employee[] a = new PROGRAM_242_Employee[n];
        for (int i = 0; i < n; i++) {
            a[i] = new PROGRAM_242_Employee();
            a[i].accept();
            a[i].calculate();
        }

        for (int i = 0; i < n; i++)
            a[i].display();
    }
}
