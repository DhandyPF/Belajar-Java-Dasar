public class OperasiBoolean {
    static void main() {
        boolean value1 = true;
        boolean value2 = false;

        System.out.println(value1 && value1);
        System.out.println(value1 && value2);
        System.out.println(value2 && value1);
        System.out.println(value2 && value2);

        System.out.println(value1 || value1);
        System.out.println(value1 || value2);
        System.out.println(value2 || value1);
        System.out.println(value2 || value2);

        System.out.println(!value1);
        System.out.println(!value2);

        var absen = 80;
        var nilaiAkhir = 70;

        var lulusAbsen = absen >= 75;
        var lulusNilaiAkhir = nilaiAkhir >= 75;

        var lulus = lulusAbsen && lulusNilaiAkhir;
        System.out.println(lulus);
    }
}
