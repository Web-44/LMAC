package de.web.labymod.acaddon;

import java.util.Arrays;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;

import de.web.labymod.acaddon.lmac.Parser;
import net.labymod.api.events.ServerMessageEvent;
import net.labymod.utils.Consumer;
import net.labymod.utils.ServerData;

public class Listener {
	
	public Listener() {
		Main.instance.getApi().getEventManager().registerOnQuit(new Consumer<ServerData>() {
			
			@Override
			public void accept(ServerData data) {
				Main.enabled = false;
				Main.game = "?";
				Main.rank = "?";
				Main.comSong = "?";
				Main.friends = "?";
				Main.nick = "?";
				Main.partyOwner = "?";
				Main.partyPlayers = "?";
				Main.hideRank = "?";
				Main.showFriends = false;
				Main.showGame = false;
				Main.showHideRank = false;
				Main.showNick = false;
				Main.showParty = false;
				Main.showRank = false;
				Main.showSong = false;
			}
		});
		
		Main.instance.getApi().getEventManager().register(new ServerMessageEvent() {
			
			@Override
			public void onServerMessage(String ch, JsonElement json) {
				if (Main.enabled && ch.equals("lmac") && json.isJsonObject()) {
					Parser.onMessage(json.getAsJsonObject());
				}
			}
		});
	}
}
