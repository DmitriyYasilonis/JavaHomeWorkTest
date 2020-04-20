package OOPHomeTask2.Area;

public abstract class Shape {
    private double height;
    private double width;
    private double value;

    public void setValues(double height, double width) {
        this.height = height;
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public double getWidth() {
        return width;
    }

    public void setValue(double value) {
        this.value = value;
    }

    public double getValue() {
        return value;
    }

    public abstract double getArea();
}
