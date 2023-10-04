package gameclasses;

import static gameclasses.InvokerGame.balls_textures;

import Screens.Image;

public class Ball extends Image {
    int id;
    public Ball(int id, float width, float height, float x, float y) {
        super(balls_textures[id], width, height, x, y);
        this.id = id;
    }
    public int getId(){
        return id;
    }
    public void setId(int id){
        this.id = id;
        setTexture(balls_textures[id]);
    }

}
