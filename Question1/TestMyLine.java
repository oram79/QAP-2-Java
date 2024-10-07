package Question1;

public class TestMyLine {
    public static void main(String[] args) {
        MyPoint p1 = new MyPoint(3, 7);
        MyPoint p2 = new MyPoint(3, 5);
        MyLine line = new MyLine(p1, p2);

        System.out.println(line);
        System.out.println("Length: " + line.getLength());
    }
}
