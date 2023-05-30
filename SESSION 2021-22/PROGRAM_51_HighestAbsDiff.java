public class PROGRAM_51_HighestAbsDiff
{
    public void main(int a, int b, int c)
    {
        int d1, d2, d3;
        d1 = Math.abs(a-b);
        d2 = Math.abs(b-c);
        d3 = Math.abs(c-a);
        if (d1 > d2 && d1 > d3)
            System.out.println(a + "and" + b + "has the highest absolute difference");
        if (d2 > d1 && d2 > d3)
            System.out.println(b + "and" + c + "has the highest absolute difference");
        if (d3 > d1 && d3 > d2)
            System.out.println(a + "and" + c + "has the highest absolute difference");
    }
}
