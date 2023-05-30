public class PROGRAM_57_discountTernary
{
    public void main (int amt)
    {
       System.out.println(amt<=1000?amt*5.0/100:(amt<=5000?amt*8.0/100:amt*10.0/100));
    }
}
