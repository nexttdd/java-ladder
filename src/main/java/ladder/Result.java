package ladder;

import java.util.Arrays;
import java.util.List;

public class Result {
    private List<String> results;

    private Result(String input) {
        this.results = Arrays.asList(input.split(","));
    }

    public static Result of(String input) {
        return new Result(input);
    }

    public String findByPosition(int position) {
        return results.get(position);
    }

    public List<String> getResults() {
        return results;
    }
}
