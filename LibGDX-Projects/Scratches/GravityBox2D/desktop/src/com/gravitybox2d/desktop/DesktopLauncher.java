package com.gravitybox2d.desktop;

import com.badlogic.gdx.backends.lwjgl.LwjglApplication;
import com.badlogic.gdx.backends.lwjgl.LwjglApplicationConfiguration;
import com.gravitybox2d.GravityBox2D;

public class DesktopLauncher {

    public static void main(String[] arg) {
        LwjglApplicationConfiguration config = new LwjglApplicationConfiguration();
        config.width = 720;
        config.height = 480;
        config.backgroundFPS = 60;
        config.foregroundFPS = 60;
        new LwjglApplication(new GravityBox2D(), config);
    }
}
