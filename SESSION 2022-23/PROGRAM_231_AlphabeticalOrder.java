import java.util.*;
public class PROGRAM_231_AlphabeticalOrder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a sentence");
        String str = sc.nextLine();
        str += " ";
        int n = str.length();
        String arr[]= new String [n];
        int i, k =0, p =0;
        for(i = 0;i<n;i++)
        {
            char ch = str.charAt(i);
            if(ch == ' ')
            {
                String word = str.substring(k, i);
                arr[p++] = word;
                k=i+1;
            }
        }
        String newstr = wordsort(arr, p);
        System.out.println("Sorted String = "+newstr);
    }
    static String wordsort(String arr[], int p)
    {
        int i, j;
        String temp = "";
        for(i = 0;i<p;i++)
        {
            for(j = 0;j<p-i-1;j++)
            {
                if((arr[j].compareToIgnoreCase(arr[j+1])>0))
                    {
                        temp = arr[j];
                        arr[j] = arr[j+1];
                        arr[j+1] = temp;
                    }
            }
        }
        String newstr = "";
        for(i = 0;i<p;i++)
            newstr = newstr + " " + arr[i];
        return newstr;
    }
}
