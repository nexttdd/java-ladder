package ladder;

import java.util.ArrayList;
import java.util.List;

public class Ladder {
    private String[] names;
    private List<Line> lines;

    private Ladder(String[] names, List<Line> lines) {
        //TODO : validation (최소 이름 1개, lines null check)
        this.names = names;
        this.lines = lines;
    }

    public static Ladder of(String[] names, int height) {
        List<Line> lines = new ArrayList<>();

        for (int i = 0; i < height; i++) {
            lines.add(Line.of(names.length));
        }

        return new Ladder(names, lines);
    }

    public String[] getNames() {
        return names;
    }

    public List<Line> getLines() {
        return lines;
    }

    public int findLastPosition(int position) {
        for (Line line : lines) {
            position = line.nextPosition(position);
        }

        return position;
    }
}
