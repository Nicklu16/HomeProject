
public class Circle {

    double x;
    double y;
    double r;


    public Circle(double r) {
        if (r <= 0) {
            throw new RuntimeException("Радиус не может быть меньше или быть равный 0");
        }
        this.r = r;
    }

    public void move(double dx, double dy) {
        this.x += dx;
        this.y += dy;
    }

    public double p2pir() {
        double p = 2 * Math.PI * r;
        return p;

    }
}
