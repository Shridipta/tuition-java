public class PROGRAM_56_typeTriangle_ternary
{
    public void main (int a, int b, int c)
    {
        System.out.println(a == b && b == c && c == a ? "Equilateral" : 
                          (a == b || b == c || c == a ? "Isosceles" : "Scalene"));
    }
}
