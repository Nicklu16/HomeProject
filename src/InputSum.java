import java.util.Scanner;

public class InputSum {
    public static void main(String[] args) {
        int sum = 0;
        Scanner scanner = new Scanner(System.in);
        while (true) {
            if (scanner.hasNextInt()) {
                int m = scanner.nextInt();
                sum = sum + m;
            } else {
                break;
            }
        }

        System.out.println(sum);
    }
}
