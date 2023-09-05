import java.util.Scanner;

public class PROGRAM_271_CombineArrays {
    int com[];
    int size;

    PROGRAM_271_CombineArrays(int nn) {
        size = nn;
        com = new int[size];
    }

    void inputcomay() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the data");
        for (int i = 0; i < size; i++) {
            com[i] = sc.nextInt();
        }
    }

    void mix(PROGRAM_271_CombineArrays A, PROGRAM_271_CombineArrays B) {
        int n1 = A.size, n2 = B.size, i, j, k = 0, count;
        int c[] = new int[n1 + n2];
        for (i = 0; i < n1; i++)
            c[k++] = A.com[i];
        for (i = 0; i < n2; i++) {
            count = 0;
            for (j = 0; j < n1; j++)
                if (A.com[j] == B.com[i])
                    count++;
            if (count == 0)
                c[k++] = B.com[i];
        }
        System.out.println("Union Array");
        for (i = 0; i < k; i++)
            System.out.println(c[i]);
    }

    void sort() { // selection sort

    }

    void display() {
        System.out.println("The Array is");
        for (int i = 0; i < size; i++) {
            System.out.println(com[i]);
        }
    }
}
