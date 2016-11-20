import java.util.Scanner;

public class KvUr {
    public static void main(String[] args) {
        System.out.println("Решаем квадратное уравнение вида ax*2+bx+c=0");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число а ");
        double a = checkDouble(scanner);
        System.out.println("Введите число b ");
        double b = checkDouble(scanner);
        System.out.println("Введите число c ");
        double c = checkDouble(scanner);
        double d;
        d = Math.pow(b, 2) - 4 * a * c;
        System.out.println("D= " + d);
        if (d > 0) {
            double x1, x2;
            x1 = (-b + Math.sqrt(d)) / 2 * a;
            x2 = (-b - Math.sqrt(d)) / 2 * a;
            System.out.println("Уравнение имеет два корня\nx1 = " + x1 + "\nx2 = " + x2);
        }
        if (d == 0) {
            double x1;
            x1 = -b / (2 * a);
            System.out.println("Уравнение имеет один корень\nx1 = " + x1);
        }
        if (d < 0) {
            System.out.println("Корней нет");
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
