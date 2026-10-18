package net.takhr.create_irons_artifice;

import com.mojang.logging.LogUtils;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.ModContainer;
import net.neoforged.fml.common.Mod;
import net.neoforged.fml.event.lifecycle.FMLCommonSetupEvent;
import net.neoforged.neoforge.common.NeoForge;
import net.neoforged.neoforge.event.server.ServerStartingEvent;
import net.takhr.create_irons_artifice.registry.ItemRegistry;
import org.slf4j.Logger;

@Mod(Create_Irons_Artifice.MOD_ID)
public class Create_Irons_Artifice {
    public static final String MOD_ID = "create_irons_artifice";

    public static final Logger LOGGER = LogUtils.getLogger();
    public Create_Irons_Artifice(IEventBus modEventBus, ModContainer modContainer) {
        NeoForge.EVENT_BUS.register(this);

        modEventBus.addListener(this::commonSetup);

        ItemRegistry.register(modEventBus);

    }

    private void commonSetup(FMLCommonSetupEvent event) {

    }

    @SubscribeEvent
    public void onServerStarting(ServerStartingEvent event) {
    }
}
