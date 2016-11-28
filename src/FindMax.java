import java.util.Random;

public class FindMax {
    public static void main(String[] args) {
        Random random = new Random();
        int a[] = new int[5];
        for (int i = 0; i < 5; i++) {
            a[i] = random.nextInt(10);
            System.out.println(a[i]);

        }
        int max = a[0];
        for (int i = 1; i < a.length; i++)
            if (a[i] > max)
                max = a[i];
        System.out.printf("\nmax " + max);


    }
}
