import java.io.*;
public class Buffered_Reader_input
{
    public static void main() throws IOException
    {
        InputStreamReader in = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(in);
        //BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter an Integer");
        int num = Integer.parseInt(br.readLine());
        System.out.println("Enter an Double");
        double d = Double.parseDouble(br.readLine());
        System.out.println("Enter an String");
        String str = br.readLine();
        System.out.println("Enter an Character");
        char ch = br.readLine().charAt(0); //(char) br.read();
        System.out.println("The data are: " + num + " " + d + " " + str + " " + ch);
    }
}
