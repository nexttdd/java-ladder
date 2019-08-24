package ladder.view;

import ladder.Bridge;
import ladder.Ladder;
import ladder.Line;
import ladder.Result;
import org.apache.commons.lang3.StringUtils;

import java.util.List;

public class OutputView {
    private static final int LENGTH = 6;
    private static final String EMPTY_SPACE = " ";
    private static final String VERTICAL_LINE = "|";
    private static final String BRIDGE_LINE = "-";

    public static void printLadders(Ladder ladder, Result result) {
        printNames(ladder.getNames());
        printLadder(ladder.getLines());
        printResult(result);
    }

    private static void printResult(Result result) {
        StringBuilder sb = new StringBuilder();
        result.getResults()
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

    public static void printReward(String userName, Ladder ladder, Result result) {
        System.out.println("\n실행 결과");

        if ("all".equals(userName)) {
            //TODO : ladder를 넘기도록 수정
            ladder.getNames()
                    .forEach(name ->
                            System.out.println(name + " : " + result.findByPosition(ladder, name)));
            return;
        }

        //TODO : ladder.findLastPosition(userName) -> ladder를 넘기도록
        System.out.println(userName + " : " + result.findByPosition(ladder, userName));
    }
}
