
import java.util.Scanner;


public class multmax2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        int a[] = new int[size];
        for (int i = 0; i < size; i++) {
            a[i] = scanner.nextInt();
            for (int j = i + 1; j < size; j++) {
                for (int k = j + 1; k < size; k++) {
                    long max = a[i] * a[j] * a[k];
                    System.out.println(max);
                }
            }
        }
    }


}
