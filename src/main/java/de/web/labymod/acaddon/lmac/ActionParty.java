package de.web.labymod.acaddon.lmac;

import com.google.gson.JsonObject;

import de.web.labymod.acaddon.Main;

public class ActionParty extends LmacAction {

	public ActionParty() {
		super("party");
	}
	
	@Override
	public void execute(JsonObject data) {
		if (!data.has("count") || !data.has("owner") || !data.has("enable")) return;
		Main.showParty = data.get("enable").getAsBoolean();
		Main.partyPlayers = data.get("count").getAsString();
		Main.partyOwner = data.get("owner").getAsString();
	}

}
