import java.util.*;
public class PROGRAM_145_AscendDescendBouncy
{
    public static void main(int num)
    {
        int i,copy = num, d, d1, as=0, de=0, c=0;
        while(copy > 0)
        {
            c++;
            copy /= 10;
        }
        d = num % 10;
        while(num > 0)
        {
            d1 = num % 10;
            if (d1 <= d) 
                as++;
            if (d1 >= d) 
                de++;
            num /= 10;
            d = d1;
        }
        if (c == as) 
        System.out.println("ASCENDING");
        else if(c == de) 
            System.out.println("DESCENDING");
        else
            System.out.println("BOUNCY");
    }
}
