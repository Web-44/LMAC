package de.web.labymod.acaddon.lmac;

import com.google.gson.JsonObject;

import de.web.labymod.acaddon.Main;

public class ActionFriends extends LmacAction {

	public ActionFriends() {
		super("friendcount");
	}
	
	@Override
	public void execute(JsonObject data) {
		if (!data.has("count")) return;
		Main.friends = data.get("count").getAsString();
	}

}
