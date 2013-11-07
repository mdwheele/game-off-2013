package com.mdwheele.voodooboy.screens;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Input.Keys;
import com.badlogic.gdx.Screen;
import com.badlogic.gdx.graphics.GL10;
import com.badlogic.gdx.graphics.OrthographicCamera;
import com.mdwheele.voodooboy.VoodooBoyGame;

public class RedScreen implements Screen {

	final VoodooBoyGame game;
	
	OrthographicCamera camera;
	
	public RedScreen(final VoodooBoyGame game) {
		this.game = game;

		camera = new OrthographicCamera();
		camera.setToOrtho(false, 800, 480);
	}
	
	@Override
	public void render(float delta) {
		Gdx.gl.glClearColor(1.0f, 0, 0, 1);
		Gdx.gl10.glClear(GL10.GL_COLOR_BUFFER_BIT);
		
		if(Gdx.input.isKeyPressed(Keys.LEFT) || Gdx.input.isKeyPressed(Keys.RIGHT)) {
			game.setScreen(new BlueScreen(game));
		}
	}

	@Override
	public void resize(int width, int height) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void show() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void hide() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void pause() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void resume() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void dispose() {
		// TODO Auto-generated method stub
		
	}

}
