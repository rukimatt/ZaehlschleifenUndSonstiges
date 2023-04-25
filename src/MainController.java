public class MainController {

    public static void main(String[] args) {
      //  System.out.println(powerOfTwo(5));
        System.out.println(sumUpPowerOfTwo(8));
    }

    //Aufgabe 2, Einfache Methoden
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
        for(int i = start; i <= end; i++) {
            sum = sum + i;
        }
        return sum;
    }
    public static int powerOfTwo(int p){
        if(p > 0) return -1;

        int result  = 1;
        for(int i = 0; i < p; i++){
            result = result * 2;
        }
        return  result;

    }
    public static int sumUpPowerOfTwo(int n) {
        int sum = 0;
        for (int i = 0; i <= n; i++) {
            sum = sum + powerOfTwo(i);
        }
        return sum;
    }
    //Aufgabe 3, Komplexere Anwendungen
    public static void rectangleStars(int width, int height) {

    }
}