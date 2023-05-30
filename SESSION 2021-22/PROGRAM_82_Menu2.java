import java.util.*;
public class PROGRAM_82_Menu2
{
    public static void main()
    {
        Scanner sc = new Scanner (System.in);
        int i, ch, n, x;
        while (true)
        {
            System.out.println("1. x - x^2/2! + x^3/3!");
            System.out.println("2. display the 1st n terms of pell series");
            System.out.println("3. display all the 3 digit palindrome no.");
            System.out.println("4. Exit");
            System.out.println("Enter your choice");
            ch = sc.nextInt();
            if (ch == 4)
                break;
            switch (ch)
            {
                case 1: 
                    System.out.println("Enter the value of n");
                    n = sc.nextInt();
                    System.out.println("Enter the value of x");
                    x = sc.nextInt();
                    int term, sign = 1, f = 1, j = 1;
                    for (j = 1; j <= n; j++)
                    {
                        f*=j;
                    }
                    for (i = 1; i <= n; i++)
                    {
                        term = (int)(Math.pow(x, i)/f) * sign;
                        System.out.println(term + " ");
                        sign = sign * -1;
                    }
                case 2:
                    System.out.println("Enter the number of terms of pell series");
                    n = sc.nextInt();
                    int a = 1, b = 0, c;
                    for (i = 1; i <= n; i++)
                    {
                        c = a + 2 * b;
                        System.out.println(c +" ");
                        a = b;
                        b = c;
                    }
                    break;
                case 3:
                    int copy;
                    for (i = 100; i<=999; i++)
                    {
                        copy = i;
                        int d1 = copy % 10;
                        copy = copy / 10;
                        int d2 = copy % 10;
                        copy = copy / 10;
                        int d3 = copy % 10;
                        if (d1 == d3)
                        System.out.println(i);
                    }
                default:
                    System.out.println("Wrong Input");
            }//end of switch
        }//end of while
    }//end of main
}//end of class

