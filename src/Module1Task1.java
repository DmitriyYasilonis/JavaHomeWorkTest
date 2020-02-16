public class Module1Task1 {
    public static void main(String[] args) {
        double a = 2;
        double b = 5;
        double c = 2;
        double x1 = (-b + Math.sqrt(b * b - 4 * a * c)) / (2 * a);
        double x2 = (-b - Math.sqrt(b * b - 4 * a * c)) / (2 * a);
        System.out.println(b * b - 4 * a * c);
        System.out.println(x1);
        System.out.println(x2);
    }

}
