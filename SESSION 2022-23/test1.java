import java.util.*;

public class test1 {
    // void check()
    // { int a = 8, b=5;
    // System.out.println(a/b + " " +b%a);
    // modify(a++ + ++b) ;
    // System.out.println(a+b);
    // }

    // void modify(int k)
    // {
    // System.out.println (8%5 +5/8);
    // }
    public static void main(String[] args) {
        String str = "This is String";
        String str2 = "this is String";
        int b = str.compareTo(str2);
        System.out.println("B ="+b);
        int a = str.indexOf("is", 2);
        System.out.println("A = "+a);
        int c = (int)'A'+(int)' '+(int)'B';
        System.out.println("c = "+c);
    }

}
