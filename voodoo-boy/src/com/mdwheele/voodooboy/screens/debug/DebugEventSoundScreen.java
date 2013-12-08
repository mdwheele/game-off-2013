package com.mdwheele.voodooboy.screens.debug;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.InputProcessor;
import com.mdwheele.voodooboy.VoodooBoyGame;
import com.mdwheele.voodooboy.events.Event;
import com.mdwheele.voodooboy.events.EventListener;
import com.mdwheele.voodooboy.events.EventManager;
import com.mdwheele.voodooboy.screens.AbstractScreen;
import com.mdwheele.voodooboy.services.SoundManager;
import com.mdwheele.voodooboy.services.SoundManager.GameSound;

public class DebugEventSoundScreen extends AbstractScreen implements EventListener, InputProcessor {
	
	SoundManager soundManager;
	EventManager eventManager;
	
	public DebugEventSoundScreen(final VoodooBoyGame game) {
		super(game);
		
		/**
		 * Instantiate sound and event services.
		 */
		soundManager = new SoundManager();
		eventManager = new EventManager();
		
		/**
		 * Subscribe this class to the event manager.
		 */
		eventManager.subscribe(Event.class, this);
		
		/**
		 * Set this class as the input processor for libgdx.
		 */
		Gdx.input.setInputProcessor(this);
	}
	
	@Override
	public void render(float delta) {
		super.render(delta);
		
		/**
		 * Tell event manager to process current event pool.
		 */
		eventManager.process();
	}

	@Override
	public void resize(int width, int height) {
		super.resize(width, height);
		camera.setToOrtho(false, 20, 16);
	}
	
	public void handleEvent(Event event) {
		/**
		 * Play the sound!
		 */
		soundManager.play(GameSound.ARROW_SHOT);
	}

	@Override
	public void show() {
	}

	@Override
	public void hide() {
	}

	@Override
	public void pause() {
	}

	@Override
	public void resume() {	
	}

	@Override
	public void dispose() {
	}

	@Override
	public boolean keyDown(int keycode) {
		/**
		 * Post generic event on keypress.
		 */
		eventManager.post(new Event());
		return true;
	}

	@Override
	public boolean keyUp(int keycode) {
		return true;
	}

	@Override
	public boolean keyTyped(char character) {
		return false;
	}

	@Override
	public boolean touchDown(int screenX, int screenY, int pointer, int button) {
		return false;
	}

	@Override
	public boolean touchUp(int screenX, int screenY, int pointer, int button) {
		return false;
	}

	@Override
	public boolean touchDragged(int screenX, int screenY, int pointer) {
		return false;
	}

	@Override
	public boolean mouseMoved(int screenX, int screenY) {
		return false;
	}

	@Override
	public boolean scrolled(int amount) {
		return false;
	}
}
