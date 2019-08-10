package domain;

import java.util.Objects;

public class Player {
    private static final int MAX_NAME_LENGTH = 5;
    private final String name;

    public Player(String name) {
        if (name.length() > MAX_NAME_LENGTH) {
            throw new IllegalArgumentException();
        }
        this.name = name;
    }

    @Override
    public String toString() {
        int leftPadding = (MAX_NAME_LENGTH - name.length()) / 2;
        int rightPadding = MAX_NAME_LENGTH - name.length() - leftPadding;

        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < leftPadding; i++) {
            stringBuilder.append(" ");
        }
        stringBuilder.append(name);
        for (int i = 0; i < rightPadding; i++) {
            stringBuilder.append(" ");
        }

        return stringBuilder.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Player player = (Player) o;
        return Objects.equals(name, player.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }
}
