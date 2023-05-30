public class PROGRAM_68_Multiply_2_nums
{
    public static void main(int x, int y)
    {
        int i, sum = 0, sign = 1;
        if ((x<0 && y>0) || (x>0 && y<0))
            sign = -1;
        else if (x<0 && y<0)
            sign = 1;
        for(i = 1; i <= Math.abs(y); i++)
            sum += Math.abs(x);
        System.out.println("The product of the 2 nums = "+ (sum*sign));
    }
}
