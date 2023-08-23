import java.util.Scanner;

public class PROGRAM_280_Time {
    int hh, mm, ss;

    PROGRAM_280_Time(int x, int y, int z) {
        hh = x;
        mm = y;
        ss = z;
    }

    void convert() {
        if (hh >= 12)
            System.out.println((hh - 12) + " " + mm + "  " + ss + "pm");
        else
            System.out.println(hh + " " + mm + "  " + ss + "am");
    }

    PROGRAM_280_Time difference(PROGRAM_280_Time t1) {
        int h, m, s;
        int ts1 = hh * 3600 + mm * 60 + ss;
        int ts2 = t1.hh * 3600 + t1.mm * 60 + t1.ss;
        int ts = (int) Math.abs(ts1 - ts2);
        h = ts / 3600;
        ts = ts / 3600;
        m = ts / 60;
        s = ts % 60;
        PROGRAM_280_Time obj = new PROGRAM_280_Time(h, m, s);
        return obj;
    }

    public static void main(String[] args) {
        PROGRAM_280_Time obj1 = new PROGRAM_280_Time(10, 15, 20);
        PROGRAM_280_Time obj2 = new PROGRAM_280_Time(20, 30, 40);
        PROGRAM_280_Time obj3 = new PROGRAM_280_Time(0, 0, 0);
        obj3 = obj1.difference(obj2);
        obj3.convert();
    }
}
