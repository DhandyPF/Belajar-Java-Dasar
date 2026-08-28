public class IfStatement {
    static void main() {
        var nilai = 80;
        var absen = 90;

        if(nilai >= 75 && absen >= 75) {
            System.out.println("Lulus");
        } else if(nilai > 50 && absen > 50) {
            System.out.println("Tidak Lulus");
        } else {
            System.out.println("Yahahahahaha");
        }
    }
}
