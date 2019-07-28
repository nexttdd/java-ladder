package domain;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Players {
    private List<Player> players;
    private static final int MIN_PLAYER_NUMBER = 2;

    public Players(String[] playerNames) {
        if(playerNames.length < MIN_PLAYER_NUMBER) {
            throw new IllegalArgumentException();
        }

        players = Arrays.stream(playerNames)
                .map(Player::new)
                .collect(Collectors.toList());
    }

    public int countOfPlayers() {
        return players.size();
    }

    public List<Player> getPlayers() {
        return players;
    }
}
