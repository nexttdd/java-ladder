package domain;

import javafx.beans.binding.BooleanExpression;

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

    public static Point of(boolean left, boolean right) {
        return new Point(left, right);
    }

    public static Point first(boolean current) {
        return new Point(Boolean.FALSE, current);
    }

    public static Point last(boolean current) {
        return new Point(current, Boolean.FALSE);
    }

    public static Point of(Point beforePoint) {
        return new Point();
    }
}
