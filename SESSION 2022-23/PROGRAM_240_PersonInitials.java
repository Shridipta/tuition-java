import java.util.*;

public class PROGRAM_240_PersonInitials {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a name");
        String name = sc.nextLine();

        name = " " + name;
        int n = name.length();

        String newstr = "";

        int surnameindex = name.lastIndexOf(" ");
        String surname = name.substring(surnameindex+1, n);
        name = name.substring(0, surnameindex);
        n = name.length();
        for (int i = 0; i < n - 1; i++) {
            char ch = name.charAt(i);
            char ch2 = name.charAt(i + 1);
            if (ch != ' ' && ch2 == ' ')
                newstr += ". ";
            if (ch == ' ' && ch2 != ' ')
                newstr += ch2;
        }
        newstr = surname + " " + newstr;
        System.out.println("New Initials =" + newstr);
    }
}
