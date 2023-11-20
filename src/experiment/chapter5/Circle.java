package experiment.chapter5;

public class Circle extends Geometry {
    double r;

    Circle(double r) {
        this.r = r;
    }

    @Override
    public double getArea() {
        return Math.PI * r * r;
    }
}
