public class MethodsRecap {

    public static void main(String[] args) {

        String name = getName();

        int minNumber = getMinNumber(5, 10);

        System.out.println(minNumber);
    }

    public static String getName() {

        return "Desi";
    }

    public static int getMinNumber(int num1, int num2) {

        return Math.min(num1, num2);
    }
}
