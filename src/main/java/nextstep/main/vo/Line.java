package nextstep.main.vo;

import org.apache.commons.lang3.StringUtils;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.stream.IntStream;

public class Line {
    private static final int START_POINT = 0;
    public static final String VERTICAL = "|";
    public static final int HORIZONTAL_SIZE = 5;
    public static final String DASH = "-";
    public static final String EMPTY = " ";

    private List<Boolean> points;

    public Line() {
    }

    public Line(int playerCount, LadderLevel ladderLevel) {
        generateLine(playerCount, ladderLevel);
    }

    private void generateLine(int playerCount, LadderLevel ladderLevel) {
        points = new ArrayList<>();

        IntStream.range(0, numberOfPoints(playerCount))
                .forEach(i -> points.add(generateCurrentPoint(i, ladderLevel)));
    }

    private static int numberOfPoints(int countOfPerson) {
        return countOfPerson - 1;
    }

    private boolean generateCurrentPoint(int newPosition, LadderLevel ladderLevel) {
        boolean point = ladderLevel.isLowerThenLimit(randomWithin10());

        if (isOverLapped(newPosition, point)) {
            point = !point;
        }

        return point;
    }

    private boolean isOverLapped(int currPosition, boolean newPoint) {
        if (currPosition == START_POINT)
            return false;

        return isEqual(points.get(currPosition - 1), newPoint);
    }

    static boolean isEqual(boolean prevPoint, boolean newPoint) {
        return prevPoint == newPoint;
    }

    @Override
    public String toString() {
        final StringBuilder str = new StringBuilder("    |");

        points.forEach(isLine -> str.append(pointToString(isLine)));

        return str.toString();
    }

    private String pointToString(boolean isLine) {
        if (isLine) {
            return StringUtils.leftPad(VERTICAL, HORIZONTAL_SIZE, DASH);
        }

        return StringUtils.leftPad(VERTICAL, HORIZONTAL_SIZE, EMPTY);
    }

    public int getPlusMinusPosition(int currentPosition) {
        if (currentPosition == 0) {
            return points.get(0) ? currentPosition + 1 : currentPosition;
        }

        if (currentPosition == points.size()) {
            return points.get(currentPosition - 1) ? currentPosition - 1 : currentPosition;
        }

        if (points.get(currentPosition)) {
            return currentPosition + 1;
        }


        if (points.get(currentPosition - 1)) {
            return currentPosition - 1;
        }

        return currentPosition;
    }

    public boolean isGenerateLine(LadderLevel level, int randomValue) {
        return level.isLowerThenLimit(randomValue);
    }

    private int randomWithin10() {
        return new Random().nextInt(10) + 1;
    }
}
