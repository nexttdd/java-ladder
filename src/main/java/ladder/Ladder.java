package ladder;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

public class Ladder {
    private static int MIN_NAME_COUNT= 1;
    private String[] names;
    private List<Line> lines;

    private Ladder(String[] names, List<Line> lines) {
        if(Objects.isNull(names)){
            throw new NullPointerException();
        }

        if(names.length < MIN_NAME_COUNT) {
            throw new IllegalArgumentException();
        }

        if(lines.isEmpty()) {
            throw new IllegalArgumentException();
        }

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

    public List<String> getNames() {
        return Arrays.asList(names);
    }

    public List<Line> getLines() {
        return lines;
    }
}
