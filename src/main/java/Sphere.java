/**
 * Created by stevenlyall on 2016-01-06.
 */
public class Sphere {
    private int radius;

    public Sphere(int radius) {
        this.radius = radius;
    }

    public double getArea() {
        return 4 * Math.PI /Math.pow(radius, 2);
    }
}
