public class Stone {
    private final float x;
    private final float y;
    private final float color;

    public Stone(int x, int y, int color) {
        this.x = x;
        this.y = y;
        this.color = color;
    }


    public float getY() {
        return y;
    }

    public float getX() {
        return x;
    }

    public float getColor() {
        return color;
    }
}
