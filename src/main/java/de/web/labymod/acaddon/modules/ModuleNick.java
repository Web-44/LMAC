package de.web.labymod.acaddon.modules;

import de.web.labymod.acaddon.Main;
import net.labymod.ingamegui.ModuleCategory;
import net.labymod.ingamegui.moduletypes.SimpleModule;
import net.labymod.settings.elements.ControlElement.IconData;
import net.labymod.utils.Material;

public class ModuleNick extends SimpleModule {

	@Override
	public String getDefaultValue() {
		return "?";
	}

	@Override
	public String getDisplayName() {
		return "Nick";
	}

	@Override
	public String getDisplayValue() {
		return Main.nick;
	}

	@Override
	public String getDescription() {
		return "Shows your current Nick";
	}
	
	@Override
	public boolean isShown() {
		return Main.showNick;
	}

	@Override
	public IconData getIconData() {
		return new IconData(Material.NAME_TAG);
	}

	@Override
	public String getSettingName() {
		return "lmac_nick";
	}
	
	@Override
	public String getControlName() {
		return "Nick";
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
