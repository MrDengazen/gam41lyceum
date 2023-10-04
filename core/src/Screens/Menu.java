package Screens;

import static com.mygdx.game.Main.batch;
import static com.mygdx.game.Main.invokerGame;
import static com.mygdx.game.Main.pppX;
import static com.mygdx.game.Main.pppY;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Screen;
import com.badlogic.gdx.utils.ScreenUtils;
import com.mygdx.game.Main;

public class Menu implements Screen {
    Main game;
    Text logo;
    TextButton play_button;

    public Menu(Main game) {
        this.game = game;
        logo = new Text(game.font, "INVOKER GAME", pppX * 32, pppY * 85);
        play_button = new TextButton(game.font, "PLAY", pppX * 45, pppY * 60, pppX * 3.2f, pppY * 22);
    }

    @Override
    public void show() {

    }

    @Override
    public void render(float delta) {
        ScreenUtils.clear(0.16f, 0.65f, 0.92f, 1);
        batch.begin();
        logo.update();
        play_button.update();
        batch.end();
        if (Gdx.input.justTouched()) {
            game.touch.set(Gdx.input.getX(), Gdx.input.getY(), 0);
            if (play_button.hit(game.touch.x, game.touch.y)) {
                System.out.println(1);
                game.setScreen(invokerGame);
            }
        }
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
