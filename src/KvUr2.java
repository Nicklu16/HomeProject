import java.util.Scanner;

public class KvUr2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double a = scanner.nextDouble();
        double b = scanner.nextDouble();
        double c = scanner.nextDouble();
        if (a == 0 && b == 0 && c == 0) {
            System.out.println("-1");
        } else {
            double d;
            d = Math.pow(b, 2) - 4 * a * c;
            if (d > 0) {
                double x1, x2;
                x1 = (-b + Math.sqrt(d)) / 2 * a;
                x2 = (-b - Math.sqrt(d)) / 2 * a;
                System.out.println("2 " + x1 + " " + x2);
            }
            if (d == 0) {
                double x1;
                x1 = -b / (2 * a);
                System.out.println("1 " + x1);
            }
            if (d < 0) {
                System.out.println("-1");
            }
        }


    }

}