package fr.ul.rollingball.views;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.ScreenAdapter;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import fr.ul.rollingball.dataFactories.TextureFactory;

public class GameScreen extends ScreenAdapter {

    private SpriteBatch affJeu;

    public GameScreen(){
        affJeu = new SpriteBatch();
    }

    @Override
    public void render (float delta) {
        Gdx.gl.glClearColor(1, 0, 0, 1);
        Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
        affJeu.begin();
        affJeu.draw(TextureFactory.getInstance().getPiste(), 0, 0);
        affJeu.end();
    }

    public void dispose(){
        affJeu.dispose();
    }

}
