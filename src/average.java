

public class average {
    public static void main(String[] args) {
        int[] a = {5, 8, 12, -18, -59, 84, -35, 17, 37};

        double average = 0;
        if (a.length > 0) {
            double sum = 0;
            for (int i = 0; i < a.length; i++) {
                sum += a[i];
            }
            average = sum / a.length;
            System.out.println(average);
        }


    }
}




