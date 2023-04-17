package shape_hierarchy;

public class Circle extends TwoDimensionalShape{

    private double radius;

    public Circle(double radius){
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return Math.pow(this.radius, 2) * 3.14;
    }
}
