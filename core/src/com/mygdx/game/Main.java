package com.mygdx.game;

import com.badlogic.gdx.Game;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.graphics.g2d.BitmapFont;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.graphics.g2d.freetype.FreeTypeFontGenerator;
import com.badlogic.gdx.math.Vector3;

import Screens.Menu;
import gameclasses.InvokerGame;

public class Main extends Game {
    public static SpriteBatch batch;
    public static float scrX;
    public static float scrY;
    public static float pppX;
    public static float pppY;
    public Vector3 touch;
    public Menu startMenu;
    public static InvokerGame invokerGame;
    public BitmapFont font;

    @Override
    public void create() {
        batch = new SpriteBatch();
        batch.enableBlending();

        touch = new Vector3();

        scrX = Gdx.graphics.getWidth();
        scrY = Gdx.graphics.getHeight();

        pppX = scrX / 100f;
        pppY = scrY / 100f;

        createFont();

        startMenu = new Menu(this);
        invokerGame = new InvokerGame(this);
        setScreen(startMenu);
    }

    @Override
    public void dispose() {
        batch.dispose();
    }

    void createFont() {
        FreeTypeFontGenerator generator = new FreeTypeFontGenerator(Gdx.files.internal("LilitaOne-Regular.ttf"));

        FreeTypeFontGenerator.FreeTypeFontParameter parameter = new FreeTypeFontGenerator.FreeTypeFontParameter();

        parameter.characters = "абвгдеёжзийклмнопрстуфхцчшщъыьэюяabcdefghijklmnopqrstuvwxyzАБВГДЕЁЖЗИЙКЛМНОПРСТУФХЦЧШЩЪЫЬЭЮЯABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789][_!$%#@|\\/?-+=()*&.;:,{}\"´`'<>";

        parameter.size = (int) (50 * (pppX + pppY) / 15);
        parameter.color = Color.ORANGE;
        parameter.borderWidth = (pppX + pppY) / 20 * 3;
        parameter.borderColor = Color.BLACK;
        font = generator.generateFont(parameter);


    }
}
