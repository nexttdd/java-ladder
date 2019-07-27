package ladder.view;

import ladder.Bridge;
import ladder.Ladder;
import ladder.Line;
import org.apache.commons.lang3.StringUtils;

import java.util.Arrays;
import java.util.List;

public class OutputView {
    private static final int LENGTH = 6;
    private static final String EMPTY_SPACE = " ";
    private static final String VERTICAL_LINE = "|";
    private static final String BRIDGE_LINE = "-";

    public static void printResult(Ladder ladder) {
        printNames(ladder.getNames());
        printLadder(ladder.getLines());
    }

    private static void printNames(String[] names) {
        StringBuilder sb = new StringBuilder();
        Arrays.stream(names)
                .forEach(name -> {
                    sb.append(StringUtils.leftPad(name, LENGTH));
                });
        System.out.println(sb.toString());
    }

    private static void printLadder(List<Line> lines) {
        lines.forEach(line -> {
            printLine(line.getBridges());
        });
    }

    private static void printLine(List<Bridge> bridges) {
        StringBuilder sb = new StringBuilder();
        bridges.forEach(bridge -> {
            printBridge(sb, bridge);
        });
        System.out.println(sb.toString());
    }

    private static void printBridge(StringBuilder sb, Bridge bridge) {
        String padCharacter = "";
        if (!bridge.goLeft()) {
            padCharacter = EMPTY_SPACE;
        }

        if (bridge.goLeft()) {
            padCharacter = BRIDGE_LINE;
        }

        sb.append(StringUtils.leftPad(VERTICAL_LINE, LENGTH, padCharacter));
    }
}
