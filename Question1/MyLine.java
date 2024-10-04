package Question1;

public class MyLine {
    private MyPoint begin;
    private MyPoint end;

    public MyLine(MyPoint begin, MyPoint end) {
        this.begin = begin;
        this.end = end;
    }

    public Mypoint getBegin() {
        return begin;
    }

    public Mypoint getEnd() {
        return end;
    }

    public double getLength() {
        return begin.distance(end);
    }

    public String toString() {
        return "Line From " + begin + " To " + end;
    }
}

