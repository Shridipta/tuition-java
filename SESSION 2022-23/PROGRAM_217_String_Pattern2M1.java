import java.util.*;

public class PROGRAM_217_String_Pattern2M1
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter string");
        String str = sc.next();

        for(int i = str.length(); i>=1; i--)
            System.out.println(str.substring(0, i));
    }

}


