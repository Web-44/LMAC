package de.web.labymod.acaddon.lmac;

import com.google.gson.JsonObject;

public abstract class LmacAction {
	
	protected String type;
	
	public LmacAction(String type) {
		this.type = type;
	}
	
	public abstract void execute(JsonObject data);
	
}
