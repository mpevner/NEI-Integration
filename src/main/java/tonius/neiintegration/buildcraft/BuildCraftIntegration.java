package tonius.neiintegration.buildcraft;

import tonius.neiintegration.IntegrationBase;
import tonius.neiintegration.Utils;
import codechicken.nei.api.API;
import cpw.mods.fml.common.Loader;

public class BuildCraftIntegration extends IntegrationBase {
    
    @Override
    public String getName() {
        return "BuildCraft";
    }
    
    @Override
    public boolean isValid() {
        return Loader.isModLoaded("BuildCraft|Core") && Utils.getClass("buildcraft.api.recipes.IFlexibleRecipeViewable") != null;
    }
    
    @Override
    public void loadConfig() {
        if (Loader.isModLoaded("BuildCraft|Factory")) {
            registerHandler(new RecipeHandlerRefinery());
        }
        if (Loader.isModLoaded("BuildCraft|Silicon")) {
            registerHandler(new RecipeHandlerAssemblyTable());
        }
    }
    
}
