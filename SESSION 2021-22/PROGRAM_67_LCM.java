public class PROGRAM_67_LCM
{
    public static void main(int a, int b)
    {
        int i;
        for(i = 1; i<= a*b; i++)
            if (i % a == 0 && i % b == 0)
            {        
                System.out.println("LCM = " + i);
                return;            
            }
    }
}
