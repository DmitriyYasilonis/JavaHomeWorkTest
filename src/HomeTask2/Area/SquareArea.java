package HomeTask2.Area;

public class SquareArea extends Shape {
    @Override
    public double getArea() {
        return (getValue() * getValue());
    }
}
