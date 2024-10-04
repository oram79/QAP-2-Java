package Question1;

public class MyLine {
    private MyPoint begin;
    private MyPoint end;

    public MyLine(MyPoint begin, MyPoint end) {
        this.begin = begin;
        this.end = end;
    }

    public MyPoint getBegin() {
        return begin;
    }

    public MyPoint getEnd() {
        return end;
    }

    public double getLength() {
        return begin.distance(end);
    }

    public String toString() {
        return "Line From " + begin + " To " + end;
    }
}

