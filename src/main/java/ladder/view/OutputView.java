package ladder.view;

import ladder.Bridge;
import ladder.Ladder;
import ladder.Line;
import ladder.Result2;
import org.apache.commons.lang3.StringUtils;

import java.util.List;
import java.util.Set;

public class OutputView {
    private static final int LENGTH = 6;
    private static final String EMPTY_SPACE = " ";
    private static final String VERTICAL_LINE = "|";
    private static final String BRIDGE_LINE = "-";

    public static void printLadders(Ladder ladder, List<String> result) {
        printNames(ladder.getNames());
        printLadder(ladder.getLines());
        printResult(result);
    }

    private static void printResult(List<String> result) {
        StringBuilder sb = new StringBuilder();
        result
                .forEach(data -> sb.append(StringUtils.leftPad(data, LENGTH)));

        System.out.println(sb.toString());
    }

    private static void printNames(List<String> names) {
        StringBuilder sb = new StringBuilder();
        names.forEach(name -> sb.append(StringUtils.leftPad(name, LENGTH)));

        System.out.println(sb.toString());
    }

    private static void printLadder(List<Line> lines) {
        lines.forEach(line -> printLine(line.getBridges()));
    }

    private static void printLine(List<Bridge> bridges) {
        StringBuilder sb = new StringBuilder();
        bridges.forEach(bridge -> printBridge(sb, bridge));

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

    public static void printReward(String userName, Result2 result) {
        System.out.println("\n실행 결과");

        if ("all".equals(userName)) {
            printAll(result);
            return;
        }

        System.out.println(userName + " : " + result.getResult(userName));
    }

    private static void printAll(Result2 result) {
        Set<String> names = result.findAll();
        names.forEach(s -> {
            System.out.println(s + " : " + result.getResult(s));
        });
    }
}
