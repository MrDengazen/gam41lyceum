package Screens;

import static com.mygdx.game.Main.batch;

import com.badlogic.gdx.graphics.g2d.BitmapFont;

public class Text {

    public float x;
    public float y;
    static float width;
    static float height;
    public String text;
    public BitmapFont font;

    public Text(BitmapFont font, String text, float x, float y) {
        this.font = font;
        this.text = text;

        width = 55;
        height = 55;

        this.x = x;
        this.y = y;
    }

    void update() {
        font.draw(batch, text, x, y);
    }
}
