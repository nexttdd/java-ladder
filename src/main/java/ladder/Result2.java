package ladder;

import java.util.Map;

public class Result2 {
    private static Map<String, String> ladderResults;

    private Result2(Map<String, String> ladderResults) {
        this.ladderResults = ladderResults;
    }

    public static Result2 of(Map<String, String> ladderResults) {
        return new Result2(ladderResults);
    }
}
