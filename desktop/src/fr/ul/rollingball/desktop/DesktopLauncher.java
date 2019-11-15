package fr.ul.rollingball.desktop;

import com.badlogic.gdx.backends.lwjgl.LwjglApplication;
import com.badlogic.gdx.backends.lwjgl.LwjglApplicationConfiguration;
import fr.ul.rollingball.RollingBall;

public class DesktopLauncher {
	public static void main (String[] arg) {
		LwjglApplicationConfiguration config = new LwjglApplicationConfiguration();
		config.a = 8; // ajout du canal alpha
		config.width = 1024; // ajout de dimension width
		config.height = 720; // ajout de dimension height
		new LwjglApplication(new RollingBall(), config);
	}
}
