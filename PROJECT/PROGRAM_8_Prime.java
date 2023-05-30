import java.util.*;
public class PROGRAM_8_Prime
{
    public void main()
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); 
        int c = 0;
        for (int i = 1; i<=n;i++)
            if(n%i == 0)
                c++;
        if (c==2)
            System.out.println("Prime");
        else
            System.out.println("Not Prime");
    }
}
