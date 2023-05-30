
/**
 * Write a description of class PROGRAM_47_Kaprekar_While here.
 *
 * @author (Shridipta Satpati)
 * @version (23.1.20)
 */
public class PROGRAM_47_Kaprekar_While
{
    public void main(int num)
    {
        int copy = num, sq, count = 0, right, left;
        sq = num * num;
        while (copy > 0)
        {
            count += 1;
            copy = copy / 10;
        }
        right = sq % (int) Math.pow(10, count);
        left = sq / (int) Math.pow(10, count);
        if (left + right == num)
            System.out.println("Kaprekar Number");
        else
            System.out.println("Not Kaprekar Number");
    }
}