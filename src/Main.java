/**
 * Created by Student-15 on 24.11.2016.
 */
public class Main {
    public static void main(String[] args) {
        Circle c = new Circle(10);
        System.out.println("circle " + c.x + " " + c.y + " " + c.r);
        c.move(1, 3);
        System.out.println("circle " + c.x + " " + c.y + " " + c.r);
        System.out.println("Длина окружности "+c.p2pir());


    }
}
