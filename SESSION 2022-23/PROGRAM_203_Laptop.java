import java.util.*;
public class PROGRAM_203_Laptop
{
    private String name;
    private double price, dis, amt;
    void accept(String n, double p)
    {
        name = n;
        price = p;
    }
    void compute()
    {
        if(price<=25000)
        dis = 5.0/100*price;
        if(price<=50000)
        dis = 7.5/100*price;
        if(price<=25000)
        dis = 10.0/100*price;
        else
        dis = 15.0/100*price;
        amt = price-dis;
    }
    void display()
    {
        System.out.println("your name is = "+name);
        System.out.println("the discount offered is = "+dis);
        System.out.println("the amount to be paid is = "+amt);

    }
    public static void main(String [] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your name");
        String n = sc.nextLine();
        System.out.println("Enter the price");
        int p = sc.nextInt();
        PROGRAM_203_Laptop l1 = new PROGRAM_203_Laptop();
        l1.accept(n, p);
        l1.compute();
        l1.display();
    }
}
