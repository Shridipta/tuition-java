import java.util.*;

class Number_System_Convert 
{
    Scanner sc = new Scanner(System.in);

    public void main() 
    {
        System.out.println("1. Dec to Bin");
        System.out.println("2. Dec to Oct");
        System.out.println("3. Dec to Hex");
        System.out.println("4. Bin to Dec");
        System.out.println("5. Oct to Dec");
        System.out.println("6. Hex to Dec");
        System.out.print("Enter your choice: ");
        int ch = sc.nextInt();
        switch (ch) 
        {
            case 1:
                DecToBin();
                break;
            case 2:
                DecToOct();
                break;
            case 3:
                DecToHex();
                break;
            case 4:
                BinToDec();
                break;
            case 5:
                OctToDec();
                break;
            case 6:
                HexToDec();
                break;
            default:
                System.out.println("Invalid input");
        }
    }

    void DecToBin() 
    {
        System.out.println("Enter a decimal number: ");
        int dec = sc.nextInt();
        int bin = 0;
        int p = 0;
        while (dec > 0) 
        {
            int digit = dec % 2;
            bin += digit * (int) Math.pow(10, p);
            dec /= 2;
            p++;
        }
        System.out.println("Binary representation: " + bin);
    }

    void DecToOct() 
    {
        System.out.println("Enter a decimal number: ");
        int dec = sc.nextInt();
        int oct = 0;
        int p = 0;
        while (dec > 0) 
        {
            int digit = dec % 8;
            oct += digit * (int) Math.pow(10, p);
            dec /= 8;
            p++;
        }
        System.out.println("Octal representation: " + oct);
    }

    void DecToHex() 
    {
        System.out.println("Enter a decimal number: ");
        int dec = sc.nextInt();
        String hex = "";
        while (dec > 0) {
            int digit = dec % 16;
            if (digit < 10) 
            {
                hex = (char) (digit + '0') + hex;
            } else {
                hex = (char) (digit - 10 + 'A') + hex;
            }
            dec /= 16;
        }

        System.out.println("Hexadecimal representation: " + hex);
    }

    void BinToDec() 
    {
        System.out.println("Enter a binary number: ");
        int bin = sc.nextInt();
        int dec = 0;
        int p = 0;
        while (bin > 0) 
        {
            int digit = bin % 10;
            dec += digit * (int) Math.pow(2, p);
            bin /= 10;
            p++;
        }
        System.out.println("Decimal representation: " + dec);
    }

    void OctToDec() 
    {
        System.out.println("Enter an octal number: ");
        int oct = sc.nextInt();
        int dec = 0;
        int p = 0;
        while (oct > 0) 
        {
            int digit = oct % 10;
            dec += digit * (int) Math.pow(8, p);
            oct /= 10;
            p++;
        }
        System.out.println("Decimal representation: " + dec);
    }

    void HexToDec() 
    {
        System.out.println("Enter a hexadecimal number: ");
        String hex = sc.next();
        int dec = 0;
        int p = 0;
        for (int i = hex.length() - 1; i >= 0; i--) 
        {
            char ch = hex.charAt(i);
            int digit;
            if (ch >= '0' && ch <= '9') {
                digit = ch - '0';
            } else {
                digit = ch - 'A' + 10;
            }
            dec += digit * (int) Math.pow(16, p);
            p++;
        }
        System.out.println("Decimal representation: " + dec);
    }
}

