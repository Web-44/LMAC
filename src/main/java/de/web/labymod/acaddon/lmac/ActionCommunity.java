package de.web.labymod.acaddon.lmac;

import com.google.gson.JsonObject;

import de.web.labymod.acaddon.Main;

public class ActionCommunity extends LmacAction {

	public ActionCommunity() {
		super("community");
	}
	
	@Override
	public void execute(JsonObject data) {
		if (!data.has("song") || !data.has("enable")) return;
		Main.showSong = data.get("enable").getAsBoolean();
		Main.comSong = data.get("song").getAsString();
	}

}
