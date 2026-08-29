public class SwitchStatement {
    static void main() {
        System.out.println("=== Switch Statement ===");
        var nilai = "A";

        switch (nilai) {
            case "A":
                System.out.println("Nilai A");
                break;
            case "B":
                System.out.println("Nilai B");
                break;
            case "C":
                System.out.println("Nilai C");
                break;
            case "D":
                System.out.println("Nilai D");
                break;
            default:
                System.out.println("Yahahahahaha");
        }

        // Switch Lambda
        switch (nilai) {
            case "A" -> System.out.println("Nilai A");
            case "B" -> System.out.println("Nilai B");
            case "C" -> System.out.println("Nilai C");
            case "D" -> System.out.println("Nilai D");
            default -> System.out.println("Yahahahahaha");
        }

        String ucapan;

        // Switch tanpa Yield
        switch (nilai) {
            case "A" -> ucapan = "Nilai A";
            case "B" -> ucapan = "Nilai B";
            case "C" -> ucapan = "Nilai C";
            case "D" -> ucapan = "Nilai D";
            default -> ucapan = "Yahahahahaha";
        }

        // Switch dengan Yield
        ucapan = switch (nilai) {
        case "A": yield "Nilai A";
        case "B": yield "Nilai B";
        case "C": yield "Nilai C";
        case "D": yield "Nilai D";
        default : yield "Yahahahahaha";
        };
    }
}
