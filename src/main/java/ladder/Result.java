package ladder;

import java.util.Map;
import java.util.Set;

public class Result {
    private Map<String, String> ladderResults;

    private Result(Map<String, String> ladderResults) {
        this.ladderResults = ladderResults;
    }

    public static Result of(Map<String, String> ladderResults) {
        return new Result(ladderResults);
    }

    public String getResult(String userName) {
        return ladderResults.get(userName);
    }

    public Set<String> findAll() {
        return ladderResults.keySet();
    }
}
