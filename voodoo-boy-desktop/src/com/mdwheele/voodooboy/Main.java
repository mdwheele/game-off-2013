package com.mdwheele.voodooboy;

import com.badlogic.gdx.backends.lwjgl.LwjglApplication;
import com.badlogic.gdx.backends.lwjgl.LwjglApplicationConfiguration;
import com.mdwheele.voodooboy.VoodooBoyGame;

public class Main {
	public static void main(String[] args) {
		LwjglApplicationConfiguration cfg = new LwjglApplicationConfiguration();
		cfg.title = "voodoo-boy";
		cfg.useGL20 = false;
		cfg.width = 640;
		cfg.height = 480;
		cfg.resizable = true;
			
		new LwjglApplication(new VoodooBoyGame(cfg.width, cfg.height), cfg);
	}
}
