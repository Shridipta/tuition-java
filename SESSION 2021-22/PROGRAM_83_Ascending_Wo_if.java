public class PROGRAM_83_Ascending_Wo_if
{
    public static void main (int a, int b, int c)
    {
        int d = Math.max(a, Math.max(b, c));
        int f = Math.min(a, Math.min(b, c));
        int e = a+b+c-d-f;
        System.out.println(f + " "+ e + " " + d);
    }
}