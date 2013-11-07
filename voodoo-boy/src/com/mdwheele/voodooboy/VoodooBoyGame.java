package com.mdwheele.voodooboy;

import com.badlogic.gdx.Game;
import com.badlogic.gdx.graphics.g2d.BitmapFont;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.mdwheele.voodooboy.screens.RedScreen;

public class VoodooBoyGame extends Game {

	SpriteBatch batch;
	BitmapFont font;
	
	public void create() {
		batch = new SpriteBatch();
		font = new BitmapFont();
		
		setScreen(new RedScreen(this));
	}

	public void render() {
		super.render();
	}
	
	public void dispose() {
		
	}
	
}
