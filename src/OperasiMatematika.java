public class OperasiMatematika {
    static void main() {
        // Arithmetic Operator
        System.out.println("=== Arithmetic Operator ===");
        int a = 100;
        int b = 10;

        System.out.println(a + b);
        System.out.println(a - b);
        System.out.println(a * b);
        System.out.println(a / b);
        System.out.println(a % b);

        // Augmented Assignments
        System.out.println("=== Augmented Assignments ===");
        int c = 100;
        c += 10;
        System.out.println(c);

        c -= 10;
        System.out.println(c);

        c *= 10;
        System.out.println(c);

        c /= 10;
        System.out.println(c);

        c %= 10;
        System.out.println(c);

        // Unary Operator
        System.out.println("=== Unary Assignments ===");
        int d = 100;
        int e = -10;

        d++;
        System.out.println(d);

        d--;
        System.out.println(d);
    }
}
