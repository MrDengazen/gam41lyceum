package Screens;

import static com.mygdx.game.Main.batch;

import com.badlogic.gdx.graphics.g2d.BitmapFont;

public class TextButton {
    public float x;
    public float y;
    float width;
    public float height;
    public String text;
    public BitmapFont font;

    public TextButton(BitmapFont font, String text, float x, float y, float width, float height) {
        this.font = font;
        this.text = text;

        this.width = width;
        this.height = height;

        this.x = x;
        this.y = y;
    }

    public boolean hit(float tx, float ty) {
        return x < tx && tx < x + width * text.length() && y > ty && ty > y - height;
    }

    void update(){
        font.draw(batch, text, x, y);
    }
}
