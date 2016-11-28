import java.util.Random;

public class FindMin {
    public static void main(String[] args) {
        Random random = new Random();
        int a[] = new int[15];
        for (int i = 0; i < 15; i++) {
            a[i] = random.nextInt(150);
            System.out.println(a[i]);

        }
        int min = a[0];
        for (int i = 1; i < a.length; i++)
            if (a[i] < min)
                min = a[i];
        System.out.printf("\nmin " + min);


    }
}
