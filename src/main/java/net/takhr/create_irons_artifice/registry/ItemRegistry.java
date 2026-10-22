package net.takhr.create_irons_artifice.registry;

import net.minecraft.world.item.Item;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;
import net.takhr.create_irons_artifice.Create_Arms_n_Artifice;

public class ItemRegistry {
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(Create_Arms_n_Artifice.MOD_ID);

    public static final DeferredItem<Item> SULFUR = ITEMS.register("sulfur",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> INCOMPLETE_CLOCKWORK_COMPONENTS = ITEMS.register("incomplete_clockwork_components",
            () -> new Item(new Item.Properties()));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}