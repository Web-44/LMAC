package de.web.labymod.acaddon.modules;

import de.web.labymod.acaddon.Main;
import net.labymod.ingamegui.ModuleCategory;
import net.labymod.ingamegui.moduletypes.SimpleModule;
import net.labymod.settings.elements.ControlElement.IconData;
import net.labymod.utils.Material;

public class ModuleCommunity extends SimpleModule {

	@Override
	public String getDefaultValue() {
		return "?";
	}

	@Override
	public String getDisplayName() {
		return "Song";
	}

	@Override
	public String getDisplayValue() {
		return Main.comSong;
	}

	@Override
	public String getDescription() {
		return "Shows the current playing Song on the Community stage";
	}
	
	@Override
	public boolean isShown() {
		return Main.showSong;
	}

	@Override
	public IconData getIconData() {
		return new IconData(Material.JUKEBOX);
	}

	@Override
	public String getSettingName() {
		return "lmac_comsong";
	}
	
	@Override
	public String getControlName() {
		return "Community Song";
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
