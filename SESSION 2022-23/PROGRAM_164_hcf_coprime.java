import java.util.*;
public class PROGRAM_164_hcf_coprime
{
    public int hcf(int a, int b)
    {
        int i, hcf=1;
        for(i = 1; i <= a*b; i++)
            if (a % i == 0 && b % i == 0)
                hcf=i;
        return hcf;
    }
    public void main(int a, int b)
    {
        Scanner sc = new Scanner(System.in);
        if(hcf(a, b) == 1)
            System.out.println("Coprime");
        else
            System.out.println("Not Coprime");
    }
}
