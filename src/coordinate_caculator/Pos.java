package coordinate_caculator;

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
}
