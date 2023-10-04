package Screens;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Sprite;

public class Image extends Sprite {
    public Image(Texture texture, float width, float height, float x, float y) {
        super(texture);
        setSize(width, height);
        setX(x);
        setY(y);
    }
}
