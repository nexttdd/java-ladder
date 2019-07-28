package view;

import domain.Line;
import domain.Players;

import java.util.List;
import java.util.stream.Collectors;

public class ResultView {

    private static final String HORIZONTAL_LINE = "-----";
    private static final String HORIZONTAL_EMPTY = "     ";
    private static final String VERTICAL_LINE = "|";


    public static void printResult(Players players, List<Line> lines) {
        System.out.println("실행결과\n");
        printPlayers(players);
        printLines(lines);
    }

    private static void printPlayers(Players players) {
        System.out.println(" " +
                players.getPlayers().stream()
                .map(player -> player.toString())
                .collect(Collectors.joining(" ")));
    }

    private static void printLines(List<Line> lines) {
        lines.forEach(ResultView::printLine);
    }

    private static void printLine(Line line) {
        StringBuilder stringBuilder = new StringBuilder("   ");

        line.getPoints().forEach(point -> {
            stringBuilder.append(VERTICAL_LINE);
            if (point.isRight()) {
                stringBuilder.append(HORIZONTAL_LINE);
            } else {
                stringBuilder.append(HORIZONTAL_EMPTY);
            }
        });
        System.out.println(stringBuilder.toString());
    }
}