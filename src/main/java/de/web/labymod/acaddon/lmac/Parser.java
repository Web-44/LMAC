package de.web.labymod.acaddon.lmac;

import java.util.HashMap;
import java.util.Map;

import com.google.gson.JsonObject;

import de.web.labymod.acaddon.Main;

public class Parser {
	
	private static Map<String, LmacAction> actions = new HashMap<String, LmacAction>();
	
	public static void init() {
		register(new ActionCommunity());
		register(new ActionFriends());
		register(new ActionGame());
		register(new ActionHideRank());
		register(new ActionNick());
		register(new ActionParty());
		register(new ActionRank());
	}
	
	private static void register(LmacAction action) {
		actions.put(action.type, action);
	}
	
	public static void onMessage(JsonObject obj) {
		if (!obj.has("type") || !obj.has("data")) return;
		String type = obj.get("type").getAsString();
		if (actions.containsKey(type)) {
			if (obj.get("data").isJsonObject()) {
				actions.get(type).execute(obj.get("data").getAsJsonObject());
			} else {
				Main.instance.getApi().displayMessageInChat("[LabyAC] Detected an invalid built message: " + type);
				Main.instance.getApi().displayMessageInChat("[LabyAC] Please report this bug on ts.AntiCraft.de");
			}
		} else {
			Main.instance.getApi().displayMessageInChat("[LabyAC] Detected an invalid message type: " + type);
			Main.instance.getApi().displayMessageInChat("[LabyAC] Please report this bug on ts.AntiCraft.de");
		}
	}
	
}
