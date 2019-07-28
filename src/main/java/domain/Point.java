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

    public static Point first() {
        return new Point(Boolean.FALSE, RandomUtil.getBoolean());
    }

    public static Point last(Point beforePoint) {
        return new Point(beforePoint.right, Boolean.FALSE);
    }

    public static Point of(Point beforePoint) {
        return new Point(beforePoint.right, RandomUtil.getBoolean(beforePoint.right));
    }

    public static Point of(boolean left, boolean right) {
        return new Point(left, right);
    }

    public boolean isLeft() {
        return this.left;
    }

    public boolean isRight() {
        return this.right;
    }
}
