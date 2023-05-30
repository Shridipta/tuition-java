import java.util.*;
public class PROGRAM_81_Menu1
{
    public static void main()
    {
        Scanner sc = new Scanner(System.in);
        int i, n = 0, c;
        while (true)
        {
            System.out.println("1. Check prime");
            System.out.println("2. Check perfect square");
            System.out.println("3. Check perfect");
            System.out.println("4. EXIT");
            int ch = sc.nextInt();
            if(ch == 4)
                break;
            if (ch <= 4)
            {
                System.out.println("Enter the number");
                n = sc.nextInt();
            }
            else
                System.out.println("Wrong Input");
            switch (ch)
            {
                case 1: 
                c = 0;
                    for(i = 1; i <= n; i++)
                        if (n % i == 0)
                            c++;
                    if (c == 2)
                        System.out.println("Prime Number");
                    else
                        System.out.println("Not Prime Number");
                    break;
                case 2:
                    c = (int) Math.sqrt(n);
                    if (c == n)
                        System.out.println("Perfect Sq Number");
                    else
                        System.out.println("Not Perfect Sq Number");
                    break;
                case 3:
                    c = 0;
                    for (i = 1; i <= n; i++)
                        if (n % i == 0)
                            c+=i;
                    if (c == n)
                        System.out.println("Perfect Number");
                    else
                        System.out.println("Not Perfect Number");
                    break;
            }//end of switch
        } //end of while
    } //end of main
} // end of class