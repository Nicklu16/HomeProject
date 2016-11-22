import java.util.Scanner;

public class hexadecimal2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a[] = new int[14];
        for (int i = 0; i < 14; i++) {
            if (scanner.hasNextInt()) {
                a[i] = scanner.nextInt();
            } else {
                break;
            }

        }
        for (int i = 0; i <a.length; i++) {
            System.out.println(Integer.toHexString(a[i]));
        }

    }
}
