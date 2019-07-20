package domain;

import java.util.ArrayList;
import java.util.List;

public class Line {
    private List<Point> points = new ArrayList<>();

    public Line (List<Point> points) {
        this.points = points;
    }

    public Line (int countOfPlayers) {
        for(int i=0; i<countOfPlayers; i++) {
            points.add(null);
        }
    }
}
