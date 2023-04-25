public class MainController {

    public static void main(String[] args) {
    }

    public static void printSomeNumbers() {
        for (int i = 6; i < 24; i++) {
            System.out.println(i);
        }
    }

    public static void printNumbers(int start, int end) {
        for (int i = start; i <= end; i++) {
            System.out.println(i);
        }

    }

    public static int sumUp(int start, int end) {
        int sum = 0;
        for (int i = start; i <= end; i++) {
            sum = sum + i;
        }
        return sum;
    }
}