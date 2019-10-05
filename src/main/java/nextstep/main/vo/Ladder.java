package nextstep.main.vo;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

public class Ladder {
    private List<Line> lines;

    public Ladder() {
        this.lines = new ArrayList<>();
    }

    public int generateLadder(int ladderHeight, int playerCount) {
        IntStream.range(0, ladderHeight)
                .mapToObj(item -> new Line(playerCount))
                .forEach(line -> this.lines.add(line));

        return this.lines.size();
    }

    public int generateLadder(String ladderLevel, int playerCount) {
        int ladderHeight = getLadderHeight(ladderLevel);

        IntStream.range(0, ladderHeight)
                .mapToObj(item -> new Line(playerCount))
                .forEach(line -> this.lines.add(line));

        return this.lines.size();
    }

    private int getLadderHeight(String ladderLevel){
        if("상".equals(ladderLevel)){
            return 20;
        }
        if("중".equals(ladderLevel)){
            return 10;
        }
        if("하".equals(ladderLevel)){
            return 5;
        }
       throw  new IllegalArgumentException();
    }

    public List<Line> getLines() {
        return this.lines;
    }

    public int getResult(int position) {
        int currentPosition = position;

        for (int i = 0; i < lines.size(); i++) {
            currentPosition = lines.get(i).getPlusMinusPosition(currentPosition);
        }

        return currentPosition;
    }
}
