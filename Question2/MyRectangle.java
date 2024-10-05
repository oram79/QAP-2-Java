package Question2;
import Question1.MyPoint;

public class MyRectangle {
    private MyPoint topLeft;
    private MyPoint bottomRight;

    public MyRectangle(MyPoint topLeft , MyPoint bottomRight) {
        this.topLeft = topLeft;
    }

    public double getWidth() {
        return Math.abs(bottomRight.getX() - topLeft.getX());
    }
    public double getHeight() {
        return Math.abs(bottomRight.getY() - topLeft.getY());
    }
    
}


