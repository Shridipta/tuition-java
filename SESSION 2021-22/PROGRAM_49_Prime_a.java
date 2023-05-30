public class PROGRAM_49_Prime_a
{
    public void main (int num)
    {
        int i , count = 0;
        for (i = 2; i <= num/2; i++)
        {
            if (num % i == 0)
                count++;
        }
        if (count == 0 && num != 1)
            System.out.println("Prime");
        else
            System.out.println("Not Prime");
    }
}