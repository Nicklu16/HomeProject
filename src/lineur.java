import java.util.Scanner;

public class lineur {

    public static void main(String[] args) {
        System.out.println("Решаем уравнение типа ax + b = 0");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число а ");
        double a = checkDouble(scanner);
        System.out.println("Введите число b ");
        double b = checkDouble(scanner);
        if (a == 0) {
            if (b == 0) {
                System.out.println("Х любое");
            } else {
                System.out.println("Уравнение не имеет решений");
            }
        } else {
            double x = -b / a;
            final double EPS = 1e-12;
            if (Math.abs(a * x + b) < EPS) {
                System.out.println("X найден верно!\n X = " + x);
            } else {
                System.out.println("Уравнение не имеет решений");
            }
        }
    }

    private static double checkDouble(Scanner scanner) {
        while (true) {
            if (scanner.hasNextDouble()) {
                double d = scanner.nextDouble();
                if (Double.isFinite(d)) {
                    return d;
                }
                System.out.println("Нудопустимое значение");
            } else {
                System.out.println("Вы ввели не число");
                scanner.next();
            }


        }

    }

}
