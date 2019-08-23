package de.web.labymod.acaddon.modules;

import de.web.labymod.acaddon.Main;
import net.labymod.ingamegui.ModuleCategory;
import net.labymod.ingamegui.moduletypes.SimpleModule;
import net.labymod.settings.elements.ControlElement;
import net.labymod.settings.elements.ControlElement.IconData;
import net.labymod.utils.Material;

public class ModuleGame extends SimpleModule {

	@Override
	public String getDefaultValue() {
		return "?";
	}

	@Override
	public String getDisplayName() {
		return "Game";
	}

	@Override
	public String getDisplayValue() {
		return Main.game;
	}

	@Override
	public String getDescription() {
		return "Shows the current Gamemode on AntiCraft.de";
	}
	
	@Override
	public boolean isShown() {
		return Main.showGame;
	}

	@Override
	public IconData getIconData() {
		return new ControlElement.IconData(Material.COMPASS);
	}

	@Override
	public String getSettingName() {
		return "lmac_game";
	}
	
	@Override
	public String getControlName() {
		return "Current Game";
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
