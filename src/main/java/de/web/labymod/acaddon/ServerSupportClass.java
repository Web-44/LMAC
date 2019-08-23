package de.web.labymod.acaddon;

import java.util.List;

import com.google.gson.JsonObject;

import net.labymod.api.events.TabListEvent.Type;
import net.labymod.servermanager.ChatDisplayAction;
import net.labymod.servermanager.Server;
import net.labymod.settings.elements.SettingsElement;
import net.minecraft.client.multiplayer.ServerData;
import net.minecraft.network.PacketBuffer;

public class ServerSupportClass extends Server {

	public ServerSupportClass() {
		super("AntiCraft", new String[] {"anticraft.de", "mc.anticraft.de", "78.31.64.89"});
	}
	
	@Override
	public void fillSubSettings(List<SettingsElement> arg0) {
		
	}

	@Override
	public ChatDisplayAction handleChatMessage(String arg0, String arg1) throws Exception {
		return ChatDisplayAction.NORMAL;
	}

	@Override
	public void handlePluginMessage(String arg0, PacketBuffer arg1) throws Exception {
		
	}

	@Override
	public void handleTabInfoMessage(Type arg0, String arg1, String arg2) throws Exception {
		
	}

	@Override
	public void onJoin(ServerData data) {
		System.out.println("Detected supported Server: AntiCraft");
		Main.enabled = true;
		
		Main.showFriends = true;
		Main.showGame = true;
		Main.showRank = true;
		
		JsonObject obj = new JsonObject();
		obj.addProperty("Version", Main.version);
		Main.instance.getApi().sendJsonMessageToServer("lmac", obj);
	}
	
}
