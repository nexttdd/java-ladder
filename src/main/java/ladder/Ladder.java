package ladder;

import java.util.*;
import java.util.stream.Stream;

public class Ladder {
    private static int MIN_NAME_COUNT = 1;
    private static int MAX_NAME_LENGTH = 5;
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

    //TODO : names, ladderGameLevel
    public static Ladder of(String[] names, String ladderGameLevel) {
        List<Line> lines = new ArrayList<>();

        int height = checkLevel(ladderGameLevel);
        for (int i = 0; i < height; i++) {
            lines.add(Line.of(names.length));
        }

        return new Ladder(names, lines);
    }

    public static int checkLevel(String ladderGameLevel) {
        if("하".equals(ladderGameLevel))
            return 5;
        if("중".equals(ladderGameLevel))
            return 10;
        if("상".equals(ladderGameLevel))
            return 20;
        throw new IllegalArgumentException();
    }

    private void validation(String[] names, List<Line> lines) {
        if (Objects.isNull(names)) {
            throw new NullPointerException();
        }

        if (names.length < MIN_NAME_COUNT) {
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

        if (name.length() > MAX_NAME_LENGTH) {
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
