package shape_hierarchy;

public class Sphere extends ThreeDimensionalShape{
    private double radius;

    public Sphere(double radius){
        this.radius = radius;
    }
    @Override
    public double getArea() {
        return 4 * 3.14 * Math.pow(this.radius, 2);
    }

    @Override
    public double getVolume() {
        return Math.pow(this.radius, 3) * 3.14 * 4 / 3;
    }
}
