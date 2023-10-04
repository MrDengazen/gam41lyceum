package gameclasses;

import static gameclasses.InvokerGame.buttons_textures;

import Screens.Image_Button;

public class QWER extends Image_Button {
    int id;
    public QWER(int id, float width, float height, float x, float y) {
        super(buttons_textures[id], width, height, x, y);
        this.id = id;
    }
    public int getId(){
        return id;
    }
}
