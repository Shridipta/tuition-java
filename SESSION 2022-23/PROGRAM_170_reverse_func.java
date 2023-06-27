import java.util.*;
public class PROGRAM_170_reverse_func
{
    public static int main(int num)
    {
        int r=0, d;
        while(num>0)
        {
            d=num%10;
            r=r*10+d;
            num/=10;
        }
        return r;
    }
}
