package gameclasses;

import static com.mygdx.game.Main.batch;
import static com.mygdx.game.Main.pppX;
import static com.mygdx.game.Main.pppY;
import static com.mygdx.game.Main.scrY;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Screen;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.utils.ScreenUtils;
import com.mygdx.game.Main;

import java.util.Arrays;
import java.util.Collections;


public class InvokerGame implements Screen {
    Main game;
    protected static Texture[] buttons_textures;
    protected static Texture[] balls_textures;
    QWER[] buttons;
    Ball[] balls;
    Integer[] id_balls;
    boolean is_skill_casted;
    String id_skill_casted;

    public InvokerGame(Main game) {
        this.game = game;
        buttons_textures = new Texture[4];
        balls_textures = new Texture[3];
        buttons = new QWER[4];
        balls = new Ball[3];
        id_balls = new Integer[3];
        for (int i = 0; i < buttons_textures.length; i++) {
            buttons_textures[i] = new Texture("button_" + i + ".png");
        }
        for (int i = 0; i < balls_textures.length; i++) {
            balls_textures[i] = new Texture("ball_" + i + ".png");
        }
        for (int i = 0; i < buttons_textures.length; i++) {
            buttons[i] = new QWER(i, pppY * 25, pppY * 25, pppX * 12.5f + pppX * 20 * i, pppY * 2);
        }
        for (int i = 0; i < balls_textures.length; i++) {
            balls[i] = new Ball(i, pppY * 10, pppY * 10, pppX * 40 + pppX * 7.5f * i, pppY * 29);
            id_balls[i] = i;
        }
    }

    @Override
    public void show() {
    }

    @Override
    public void render(float delta) {
        ScreenUtils.clear(0.5f, 0.5f, 0.5f, 1);
        batch.begin();
        for (QWER qwer : buttons) {
            qwer.draw(batch);
        }
        for (Ball ball : balls) {
            ball.draw(batch);
        }
        if (Gdx.input.justTouched()) {
            game.touch.set(Gdx.input.getX(), scrY - Gdx.input.getY(), 0);
            for (QWER button : buttons) {
                if (button.hit(game.touch.x, game.touch.y)) {
                    if (button.getId() < 3) {
                        for (int i = 0; i < 2; i++) {
                            balls[i].setId(balls[i + 1].getId());
                            id_balls[i] = id_balls[i + 1];
                        }
                        balls[2].setId(button.getId());
                        id_balls[2] = button.getId();
                    } else if(button.getId() == 3){
                        is_skill_casted = true;
                        Arrays.sort(id_balls, Collections.<Integer>reverseOrder());
                        id_skill_casted = id_balls[0] + "" + id_balls[1] + id_balls[2];

                    }
                }
            }
        }
        batch.end();
    }

    @Override
    public void resize(int width, int height) {

    }

    @Override
    public void pause() {

    }

    @Override
    public void resume() {

    }

    @Override
    public void hide() {

    }

    @Override
    public void dispose() {

    }

}
