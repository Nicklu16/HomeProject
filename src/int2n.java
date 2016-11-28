import java.util.Scanner;

public class int2n {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = -2;
        int b = scanner.nextInt();
        long result = 1;
        for (int i = 1; i <= b; i++) {
            result =a *(result * a);
        }
        System.out.println(result);
        System.out.println(Math.pow(a,b));
    }
}
