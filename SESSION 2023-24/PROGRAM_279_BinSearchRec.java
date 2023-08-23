import java.util.Scanner;

public class PROGRAM_279_BinSearchRec {
    int num[], size;

    PROGRAM_279_BinSearchRec(int n) {
        size = n;
    }

    void bisearch(int num[], int x, int y)
    {
    }

    void acceptdata() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the 100 integers");
        for (int i = 0; i < 5; i++) {
            num[i] = sc.nextInt();
        }
    }
}
