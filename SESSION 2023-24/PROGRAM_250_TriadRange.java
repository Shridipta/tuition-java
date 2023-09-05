//working

class PROGRAM_250_TriadRange {
    public static void main(String[] args) {

        System.out.println("The Triad Numbers are: ");

        for (int i = 100; i <= 333; i++) {
            int a = i, b = i * 2, c = i * 3;
            int r = a * 1000000 + b * 1000 + c;
            int flag = 0;

            for (int j = 0; j <= 9; j++) {
                int copy = r;
                int count = 0;

                while (copy > 0) {
                    int d = copy % 10;
                    if (d == j)
                        count++;
                    copy /= 10;
                }
                if (count >= 2) {
                    flag = 1;
                    break;
                }
            }
            if (flag == 0)
                System.out.println(i);
        }
    }
}