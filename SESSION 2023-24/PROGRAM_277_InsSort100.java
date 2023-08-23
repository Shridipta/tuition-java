import java.util.Scanner;

public class PROGRAM_277_InsSort100 {
    int[] arr;

    PROGRAM_277_InsSort100 ()
    {
        arr =new int[5];
    }

    void readlist()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the 100 integers");
        for (int i = 0; i < 5; i++) {
           arr[i] = sc.nextInt();
        }
    }

    void insertionsort()
    {
        for (int i = 1; i < arr.length; i++) {
            int key = arr[i];
            int j = i - 1;

            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j = j - 1;
            }
            arr[j + 1] = key;
        }
    }

    void displaylist()
    {
        System.out.println("Sorted Array");
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }

    public static void main(String[] args) {
        PROGRAM_277_InsSort100 obj = new PROGRAM_277_InsSort100();
        obj.readlist();
        obj.insertionsort();
        obj.displaylist();
    }
}
