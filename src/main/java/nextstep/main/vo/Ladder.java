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

    public List<Line> getLines() {
        return this.lines;
    }

    public int getResult(int position) {
        //TODO : Line을 반복하면서 position값 구하기
        List<Boolean> line = getLines().get(position).getPoints();
        for(Boolean isCheck : line){
            if(isCheck)
                return 1;
            return 0;
        }
        return 0;
    }
}
