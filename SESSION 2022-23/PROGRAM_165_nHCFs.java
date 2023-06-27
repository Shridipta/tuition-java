import java.util.*;
public class PROGRAM_165_nHCFs
{
    public int hcf(int a, int b)
    {
        int i, hcf=1;
        for(i = 1; i <= a*b; i++)
            if (a % i == 0 && b % i == 0)
                hcf=i;
        return hcf;
    }
    public void main()
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int h = sc.nextInt();
        int i, hcf=h;
        for (i = 1; i<=n-1;i++)
        {
            h = sc.nextInt();
            hcf = hcf(hcf, h);
        }
        System.out.println("HCF of all numbers = "+ hcf);
    }
}
