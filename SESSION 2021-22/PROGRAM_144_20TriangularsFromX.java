import java.util.*;
public class PROGRAM_144_20TriangularsFromX
{
    public static void main(int x)
    {
        int s = 0, c = 0;
        for (int i = 1; ;i++)
        {
            if (s>=x)
            {
                System.out.println(s);
                c++;
            }
            if (c==20)
                return;
            s += i;
        }
    }
}
