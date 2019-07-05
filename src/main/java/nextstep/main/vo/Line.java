package nextstep.main.vo;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.stream.IntStream;

public class Line {
    private static final int START_POINT = 0;

    private List<Boolean> points;

    Line(int countOfPerson) {
        generateLine(countOfPerson);
    }

    private int generateLine(int countOfPerson) {
        points = new ArrayList<>();

        IntStream.range(0, numberOfPoints(countOfPerson))
                .forEach(i -> points.add(generateCurrentPoint(i)));

        return points.size();
    }

    private static int numberOfPoints(int countOfPerson) {
        return countOfPerson - 1;
    }

    private boolean generateCurrentPoint(int newPosition) {
        boolean point = new Random().nextBoolean();

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
}
