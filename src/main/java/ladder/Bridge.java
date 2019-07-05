package ladder;

public class Bridge {
    private boolean left;
    private boolean right;

    private Bridge(boolean left, boolean right) {
        validate(left, right);
        this.left = left;
        this.right = right;
    }

    private void validate(boolean left, boolean right) {
        if (left && right) {
            throw new IllegalArgumentException("양쪽 방향으로 이동할 수 없습니다.");
        }
    }

    public static Bridge of(boolean goLeft, boolean goRight) {
        return new Bridge(goLeft, goRight);
    }

    public boolean goLeft() {
        return this.left;
    }

    public boolean goRight() {
        return this.right;
    }
}
