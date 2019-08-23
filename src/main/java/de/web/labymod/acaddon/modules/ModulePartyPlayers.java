package de.web.labymod.acaddon.modules;

import de.web.labymod.acaddon.Main;
import net.labymod.ingamegui.ModuleCategory;
import net.labymod.ingamegui.moduletypes.SimpleModule;
import net.labymod.settings.elements.ControlElement.IconData;
import net.labymod.utils.Material;

public class ModulePartyPlayers extends SimpleModule {

	@Override
	public String getDefaultValue() {
		return "?";
	}

	@Override
	public String getDisplayName() {
		return "PartyMembers";
	}

	@Override
	public String getDisplayValue() {
		return Main.partyPlayers;
	}

	@Override
	public String getDescription() {
		return "Shows the number of members/mods in your current party (leader inclusive)";
	}
	
	@Override
	public boolean isShown() {
		return Main.showParty;
	}

	@Override
	public IconData getIconData() {
		return new IconData(Material.RECORD_5);
	}

	@Override
	public String getSettingName() {
		return "lmac_party_count";
	}
	
	@Override
	public String getControlName() {
		return "Party Member Count";
	}

	@Override
	public int getSortingId() {
		return 0;
	}

	@Override
	public void loadSettings() {
		
	}
	
	@Override
	public ModuleCategory getCategory() {
		return Main.category;
	}

}
