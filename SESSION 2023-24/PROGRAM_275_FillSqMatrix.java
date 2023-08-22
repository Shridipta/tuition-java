import java.util.Scanner;

public class PROGRAM_275_FillSqMatrix {
    char M[][];
    int N;
    char ch1, ch2, ch3;

    void accept() {
        Scanner sc = new Scanner(System.in);
        System.out.println("N = ");
        N = sc.nextInt();
        if (N > 3 && N < 10) {
            M = new char[N][N];
            System.out.println("FIRST CHARACTER");
            ch1 = sc.next().charAt(0);
            System.out.println("SECOND CHARACTER");
            ch2 = sc.next().charAt(0);
            System.out.println("THIRD CHARACTER");
            ch3 = sc.next().charAt(0);
            fill();
            display();
        } else {
            System.out.println("SIZE OUT OF RANGE");

        }

    }

    void fill() {
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                if ((i == 0 && j == 0) || (i == 0 && j == N - 1) || (i == N - 1 && j == 0)
                        || (i == N - 1 && j == N - 1))
                    M[i][j] = ch1;
                else if ((i == 0 || j == 0 || i == (N - 1) || j == (N - 1)))
                    M[i][j] = ch2;
                else
                    M[i][j] = ch3;

            }
        }
    }

    void display() {
        System.out.println("The Matrix is");
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++)
                System.out.print(M[i][j]);
            System.out.println();
        }
    }

    public static void main(String[] args) {
        PROGRAM_275_FillSqMatrix obj = new PROGRAM_275_FillSqMatrix();
        obj.accept();

    }
}
