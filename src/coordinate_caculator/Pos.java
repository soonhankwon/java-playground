package coordinate_caculator;

import java.util.Objects;

public class Pos {
    public static final int MAX_POS = 24;
    public static final int MIN_POS = 0;
    private int xPos;
    private int yPos;

    public Pos(int xPos, int yPos) {
        if(isPosInvalidNumber(xPos, yPos)) {
            throw new IllegalArgumentException();
        }
        this.xPos = xPos;
        this.yPos = yPos;
    }

    private boolean isPosInvalidNumber(int xPos, int yPos) {
        return xPos > MAX_POS || yPos > MAX_POS || xPos < MIN_POS || yPos < MIN_POS;
    }

    public static double calculateDistance(Pos pos1, Pos pos2) {
        double result = Math.sqrt(Math.pow(pos1.getX() - pos2.getX(), 2)
                + Math.pow(pos1.getY() - pos2.getY(), 2));

        return Math.round(result * 1000000) / 1000000.0;
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
