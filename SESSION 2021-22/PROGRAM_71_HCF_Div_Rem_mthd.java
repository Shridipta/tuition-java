public class PROGRAM_71_HCF_Div_Rem_mthd
{
    public static void main(int a, int b)
    {
        int temp, i, rem;
        if (a > b)
        {
            temp = b;
            b = a;
            a = temp;
        }
        rem = b % a;
        while (rem != 0)
        {
            b = a;
            a = rem;
            rem = b % a;
        }
        System.out.println ("HCF = " + a);
    }
}