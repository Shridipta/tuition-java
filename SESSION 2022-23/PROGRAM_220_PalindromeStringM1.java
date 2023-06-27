import java.util.*;
public class PROGRAM_220_PalindromeStringM1
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the sentence");
        String str = sc.nextLine();
        if (str.equals(str.reverse(str)))
            System.out.println();

    }
}