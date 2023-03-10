package net.eps.amethystadds;

import net.eps.amethystadds.fluids.ModFluids;
import net.eps.amethystadds.particle.ModParticles;
import net.eps.amethystadds.particle.custom.CitrineParticle;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.client.particle.v1.ParticleFactoryRegistry;
import net.fabricmc.fabric.api.client.render.fluid.v1.FluidRenderHandlerRegistry;
import net.fabricmc.fabric.api.client.render.fluid.v1.SimpleFluidRenderHandler;
import net.fabricmc.fabric.api.event.client.ClientSpriteRegistryCallback;
import net.minecraft.client.particle.AshParticle;
import net.minecraft.client.particle.GlowParticle;
import net.minecraft.screen.PlayerScreenHandler;
import net.minecraft.util.Identifier;

public class AmethystAddsClient implements ClientModInitializer {

    @Override
    public void onInitializeClient() {
        ParticleFactoryRegistry.getInstance().register(ModParticles.AMETHYST_BLOOM, CitrineParticle.Factory::new);
        ParticleFactoryRegistry.getInstance().register(ModParticles.GREEN_AMETHYST_BLOOM, CitrineParticle.Factory::new);
        ParticleFactoryRegistry.getInstance().register(ModParticles.BLACK_AMETHYST_BLOOM, CitrineParticle.Factory::new);
        ParticleFactoryRegistry.getInstance().register(ModParticles.BLUE_AMETHYST_BLOOM, CitrineParticle.Factory::new);
        ParticleFactoryRegistry.getInstance().register(ModParticles.BROWN_AMETHYST_BLOOM, CitrineParticle.Factory::new);
        ParticleFactoryRegistry.getInstance().register(ModParticles.CYAN_AMETHYST_BLOOM, CitrineParticle.Factory::new);
        ParticleFactoryRegistry.getInstance().register(ModParticles.GRAY_AMETHYST_BLOOM, CitrineParticle.Factory::new);
        ParticleFactoryRegistry.getInstance().register(ModParticles.LIGHT_BLUE_AMETHYST_BLOOM, CitrineParticle.Factory::new);
        ParticleFactoryRegistry.getInstance().register(ModParticles.LIGHT_GRAY_AMETHYST_BLOOM, CitrineParticle.Factory::new);
        ParticleFactoryRegistry.getInstance().register(ModParticles.LIME_AMETHYST_BLOOM, CitrineParticle.Factory::new);
        ParticleFactoryRegistry.getInstance().register(ModParticles.MAGENTA_AMETHYST_BLOOM, CitrineParticle.Factory::new);
        ParticleFactoryRegistry.getInstance().register(ModParticles.ORANGE_AMETHYST_BLOOM, CitrineParticle.Factory::new);
        ParticleFactoryRegistry.getInstance().register(ModParticles.PINK_AMETHYST_BLOOM, CitrineParticle.Factory::new);
        ParticleFactoryRegistry.getInstance().register(ModParticles.RED_AMETHYST_BLOOM, CitrineParticle.Factory::new);
        ParticleFactoryRegistry.getInstance().register(ModParticles.WHITE_AMETHYST_BLOOM, CitrineParticle.Factory::new);
        ParticleFactoryRegistry.getInstance().register(ModParticles.YELLOW_AMETHYST_BLOOM, CitrineParticle.Factory::new);

        FluidRenderHandlerRegistry.INSTANCE.register(ModFluids.RED_WATER_STILL,
                new SimpleFluidRenderHandler(SimpleFluidRenderHandler.WATER_STILL,
                        SimpleFluidRenderHandler.WATER_FLOWING,
                        SimpleFluidRenderHandler.WATER_OVERLAY, 11546150));
        FluidRenderHandlerRegistry.INSTANCE.register(ModFluids.RED_WATER_FLOWING,
                new SimpleFluidRenderHandler(SimpleFluidRenderHandler.WATER_STILL,
                        SimpleFluidRenderHandler.WATER_FLOWING,
                        SimpleFluidRenderHandler.WATER_OVERLAY, 11546150));



    }
}
