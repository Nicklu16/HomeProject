import java.util.Scanner;

public class KvUr {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double a = scanner.nextDouble();
        double b = scanner.nextDouble();
        double c = scanner.nextDouble();
        final double EPS = 1e-7;
        if (a == 0 && b != 0) {
            double x1 = -c / b;
            if (Math.abs(x1 - b * c) > EPS) {
                System.out.println("1 " + x1);

            } else {
                System.out.println("-1");
            }
            return;
        }
        if (a == 0 && b == 0) {
            if (c == 0) {
                System.out.println("-1");
            } else {
                System.out.println("0");
            }
        } else {
            double d;
            d = Math.pow(b, 2) - (4 * a * c);
            if (Math.abs(d) <= EPS) {
                double x1;
                x1 = -b / (2 * a);
                System.out.println("1 " + x1);
            }
            if (d > EPS) {
                double x1, x2;
                x1 = (-b + Math.sqrt(d)) / (2 * a);
                x2 = (-b - Math.sqrt(d)) / (2 * a);
                System.out.println("2 " + x1 + " " + x2);
            }

            if (d < -EPS) {
                System.out.println("0");
            }
        }


    }
}
