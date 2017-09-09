import processing.core.PApplet;

public class Program extends PApplet {
    public static void main(String[] args){
        PApplet.main("Program");
    }

    @Override
    public void draw() {
       rect(100,100,100,100);
    }

    @Override
    public void settings() {
        size(800,600);
    }

    @Override
    public void setup() {
        background(255,255,255);
        this.rect(100,100,200,200);
    }
}
