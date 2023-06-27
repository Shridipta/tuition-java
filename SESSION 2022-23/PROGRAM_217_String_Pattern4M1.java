import java.util.*;

public class PROGRAM_217_String_Pattern4M1
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter string");
        String str = sc.next();

        for(int i = str.length()-1 ; i>=0; i--)
            System.out.println(str.substring(i));
    }

}


