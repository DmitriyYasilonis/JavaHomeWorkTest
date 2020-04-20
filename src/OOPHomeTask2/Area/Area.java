import OOPHomeTask2.Area.CircleArea;
import OOPHomeTask2.Area.RectangleArea;
import OOPHomeTask2.Area.Shape;
import OOPHomeTask2.Area.SquareArea;

public class Area {
    public static void main(String[] args)
    {
        Shape shape;

        RectangleArea rect = new RectangleArea();
        shape = rect;
        shape.setValues(50, 10);
        System.out.println("Area of rectangle : " + shape.getArea());

        SquareArea sqr = new SquareArea();
        shape = sqr;
        shape.setValue(9);
        System.out.println("Area of square : " + shape.getArea());

        CircleArea circle = new CircleArea();
        shape = circle;
        shape.setValue(10);
        System.out.println("Area of triangle : " + shape.getArea());
    }
}