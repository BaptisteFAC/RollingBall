package fr.ul.rollingball.views;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.ScreenAdapter;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import fr.ul.rollingball.dataFactories.TextureFactory;

public class SplashScreen extends ScreenAdapter {

    private SpriteBatch affIntro;

    public SplashScreen(){
        affIntro = new SpriteBatch();
    }

    @Override
    public void render (float delta) {
        Gdx.gl.glClearColor(1, 0, 0, 1);
        Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
        affIntro.begin();
        affIntro.draw(TextureFactory.getInstance().getIntro(), 0, 0);
        affIntro.end();
    }

    public void dispose () {
        affIntro.dispose();
    }

}