public class Array {
    static void main() {
        String[] stringArray;
        stringArray = new String[3];

        stringArray[0] = "Dhandy";
        stringArray[1] = "Putra";
        stringArray[2] = "Fahruddin";

        System.out.println(stringArray[0]);
        System.out.println(stringArray[1]);
        System.out.println(stringArray[2]);

        stringArray[0] = "John";
        System.out.println(stringArray[0]);

        String[] stringArray2 = new String[3];

        int[] arrayInt = new int[]{
                1, 2, 3, 4, 5
        };

        long[] arrayLong = {
                9L, 8L, 7L, 6L, 5L, 4L, 3L, 2L, 1L
        };

        System.out.println(arrayLong.length);

        String[][] members = {
                {"John", "Doe", "Stone"},
                {"Budi"},
                {"Nurul", "Edi"}
        };

        System.out.println(members.length);
        System.out.println(members[1][0]);
        System.out.println(members[2][1]);
    }
}
