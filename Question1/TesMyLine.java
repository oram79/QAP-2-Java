package Question1;

public class TesMyLine {
    public static void main(String[] args) {
        MyPoint p1 = new MyPoint(3, 7);
        MyPoint p2 = new MyPoint(4, 5);
        MyLine line = new MyLine(p1, p2);

        System.out.println(line);
        System.out.println("Length: " + line.getLength());
    }
}
