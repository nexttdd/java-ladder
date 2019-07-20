package view;

import domain.Line;
import domain.Players;

import java.util.List;

public class ResultView {

    public static void printResult(Players players, List<Line> lines) {
        System.out.println("실행결과\n");
        printPlayers(players);
        printLines(lines);
    }

    private static void printPlayers(Players players) {
        System.out.println(players.toString());
    }

    private static void printLines(List<Line> lines) {

    }
}