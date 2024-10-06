package Question2;

import Question1.MyPoint;

public class TestMyRectangle {
    public static void main(String[] args) {
    MyPoint topLeft = new MyPoint(1, 5);
    MyPoint bottomRight = new MyPoint(4, 1);

        MyRectangle rectangle = new MyRectangle(topLeft, bottomRight);

        System.out.println(rectangle);
        System.out.println(" The Area is: " + rectangle.getArea());
    }
}
