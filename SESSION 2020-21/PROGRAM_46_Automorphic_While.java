
/**
 * Write a description of class PROGRAM_46_Automorphic_While here.
 *
 * @author (Shridipta Satpati)
 * @version (23.1.21)
 */
public class PROGRAM_46_Automorphic_While
{
    public void main(int num)
    {
        int copy = num, count = 0, sqnum, s;
        sqnum = num * num;
        while (copy > 0)
        {
            count += 1;
            copy = copy / 10;
        }
        s = sqnum % (int)Math.pow(10, count);
        if (s == num)
            System.out.println("Automorphic Number");
        else
            System.out.println("Not Automorphic Number");
    }
}