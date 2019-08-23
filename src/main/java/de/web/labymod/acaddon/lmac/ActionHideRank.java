package de.web.labymod.acaddon.lmac;

import com.google.gson.JsonObject;

import de.web.labymod.acaddon.Main;

public class ActionHideRank extends LmacAction {

	public ActionHideRank() {
		super("hiderank");
	}
	
	@Override
	public void execute(JsonObject data) {
		if (!data.has("display") || !data.has("enable")) return;
		Main.showHideRank = data.get("enable").getAsBoolean();
		Main.hideRank = data.get("display").getAsString();
	}

}
