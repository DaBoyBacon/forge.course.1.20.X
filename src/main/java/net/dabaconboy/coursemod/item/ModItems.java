package net.dabaconboy.coursemod.item;

import net.dabaconboy.coursemod.CourseMod;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, CourseMod.MOD_ID);

    public static final RegistryObject<Item> SWEATRITE = ITEMS.register("sweatrite",
            () -> new Item(new Item.Properties()));


    public static final RegistryObject<Item> RAW_SWEATRITE = ITEMS.register("raw_sweatrite",
            () -> new Item(new Item.Properties()));












    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}