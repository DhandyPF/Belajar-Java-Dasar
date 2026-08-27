public class TipeDataNumber {
    static void main() {
        // Integer Number
        byte iniByte = 100;
        short iniShort = 1000;
        int iniInt = 10000000;
        long iniLong = 1000000000;
        long iniLong2 = 1000000000L;

        System.out.println(iniByte);
        System.out.println(iniShort);
        System.out.println(iniInt);
        System.out.println(iniLong);
        System.out.println(iniLong2);

        // Floating Point Number
        float iniFloat = 10.11F;
        double iniDouble = 10.10D;

        System.out.println(iniFloat);
        System.out.println(iniDouble);

        // Literals
        int decimalInt = 34;
        int hexaDecimal = 0xFFFFFF;
        int binaryDecimal = 0b10101010;

        System.out.println(decimalInt);
        System.out.println(hexaDecimal);
        System.out.println(binaryDecimal);

        // Underscore
        long balance = 1_000_000_000_000L;
        int sum = 60_000_000;

        System.out.println(balance);
        System.out.println(sum);
    }
}