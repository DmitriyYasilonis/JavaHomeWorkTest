package HomeTask2.Area;

public class CircleArea extends Shape {
    public double getArea() {
        return Math.PI * (getValue() * getValue());
    }
}