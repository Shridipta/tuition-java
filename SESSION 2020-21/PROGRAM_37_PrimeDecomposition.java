
/**
 * Write a description of class PROGRAM_37_PrimeDecomposition here.
 *
 * @author (Shridipta Satpati)
 * @version (21.1.20)
 */
//sir_solution
public class PROGRAM_37_PrimeDecomposition
{
    public void main(int num)
    {
        int i;
        for (i = 2; i <= num;)
            if (num % i == 0)
            {
                System.out.print(i + " ");
                num = num / i;
            }
            else
                i++;
    }
}

//my_solution
/*public class PROGRAM_37_PrimeDecomposition
{
    public void main(int num)
    {
        int i;
        for (i = 2; i <= num; i++)
        {
            if (num % i == 0)
            {
                System.out.println(i);
                num = num / i;
                i = i-1;
            }
        }
    }
}
*/