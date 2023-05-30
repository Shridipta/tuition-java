public class PROGRAM_61_weeklyWages
{
    public static void main (int hr, double r)
    {
        double wage;
        if (hr <= 40)
            wage = hr * r;
        else
        {
            hr = hr - 40;
            if (hr <= 10)
                wage = 40*r + hr*r*2;
            else
                wage = 40*r + 10*r*2 + (hr-10)*r*2.5;
        }
        System.out.println("For " + hr + "the wage is Rs " + wage);
    }
}
