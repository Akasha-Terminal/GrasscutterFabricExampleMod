package me.cael.gcexamplemod.mixin;

import emu.grasscutter.Grasscutter;
import me.cael.gcexamplemod.ExampleMod;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(Grasscutter.class)
public class ExampleMixin {

    @Inject(at = @At("HEAD"), method = "main")
    private static void init(CallbackInfo info) {
        ExampleMod.LOGGER.info("This line is printed by an example mod mixin!");
    }

}
