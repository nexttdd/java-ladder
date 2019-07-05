package ladder;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Line {
    private final List<Bridge> bridges;

    private Line(List<Bridge> bridges) {
        this.bridges = bridges;
    }

    public static Line of(int numberOfPeople) {
        if (numberOfPeople < 2) {
            return new Line(buildOne());
        }

        if (numberOfPeople == 2) {
            return new Line(buildDouble());
        }

        return new Line(buildMulti(numberOfPeople));
    }

    private static List<Bridge> buildMulti(int numberOfPeople) {
        List<Bridge> bridges = new ArrayList<>();

        bridges.add(BridgeBuilder.buildLeft());
        for (int i = 1; i < numberOfPeople - 1; i++) {
            bridges.add(BridgeBuilder.buildMiddle(bridges.get(i - 1)));
        }
        bridges.add(BridgeBuilder.buildRight(bridges.get(numberOfPeople - 2)));

        return bridges;
    }

    private static List<Bridge> buildOne() {
        return Collections.singletonList(BridgeBuilder.buildOne());
    }

    private static List<Bridge> buildDouble() {
        Bridge firstBridge = BridgeBuilder.buildLeft();
        return Arrays.asList(firstBridge, BridgeBuilder.buildRight(firstBridge));
    }

    public List<Bridge> getBridges() {
        return Collections.unmodifiableList(bridges);
    }
}
