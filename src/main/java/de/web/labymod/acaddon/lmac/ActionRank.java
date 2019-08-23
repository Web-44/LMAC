package de.web.labymod.acaddon.lmac;

import com.google.gson.JsonObject;

import de.web.labymod.acaddon.Main;

public class ActionRank extends LmacAction {

	public ActionRank() {
		super("rank");
	}

	@Override
	public void execute(JsonObject data) {
		if (!data.has("display")) return;
		Main.rank = data.get("display").getAsString();
	}

}
