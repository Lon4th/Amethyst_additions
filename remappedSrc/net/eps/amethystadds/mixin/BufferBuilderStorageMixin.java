package net.eps.amethystadds.mixin;

import it.unimi.dsi.fastutil.objects.Object2ObjectLinkedOpenHashMap;
import net.eps.amethystadds.client.ColoredGlintRenderLayer;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.client.render.BufferBuilder;
import net.minecraft.client.render.BufferBuilderStorage;
import net.minecraft.client.render.RenderLayer;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(BufferBuilderStorage.class)
@Environment(EnvType.CLIENT)
public class BufferBuilderStorageMixin {

    @Inject(method = "assignBufferBuilder", at = @At("HEAD"))
    private static void addGlintTypes(Object2ObjectLinkedOpenHashMap<RenderLayer, BufferBuilder> mapBuildersIn, RenderLayer renderTypeIn, CallbackInfo callbackInfo) {
        ColoredGlintRenderLayer.addGlintTypes(mapBuildersIn);
    }
}