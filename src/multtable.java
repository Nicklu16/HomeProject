import java.util.Scanner;

public class multtable {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        int b = scanner.nextInt();

        for (int i = 1; i < b; i++) {

            for (int j = 1; j < b; j++) {
                System.out.printf("%2d ", (i+1) * (j+1));
            }
            System.out.printf("\n");

        }
    }
}
