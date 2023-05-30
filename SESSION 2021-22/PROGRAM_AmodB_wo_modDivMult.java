public class PROGRAM_AmodB_wo_modDivMult
{
    public void main(int a, int b)
    {
        for (; a >= b; a -= b);
        System.out.println("Remainder = " + a);
    }
}
