package de.web.labymod.acaddon.modules;

import de.web.labymod.acaddon.Main;
import net.labymod.ingamegui.ModuleCategory;
import net.labymod.ingamegui.moduletypes.SimpleModule;
import net.labymod.settings.elements.ControlElement;
import net.labymod.settings.elements.ControlElement.IconData;
import net.labymod.utils.Material;

public class ModuleRank extends SimpleModule {

	@Override
	public String getDefaultValue() {
		return "?";
	}

	@Override
	public String getDisplayName() {
		return "Rank";
	}

	@Override
	public String getDisplayValue() {
		return Main.rank;
	}

	@Override
	public String getDescription() {
		return "Shows your rank on AntiCraft.de";
	}
	
	@Override
	public boolean isShown() {
		return Main.showRank;
	}

	@Override
	public IconData getIconData() {
		return new ControlElement.IconData(Material.DIAMOND);
	}

	@Override
	public String getSettingName() {
		return "lmac_rank";
	}
	
	@Override
	public String getControlName() {
		return "Rank";
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
