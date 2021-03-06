package com.mdwheele.voodooboy;

import com.badlogic.gdx.*;
import com.badlogic.gdx.graphics.FPSLogger;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.mdwheele.voodooboy.screens.GameScreen;
import com.mdwheele.voodooboy.screens.debug.DebugEventSoundScreen;

public class VoodooBoyGame extends Game {
	
	/* Window dimensions */
	public int width;
	public int height;
	
	/* Shared SpriteBatch */
	private SpriteBatch batch;
	
	/* FPS Debug Logger */
	FPSLogger fpsLogger;
	
	public VoodooBoyGame(int width, int height) {
		this.width = width;
		this.height = height;
	}
	
	public void create() {		
		batch = new SpriteBatch();
		
		setScreen(new DebugEventSoundScreen(this));
	}

	public void render() {
		super.render();
	}
	
	public void dispose() {
		batch.dispose();
	}	
}
