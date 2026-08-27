public class KonversiNumber {
    static void main() {
        // Konversi Tipe Data Number
        byte iniByte = 10;
        int iniInt = (short) iniByte;
        long iniLong = iniInt;
        double iniDouble = iniLong;

        float iniFloat2 = (float) iniDouble;
        long iniLong2 = (long) iniFloat2;
        int iniInt2 = (int) iniLong2;
        short iniShort2 = (short) iniInt2;

        System.out.println("iniByte1 = " + iniByte);
        System.out.println("iniShort1 = " + iniByte);
        System.out.println("iniInt1 = " + iniInt);
        System.out.println("iniLong1 = " + iniLong);
        System.out.println("iniDouble1 = " + iniDouble);

        System.out.println("iniFloat2 = " + iniFloat2);
        System.out.println("iniLong2 = " + iniLong2);
        System.out.println("iniInt2 = " + iniInt2);
        System.out.println("iniShort2 = " + iniShort2);
    }
}
