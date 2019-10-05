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

    public Line(int countOfPerson) {
        generateLine(countOfPerson);
    }

    public Line(int playerCount, String ladderLevel) {
            generateLine(playerCount);
    }

//    private void generateLine(int playerCount, String ladderLevel) {
//        points = new ArrayList<>();
//
//        IntStream.range(0, numberOfPoints(playerCount))
//                .forEach(i -> points.add(generateCurrentPoint(i)));
//
//        return points.size();
//    }

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

    private boolean generateCurrentPoint(int newPosition, String countOfPerson) {
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

    public boolean isGenerateLine(String level, int randomValue) {
//        int randomValue = randomWithin10();
        if("하".equals(level) && randomValue < 4){
            return true;
        }
        if("중".equals(level) && randomValue < 7){
            return true;
        }
        if("상".equals(level)&& randomValue < 10){
            return true;
        }

        return false;
    }

    private int randomWithin10(){
       return new Random(10).nextInt()+1;
    }
}
