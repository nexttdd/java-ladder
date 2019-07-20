package domain;


public class Point {
    private boolean left;
    private boolean right;

    private Point(boolean left, boolean right) {
        if (left && right) {
            throw new IllegalArgumentException();
        }
        this.left = left;
        this.right = right;
    }

    public static Point first(boolean current) {
        return new Point(Boolean.FALSE, current);
    }

    public static Point last(boolean current) {
        return new Point(current, Boolean.FALSE);
    }

    public static Point of(Point beforePoint) {
        if(beforePoint.right)
            return new Point(Boolean.TRUE, Boolean.FALSE);
        return new Point(false, RandomUtil.getBoolean());
    }

    public boolean isLeft() {
        return this.left;
    }

    public boolean isRight() {
        return this.right;
    }
}
