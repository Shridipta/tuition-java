
/**
 * Write a description of class PROGRAM_36_OddFibo here.
 *
 * @author (Shridipta Satpati)
 * @version (16.1.21)
 */
public class PROGRAM_36_OddFibo
{
    public void main(int num)
    {
        int i, a = 1, b = 0, c;
        for (i = 1; i <= num;)
        {
            c = a + b;
            if (c % 2 == 1)
            {
                System.out.println(c + " ");
                i++;
            }
            a = b; b = c;
        }
    }
}

/*
public class PROGRAM_36_OddFibo
{
    public void main(int num)
    {
        int i, a = 1, b = 0, c;
        for (i = 1; i <= num;)
        {
            c = a + b;
            if (c % 2 == 1)
                System.out.println(c + " ");
            else
                i--;
            a = b; b = c;
        }
    }
}
 */