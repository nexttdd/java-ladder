package ladder;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

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

    private static List<Bridge> buildOne() {
        return Collections.singletonList(BridgeBuilder.buildOne());
    }

    private static List<Bridge> buildDouble() {
        Bridge firstBridge = BridgeBuilder.buildFirst();
        return Arrays.asList(firstBridge, BridgeBuilder.buildLast(firstBridge));
    }

    private static List<Bridge> buildMulti(int numberOfPeople) {
        List<Bridge> bridges = new ArrayList<>();

        bridges.add(BridgeBuilder.buildFirst());
        for (int i = 1; i < numberOfPeople - 1; i++) {
            bridges.add(BridgeBuilder.buildMiddle(bridges.get(i - 1)));
        }
        bridges.add(BridgeBuilder.buildLast(bridges.get(numberOfPeople - 2)));

        return bridges;
    }

    public List<Bridge> getBridges() {
        return Collections.unmodifiableList(bridges);
    }

    public int nextPosition(int position) {
        return bridges.get(position).nextPosition(position);
    }
}
