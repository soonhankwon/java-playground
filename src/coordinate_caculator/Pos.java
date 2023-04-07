package coordinate_caculator;

import java.util.Objects;

public class Pos {
    public static final int MAX_POS = 24;
    public static final int MIN_POS = 0;
    private final int xPos;
    private final int yPos;

    public Pos(int xPos, int yPos) {
        if (isPosInvalidNumber(xPos, yPos)) {
            throw new IllegalArgumentException();
        }
        this.xPos = xPos;
        this.yPos = yPos;
    }

    private boolean isPosInvalidNumber(int xPos, int yPos) {
        return xPos > MAX_POS || yPos > MAX_POS || xPos < MIN_POS || yPos < MIN_POS;
    }

    public int getX() {
        return this.xPos;
    }

    public int getY() {
        return this.yPos;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Pos pos = (Pos) o;
        return xPos == pos.xPos && yPos == pos.yPos;
    }

    @Override
    public int hashCode() {
        return Objects.hash(xPos, yPos);
    }
}
