package fr.ul.rollingball;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Game;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.utils.Timer;
import fr.ul.rollingball.views.GameScreen;
import fr.ul.rollingball.views.SplashScreen;

public class RollingBall extends Game {

	private SplashScreen splash;
	private GameScreen game;
	private Timer.Task tt;

	@Override
	public void create () {
		splash = new SplashScreen();
		game = new GameScreen();
		setScreen(splash);
		tt = new Timer.Task() {
			@Override
			public void run() {
				setScreen(game);
			}
		};
		Timer.schedule(tt, 3);

	}

	@Override
	public void dispose () {
		splash.dispose();
		game.dispose();
	}
}
