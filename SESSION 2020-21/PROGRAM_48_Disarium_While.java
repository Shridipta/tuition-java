
/**
 * Write a description of class PROGRAM_48_Disarium_While here.
 *
 * @author (Shridipta Satpati)
 * @version (23.1.21)
 */
public class PROGRAM_48_Disarium_While
{
    public void main(int num)
    {
        int copy1 = num, copy2 = num, count = 0, sum = 0, d;
        while (copy1 > 0)
        {
            copy1 = copy1 / 10;
            count++;
        }
        while (copy2 > 0)
        {
            d = copy2 % 10;
            sum += (int) Math.pow(d, count);
            copy2 = copy2 / 10;
            count--;
        }
        if (num == sum)
            System.out.println("Disarium Number");
        else
            System.out.println("Not Disarium Number");
    }
}