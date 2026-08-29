public class MethodVariableArgument {
    static void main() {
        sayCongrats("Dhandy", 50, 90, 100, 90);
    }

    static void sayCongrats(String name, int... values) {
        var total = 0;
        for (var value : values) {
            total += value;
        }
        int finalValue = total / values.length;

        if (finalValue >= 75) {
            System.out.println("Congratulations! " + name);
        } else {
            System.out.println("Sorry, " + name);
        }
    }
}
