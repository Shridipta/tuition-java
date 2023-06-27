import java.util.*;
public class test
{
    void check()
    {  int a = 8, b=5;
        System.out.println(a/b + "  " +b%a);
        modify(a++ + ++b) ;
        System.out.println(a+b);
    }

    void modify(int k)
    {
        System.out.println (8%5 +5/8);
    }	
}
