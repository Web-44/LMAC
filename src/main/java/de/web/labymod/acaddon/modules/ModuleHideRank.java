package de.web.labymod.acaddon.modules;

import de.web.labymod.acaddon.Main;
import net.labymod.ingamegui.ModuleCategory;
import net.labymod.ingamegui.moduletypes.SimpleModule;
import net.labymod.settings.elements.ControlElement;
import net.labymod.settings.elements.ControlElement.IconData;
import net.labymod.utils.Material;

public class ModuleHideRank extends SimpleModule {
	
	@Override
	public String getDefaultValue() {
		return "?";
	}

	@Override
	public String getDisplayName() {
		return "HideRank";
	}

	@Override
	public String getDisplayValue() {
		return Main.hideRank;
	}

	@Override
	public String getDescription() {
		return "Shows your displayed rank on AntiCraft.de";
	}
	
	@Override
	public boolean isShown() {
		return Main.showHideRank;
	}

	@Override
	public IconData getIconData() {
		return new ControlElement.IconData(Material.COMPASS);
	}

	@Override
	public String getSettingName() {
		return "lmac_hiderank";
	}
	
	@Override
	public String getControlName() {
		return "HideRank";
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
