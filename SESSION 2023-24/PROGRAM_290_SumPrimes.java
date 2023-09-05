//working

import java.util.Scanner;

public class PROGRAM_290_SumPrimes {
    static boolean isprime(int x) {
        for (int i = 2; i < x; i++) {
            if (x % i == 0)
                return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int n = sc.nextInt();

        int arr[] = new int[n];
        int k = 0;
        for (int i = 2; i < n; i++) {
            if (isprime(i) == true)
                arr[k++] = i;
        }

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (((arr[i] + arr[j]) == n) &&(arr[i] <= arr[j]))
                    System.out.println(arr[i] + " " + arr[j]);
            }
        }
    }
}
