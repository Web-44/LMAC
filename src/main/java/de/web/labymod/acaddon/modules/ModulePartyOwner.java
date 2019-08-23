package de.web.labymod.acaddon.modules;

import de.web.labymod.acaddon.Main;
import net.labymod.ingamegui.ModuleCategory;
import net.labymod.ingamegui.moduletypes.SimpleModule;
import net.labymod.settings.elements.ControlElement.IconData;
import net.labymod.utils.Material;

public class ModulePartyOwner extends SimpleModule {

	@Override
	public String getDefaultValue() {
		return "?";
	}

	@Override
	public String getDisplayName() {
		return "PartyLeader";
	}

	@Override
	public String getDisplayValue() {
		return Main.partyOwner;
	}

	@Override
	public String getDescription() {
		return "Shows the Leader of your current party";
	}
	
	@Override
	public boolean isShown() {
		return Main.showParty;
	}

	@Override
	public IconData getIconData() {
		return new IconData(Material.RECORD_4);
	}
	
	@Override
	public String getSettingName() {
		return "lmac_party_owner";
	}

	@Override
	public String getControlName() {
		return "Party Leader";
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
