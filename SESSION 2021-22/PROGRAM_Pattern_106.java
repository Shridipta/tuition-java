public class PROGRAM_Pattern_106
{
    public static void main(int marks)
    {
        marks = marks/10;
        switch (marks)
        {
            case 0:
            case 1:
            case 2:
            case 3:
                System.out.println("Grade D");
                break;
            case 4:
            case 5:
                System.out.println("Grade C");                
                break;
            case 6:
            case 7:
                System.out.println("Grade B");
                break;
            case 8:
            case 9:
                System.out.println("Grade A");
                break;
            default:
                System.out.println("Wrong Input");
        }
    }
}
