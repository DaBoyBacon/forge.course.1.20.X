package net.dabaconboy.coursemod.item;

import net.dabaconboy.coursemod.CourseMod;
import net.dabaconboy.coursemod.block.ModBlocks;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

public class ModCreativeModeTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, CourseMod.MOD_ID);

    public static final RegistryObject<CreativeModeTab> COURSE_TAB = CREATIVE_MODE_TABS.register("course_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.SWEATRITE
                    .get()))
                    .title(Component.translatable("creativetab.course_tab"))
                    .displayItems((displayParameters, output) -> {
                        output.accept(ModItems.SWEATRITE.get());
                        output.accept(ModBlocks.SWEATRITE_BLOCK.get());
                       // output.accept(ModBlocks.SWEATRITE_ORE.get());

            }).build());


    public static void register(IEventBus eventBus){
        CREATIVE_MODE_TABS.register(eventBus);
    }
}
