package coordinate_caculator;

public class Pos {
    public static final int MAX_POS = 24;
    private int xPos;
    private int yPos;

    public Pos(int xPos, int yPos) {
        if(isPosUpperMaxNumber(xPos, yPos)) {
            throw new IllegalArgumentException();
        }
        this.xPos = xPos;
        this.yPos = yPos;
    }

    private boolean isPosUpperMaxNumber(int xPos, int yPos) {
        return xPos > MAX_POS || yPos > MAX_POS;
    }
}
