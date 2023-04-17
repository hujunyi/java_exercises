package shape_hierarchy;

public abstract class TwoDimensionalShape extends Shape{
    public abstract double getArea();

    @Override
    public int getShapeType() {
        return 2;
    }
}
