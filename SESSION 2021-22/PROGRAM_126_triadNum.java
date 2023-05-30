public class PROGRAM_126_triadNum
{
    public static void main()
    {
        int copy, d, flag = 0, c;
        for (int i= 100; i<=1000; i++)
            for (int j = 100; j<= 1000; j++)
                for(int k = 100;k<=1000; k++)
                {
                    int all = i*1000000+j*1000+k;
                    for(int l = 0; l<= 9;l++)
                    {
                        copy = all;
                        c = 0;
                        while (copy>0)
                        {
                            d = copy%10;
                            if (d == l)
                                c++;
                            copy = copy/10;
                        }
                        if (c>1)
                        {
                            flag = 0;
                            break;
                        }
                        else
                            flag = 1;
                    }
                    if (flag == 1 && j == i*2 && k == i*3)
                        System.out.println(i+ " " + j + " " + k);
                }
    }
}
