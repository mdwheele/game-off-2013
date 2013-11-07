package com.mdwheele.voodooboy;

import com.badlogic.gdx.Game;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.FPSLogger;
import com.badlogic.gdx.graphics.g2d.BitmapFont;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.mdwheele.voodooboy.screens.RedScreen;

public class VoodooBoyGame extends Game {

	static String LOG = "VoodooBoyGame";
	
	SpriteBatch batch;
	BitmapFont font;
	FPSLogger fpsLogger;
	
	public void create() {
		Gdx.app.log(VoodooBoyGame.LOG, "Creating game...");
		
		batch = new SpriteBatch();
		font = new BitmapFont();
		fpsLogger = new FPSLogger();
		
		setScreen(new RedScreen(this));
	}

	public void render() {
		super.render();
		
		fpsLogger.log();
	}
	
	public void dispose() {
		
	}
	
}
