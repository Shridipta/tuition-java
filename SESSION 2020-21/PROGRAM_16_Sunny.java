
/**
 * Write a description of class PROGRAM_16_Sunny here.
 *
 * @author (Shridipta Satpati)
 * @version (10.12.20)
 */
public class PROGRAM_16_Sunny
{
   public void main (int num)
   {
       num = num + 1;
       int a = (int)Math.sqrt(num);
       if (a * a == num)
           System.out.println("Sunny Number");
       else
           System.out.println("Not Sunny Number");
   }
}