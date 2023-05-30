
/**
 * Write a description of class PROGRAM_45_Armstrong_While here.
 *
 * @author (Shridipta Satpati)
 * @version (23.1.21)
 */
public class PROGRAM_45_Armstrong_While
{
    public void main(int num)
    {
        int copy = num, sum = 0, d;
        while (copy > 0)
        {
            d = copy % 10;
            sum = sum + (int) Math.pow(d, 3);
            copy = copy / 10;
        }
        if (num == sum)
            System.out.println("Armstrong");
        else
            System.out.println("Not Armstrong");
    }
}