package de.web.labymod.acaddon.lmac;

import com.google.gson.JsonObject;

import de.web.labymod.acaddon.Main;

public class ActionNick extends LmacAction {

	public ActionNick() {
		super("nickname");
	}
	
	@Override
	public void execute(JsonObject data) {
		if (!data.has("nickname") || !data.has("enable")) return;
		Main.showNick = data.get("enable").getAsBoolean();
		Main.nick = data.get("nickname").getAsString();
	}

}
