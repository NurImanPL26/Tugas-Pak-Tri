public class Main {

    static int perkalian(int a, int b) {
        return a * b;
    }

    static int perkalian(int a, int b, int c) {
        return a * b * c;
    }

    static double perkalian(double a, double b) {
        return a * b;
    }

    public static void main(String[] args) {
        System.out.println("Hasil 1: " + perkalian(6, 3));
        System.out.println("Hasil 2: " + perkalian(7, 6, 4));
        System.out.println("Hasil 3: " + perkalian(2.5, 4.5));
    }
}
