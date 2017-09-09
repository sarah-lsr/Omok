import processing.core.PApplet;

public class Program extends PApplet {

    private Stone[][] stoneArray = new Stone[16][16];
    boolean player = true;

    public static void main(String[] args) {
        PApplet.main("Program");
    }

    @Override
    public void draw() {
        drawGrid();
        drawStone();
    }

    private void drawGrid() {
        for (int i = 0; i < 16; i++) {
            line(20, 20 + 40 * i, 620, 20 + 40 * i);
        }
        for (int i = 0; i < 16; i++) {
            line(20 + 40 * i, 20, 20 + 40 * i, 620);
        }
    }

    private void drawStone() {
        for (int i = 0; i < 16; i++) {
            for (int j = 0; j < 16; j++) {
                Stone stone = stoneArray[i][j];
                if (stone != null) {
                    fill(stone.getColor());
                    ellipse(stone.getX(), stone.getY(), 30, 30);
                }


            }
        }
    }

    private void checkMousePoint() {
        int x = 20;
        int y = 20;
        for (int i = 0; i < 16; i++) {
            for (int j = 0; j < 16; j++) {
                if (mouseX >= x - 20 && mouseX < x + 20 && mouseY >= y - 20 && mouseY < y + 20) {

                    if (stoneArray[i][j] != null) {
                        return;
                    }

                    if (player)
                        stoneArray[i][j] = new Stone(x, y, 255);
                    else
                        stoneArray[i][j] = new Stone(x, y, 0);

                    player ^= true;

                }
                x = x + 40;
            }
            y = y + 40;
            x = 20;

        }
    }


    @Override
    public void mousePressed() {
        checkMousePoint();

    }

    @Override
    public void settings() {
        size(660, 660);
    }

    @Override
    public void setup() {
        background(220, 179, 92);
    }

    private void checkStone() {
        for (int i = 0; i < 16; i++) {
            for (int j = 0; j < 16; j++) {
                if(stoneArray[i][j] != null){
                    checkWinnerState();
                }
            }

        }
    }

    private void checkWinnerState(){

    }
}
