package de.web.labymod.acaddon;

import java.util.List;

import de.web.labymod.acaddon.lmac.Parser;
import de.web.labymod.acaddon.modules.*;
import net.labymod.api.LabyModAddon;
import net.labymod.ingamegui.ModuleCategory;
import net.labymod.ingamegui.ModuleCategoryRegistry;
import net.labymod.settings.elements.SettingsElement;

public class Main extends LabyModAddon {
	
	public static Main instance;
	public static boolean addonenabled = false;
	public static boolean enabled = false;
	public static ModuleCategory category = null;
	public static final int version = 2;
	
	public static String rank = "?", game = "?", nick = "?", friends = "?", partyOwner = "?",
			partyPlayers = "?", comSong = "?", hideRank = "?";
	public static boolean showRank = false, showGame = false, showNick = false, showFriends = false, showParty = false,
			showSong = false, showHideRank = false;
	
	@Override
	public void onEnable() {
		this.instance = this;
		this.addonenabled = true;
		category = new ACCategory();
		Parser.init();
		ModuleCategoryRegistry.loadCategory(this.category);
		getApi().registerServerSupport(this, new ServerSupportClass());
		getApi().registerModule(new ModuleCommunity());
		getApi().registerModule(new ModuleFriends());
		getApi().registerModule(new ModuleGame());
		getApi().registerModule(new ModuleHideRank());
		getApi().registerModule(new ModuleNick());
		getApi().registerModule(new ModulePartyOwner());
		getApi().registerModule(new ModulePartyPlayers());
		getApi().registerModule(new ModuleRank());
		new Listener();
		System.out.println("Enabled AntiCraft Addon");
	}
	
	@Override
	public void onDisable() {
		this.enabled = false;
		this.addonenabled = false;
		System.out.println("Disabled AntiCraft Addon");
	}
	
	@Override
	public void loadConfig() {
		saveConfig();
	}
	
	@Override
	protected void fillSettings(List<SettingsElement> list) {
		
	}
	
}
