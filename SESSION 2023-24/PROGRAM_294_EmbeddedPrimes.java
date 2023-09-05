import java.util.Scanner;

public class PROGRAM_294_EmbeddedPrimes {

    // static void printPermutn(String str, String ans) {
    // if (str.length() == 0) {
    // System.out.print(ans + " ");
    // return;
    // }
    // for (int i = 0; i < str.length(); i++) {
    // char ch = str.charAt(i);
    // String ros = str.substring(0, i) +
    // str.substring(i + 1);
    // printPermutn(ros, ans + ch);
    // }
    // }

    // static void printDistinctPermutn(String str, String ans) {
    // if (str.length() == 0) {
    // System.out.print(ans + " ");
    // return;
    // }
    // boolean alpha[] = new boolean[26];
    // for (int i = 0; i < str.length(); i++) {
    // char ch = str.charAt(i);
    // String ros = str.substring(0, i) +
    // str.substring(i + 1);
    // if (alpha[ch - 'a'] == false)
    // printDistinctPermutn(ros, ans + ch);
    // alpha[ch - 'a'] = true;
    // }
    // }

    static boolean isprime(int num) {
        for (int i = 2; i < num; i++) {
            if (num % i == 0)
                return false;
        }
        return true;
    }

    static void removeDuplicates(int arr[]) {
        int n = arr.length;
        int i, j, count, c = 0;
        for (i = 0; i < n; i++) {
            count = 0;
            for (j = i + 1; j < n; j++) {
                if (arr[i] == arr[j])
                    count++;
            }
            if (count == 0)
                arr[c++] = arr[i];
        }
    }

    static int k = 0;
    static int arr[];

    static void permut(String str, String ans, int len) {
        if (str.length() == 0) {
            int num = Integer.parseInt(ans);
            arr[k++] = num % (int) Math.pow(10, len);
            return;
        }
        boolean alpha[] = new boolean[10];
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            String ros = str.substring(0, i) +
                    str.substring(i + 1);
            if (alpha[ch - 47] == false)
                permut(ros, ans + ch, len);
            alpha[ch - 47] = true;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        String num = sc.nextLine();

        arr = new int[Integer.parseInt(num)];

        for (int i = 1; i <= num.length(); i++)
            permut(num, "", i);
        removeDuplicates(arr);
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0 )
            System.out.println(arr[i]);
        }
    }
}