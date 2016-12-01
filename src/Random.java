import java.util.Random;

public class Random {
    public static void main(String[] args) {
        Random random = new Random();
        int a[] = new int[15];
        for (int i = 0; i < 15; i++) {
            a[i]= random.nextInt(150);
            System.out.println(a[i]);

        }
    }
}
