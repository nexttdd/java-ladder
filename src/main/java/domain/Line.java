package domain;

import java.util.ArrayList;
import java.util.List;

public class Line {
    private List<Point> points = new ArrayList<>();

    public Line (int countOfPlayers) {

        points.add(Point.first());

        for(int i=1; i<countOfPlayers-1; i++) {
            points.add(Point.of(points.get(i-1)));
        }

        points.add(Point.last(points.get(countOfPlayers-2)));
    }

    public List<Point> getPoints() {
        return points;
    }
}
