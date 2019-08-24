package ladder;

import java.util.ArrayList;
import java.util.Arrays;
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

    public int findLastPosition(String inputName) {
        int position = findPositionByName(inputName);

        for (Line line : lines) {
            position = line.nextPosition(position);
        }

        return position;
    }

    private int findPositionByName(String inputName) {
        int idx = 0;

        for (String name : names) {
            if (name.equals(inputName)) {
                return idx;
            }
            idx++;
        }

        throw new IllegalArgumentException("참여자 이름이 없습니다.");
    }

    public String[] getNames() {
        return names;
    }

    public List<String> getNames2() {
        return Arrays.asList(names);
    }

    public List<Line> getLines() {
        return lines;
    }
}
