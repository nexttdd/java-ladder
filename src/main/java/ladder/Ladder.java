package ladder;

import java.util.*;
import java.util.stream.Stream;

public class Ladder {
    private String[] names;
    private List<Line> lines;

    private Ladder(String[] names, List<Line> lines) {
        validation(names, lines);

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

    private void validation(String[] names, List<Line> lines) {
        if (Objects.isNull(names)) {
            throw new NullPointerException();
        }

        if (names.length < Const.MIN_NAME_COUNT) {
            throw new IllegalArgumentException();
        }

        Stream.of(names).forEach(this::validateName);

        if (lines.isEmpty()) {
            throw new IllegalArgumentException();
        }
    }

    private void validateName(String name) {
        if (name.isEmpty()) {
            throw new IllegalArgumentException();
        }

        if (name.length() > Const.MAX_NAME_LENGTH) {
            throw new IllegalArgumentException();
        }
    }

    public List<String> getNames() {
        return Arrays.asList(names);
    }

    public List<Line> getLines() {
        return lines;
    }

    public Result start(List<String> results) {
        Map<String, String> gameResults = new HashMap<>();

        for (int i = 0; i < names.length; i++) {
            int lastPosition = findLastPosition(i);
            gameResults.put(names[i], results.get(lastPosition));
        }

        return Result.of(gameResults);
    }

    public int findLastPosition(int startPosition) {
        int position = startPosition;
        for (Line line : lines) {
            position = line.nextPosition(position);
        }

        return position;
    }
}
