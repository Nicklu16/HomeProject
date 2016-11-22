import java.util.Scanner;

public class Sort {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        int a[] = new int[size];
        for (int i = 0; i < size; i++) {
            a[i] = scanner.nextInt();
        }
        for (int i = 0; i < a.length; i++) {

            int min = a[i];
            int imin = i;

            for (int j = i + 1; j < a.length; j++) {

                if (a[j] < min) {
                    min = a[j];
                    imin = j;
                }
            }

            if (i != imin) {
                int temp = a[i];
                a[i] = a[imin];
                a[imin] = temp;
            }
            System.out.print(a[i] + " ");
        }
    }
}
