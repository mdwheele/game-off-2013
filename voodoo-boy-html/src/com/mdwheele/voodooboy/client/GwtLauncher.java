package com.mdwheele.voodooboy.client;

import com.mdwheele.voodooboy.VoodooBoyGame;
import com.badlogic.gdx.ApplicationListener;
import com.badlogic.gdx.backends.gwt.GwtApplication;
import com.badlogic.gdx.backends.gwt.GwtApplicationConfiguration;

public class GwtLauncher extends GwtApplication {
	public int width;
	public int height;
	
	@Override
	public GwtApplicationConfiguration getConfig () {
		GwtApplicationConfiguration cfg = new GwtApplicationConfiguration(width = 480, height = 320);
		return cfg;
	}

	@Override
	public ApplicationListener getApplicationListener () {
		return new VoodooBoyGame(this.width, this.height);
	}
}