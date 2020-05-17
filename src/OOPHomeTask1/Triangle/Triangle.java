package OOPHomeTask1.Triangle;

public class Triangle {
    private  Point a,b,c;

    public Triangle (Point A, Point B, Point C){
        this.a = A;
        this.b = B;
        this.c = C;
        }
    public double area() throws TriangleException {

        if ((a.equals(b) || a.equals(c) || b.equals(c)) ||
                (a.x == b.x && a.x == c.x) ||
                (a.y == b.y && a.y == c.y)) {
            throw new TriangleException();
        }

        double area = (a.x * (b.y - c.y) + b.x * (c.y - a.y) + c.x * (a.y - b.y)) / 2;
        return Math.abs(area);

    }
}

//public class Triangle {
//    public static double area(Point A, Point B, Point C) throws TriangleException {
//
//        if ((A.equals(B) || A.equals(C) || B.equals(C)) ||
//                (A.x == B.x && A.x == C.x) ||
//                (A.y == B.y && A.y == C.y)) {
//            throw new TriangleException();
//        }
//
//        double area = (A.x * (B.y - C.y) + B.x * (C.y - A.y) + C.x * (A.y - B.y)) / 2;
//        return Math.abs(area);
//
//    }
//}
