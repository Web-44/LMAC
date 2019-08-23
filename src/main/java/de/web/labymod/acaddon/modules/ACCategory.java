package de.web.labymod.acaddon.modules;

import de.web.labymod.acaddon.Main;
import net.labymod.ingamegui.ModuleCategory;
import net.labymod.settings.elements.CategoryModuleEditorElement;
import net.labymod.settings.elements.ControlElement;
import net.labymod.settings.elements.ControlElement.IconData;
import net.labymod.utils.Material;

public class ACCategory extends ModuleCategory {

	public ACCategory() {
		super("AntiCraft.de", Main.addonenabled, new ControlElement.IconData(Material.GRASS));
	}

}
