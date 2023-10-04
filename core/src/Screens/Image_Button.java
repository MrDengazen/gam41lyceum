package Screens;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Sprite;

public class Image_Button extends Sprite {
    public Image_Button(Texture texture, float width, float height, float x, float y) {
        super(texture);
        setSize(width, height);
        setX(x);
        setY(y);
    }
    public boolean hit(float x, float y){
        return getBoundingRectangle().contains(x, y);
    }

}
