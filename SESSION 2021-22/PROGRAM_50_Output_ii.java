public class PROGRAM_50_Output_ii
{
    public static void main(String[] args)
    {
        int i;
        for (i = 2; i <= 15; System.out.println(i))
        {
            System.out.println(i % 3);
            i += 5;
        }
        System.out.println(i);
    }
}
