package HomeTask1.Triangle;

public class Triangle {
    public static double area(Point A, Point B, Point C) throws TriangleException {

        if ((A.equals(B) || A.equals(C) || B.equals(C)) ||
                (A.x == B.x && A.x == C.x) ||
                (A.y == B.y && A.y == C.y)) {
            throw new TriangleException();
        }

        double area = (A.x * (B.y - C.y) + B.x * (C.y - A.y) + C.x * (A.y - B.y)) / 2;
        return Math.abs(area);

    }
}
