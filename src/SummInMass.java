import java.util.Random;

public class SummInMass {
    public static void main(String[] args) {
        Random random = new Random();
        int a[] = new int[5];
        int sum = 0;
        for (int i = 0; i < 5; i++) {
            a[i] = random.nextInt(10);
            sum = sum + a[i];
            System.out.println(a[i]);

        }
        System.out.println("sum = " + sum);


    }


}
