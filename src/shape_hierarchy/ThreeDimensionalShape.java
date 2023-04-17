package shape_hierarchy;

public abstract class ThreeDimensionalShape extends Shape{

    public abstract double getVolume();
    public abstract double getArea();

    @Override
    public int getShapeType() {
        return 3;
    }
}
