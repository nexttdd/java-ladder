package ladder;

import java.util.Map;
import java.util.Set;

public class Result2 {
    private Map<String, String> ladderResults;

    private Result2(Map<String, String> ladderResults) {
        this.ladderResults = ladderResults;
    }

    public static Result2 of(Map<String, String> ladderResults) {
        return new Result2(ladderResults);
    }

    public String getResult(String userName) {
        return ladderResults.get(userName);
    }

    public Set<String> findAll() {
        return ladderResults.keySet();
    }
}
