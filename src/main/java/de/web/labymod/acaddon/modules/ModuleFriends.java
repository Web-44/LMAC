package de.web.labymod.acaddon.modules;

import de.web.labymod.acaddon.Main;
import net.labymod.ingamegui.ModuleCategory;
import net.labymod.ingamegui.moduletypes.SimpleModule;
import net.labymod.settings.elements.ControlElement.IconData;
import net.labymod.utils.Material;

public class ModuleFriends extends SimpleModule {

	@Override
	public String getDefaultValue() {
		return "?";
	}

	@Override
	public String getDisplayName() {
		return "Friends";
	}

	@Override
	public String getDisplayValue() {
		return Main.friends;
	}

	@Override
	public String getDescription() {
		return "Shows the number of online friends";
	}
	
	@Override
	public boolean isShown() {
		return Main.showFriends;
	}

	@Override
	public IconData getIconData() {
		return new IconData(Material.RED_ROSE);
	}

	@Override
	public String getSettingName() {
		return "lmac_friends";
	}
	
	@Override
	public String getControlName() {
		return "Friends";
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
