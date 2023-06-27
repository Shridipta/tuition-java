import java.util.*;
class PROGRAM_245_StringMerge
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first string");
        String str1 = sc.nextLine();
        int n1 = str1.length();
        System.out.println("Enter second string");
        String str2 = sc.nextLine();
        int n2 = str2.length();
        String str3 = "";
        int n = n2;
        int diff = n2-n1;
        if (diff>0)
            n = n1;
        for (int i = 0;i <n;i++ )
        {
            str3+=str1.charAt(i);
            str3+=str2.charAt(i);

        }
        if (diff>0)
            str3+=str2.substring(n2-diff, n2 );
        if (diff<0)
            str3+=str1.substring(n1+diff, n1 );
        
        System.out.println("Third string = "+str3);
    }
}