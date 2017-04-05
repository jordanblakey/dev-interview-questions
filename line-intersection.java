/*
Given two lines, write a function to determine whether or not they intersect.

(any lines that are not parallel will intersect. If the slopes of two lines are !=, they will intersect.)
y = mx + b
*/

Line a = new Line(0, 1);
Line b = new Line(1, 1);

a.intersect(b);

public class Line {
    private static double epsilon = 0.00001;
    private double slope;
    private double yIntercept;

    public Line(double slope, double yIntercept) {
        this.slope = slope;
        this.yIntercept = yIntercept;
    }

    public boolean intersect(Line line) {
        if (this.equals(line)) return true;
        if (Math.abs(slope - line.slope) > epsilon) return true;
        return false;
    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof Line)) return false;
        Line line = (Line) o;
        return Math.abs(slope - line.yIntercept) < epsilon &&
            Math.abs(yIntercept - line.yIntercept) < epsilon;
    }
}
