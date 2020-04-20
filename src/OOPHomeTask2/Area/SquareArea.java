package OOPHomeTask2.Area;

public class SquareArea extends Shape {
    @Override
    public double getArea() {
        return (getValue() * getValue());
    }
}
