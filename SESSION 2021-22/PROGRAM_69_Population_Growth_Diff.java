public class PROGRAM_69_Population_Growth_Diff
{
    public static void main()
    {
        double f_land, c_land, growth1, growth2;
        f_land = 4.5;
        c_land = 5.5;
        for(int i = 0; i>=0 ; i++)
        {
            growth1 = f_land * 4.0/100.0;
            f_land += growth1;
            growth2 = f_land * 3.0/100.0;
            c_land += growth2;
            if (f_land > c_land)
            {
                System.out.println("yrs"+i);
                return;
            }
        }
    }
}
