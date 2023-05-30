public class PROGRAM_65_HCF_normal
{
    public void main(int a, int b)
    {
        int i;
        for(i = 1; i <= a*b; i++)
            if (a % i == 0 && b % i == 0)
            {
                System.out.println("HCF = "+ i);
                return;
            }
    }
}
