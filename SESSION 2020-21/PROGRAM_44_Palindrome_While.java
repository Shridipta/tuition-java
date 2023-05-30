
/**
 * Write a description of class PROGRAM_44_Palindrome_While here.
 *
 * @author (Shridipta Satpati)
 * @version (23.1.21)
 */
public class PROGRAM_44_Palindrome_While
{
    public void main(int num)
    {
        int copy = num, rev = 0, d;
        while (copy > 0)
        {
            d = copy % 10;
            rev = rev * 10 + d;
            copy = copy/10;
        }
        if (rev == num)
            System.out.println("Palindrome Number");
        else 
            System.out.println("Not a Palindrome Number");
    }
}      