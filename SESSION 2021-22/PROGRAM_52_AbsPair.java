public class PROGRAM_52_AbsPair
{
    public void main(int a, int b)
    {
        int s;
        int d = a - b;
        if (d < 0)
            s = d * (-1);
        else
            s = d * 1;
        System.out.println("The Absolute Difference is " + s);
    }
}
