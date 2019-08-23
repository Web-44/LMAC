package de.web.labymod.acaddon.lmac;

import com.google.gson.JsonObject;

import de.web.labymod.acaddon.Main;

public class ActionGame extends LmacAction {

	public ActionGame() {
		super("gameserver");
	}

	@Override
	public void execute(JsonObject data) {
		if (!data.has("group")) return;
		Main.game = data.get("group").getAsString();
	}

}
