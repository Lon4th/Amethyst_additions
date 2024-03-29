package net.eps.amethystadds.block;

import net.eps.amethystadds.AmethystAdditions;
import net.eps.amethystadds.block.custom.*;
import net.eps.amethystadds.block.custom.AmethystBlock;
import net.eps.amethystadds.particle.ModParticles;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.block.*;
import net.minecraft.entity.EntityType;
import net.minecraft.item.*;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.BlockView;

import static net.minecraft.block.Blocks.*;

public class ModBlocks {

    /* New Blocks */

    public static final Block WHITE_AMETHYST_BLOCK = registerBlockWithItem("white_amethyst_block", new AmethystBlock(AbstractBlock.Settings.copy(AMETHYST_BLOCK).strength(6f).requiresTool().strength(3.0f, 3.0f).luminance(state -> state.get(AmethystBlock.LIT) ? 5 : 0).nonOpaque()));
    public static final Block ORANGE_AMETHYST_BLOCK = registerBlockWithItem("orange_amethyst_block", new AmethystBlock(AbstractBlock.Settings.copy(AMETHYST_BLOCK).strength(6f).requiresTool().strength(3.0f, 3.0f).luminance(state -> state.get(AmethystBlock.LIT) ? 5 : 0).nonOpaque()));
    public static final Block MAGENTA_AMETHYST_BLOCK = registerBlockWithItem("magenta_amethyst_block", new AmethystBlock(AbstractBlock.Settings.copy(AMETHYST_BLOCK).strength(6f).requiresTool().strength(3.0f, 3.0f).luminance(state -> state.get(AmethystBlock.LIT) ? 5 : 0).nonOpaque()));
    public static final Block LIGHT_BLUE_AMETHYST_BLOCK = registerBlockWithItem("light_blue_amethyst_block", new AmethystBlock(AbstractBlock.Settings.copy(AMETHYST_BLOCK).strength(6f).requiresTool().strength(3.0f, 3.0f).luminance(state -> state.get(AmethystBlock.LIT) ? 5 : 0).nonOpaque()));
    public static final Block YELLOW_AMETHYST_BLOCK = registerBlockWithItem("yellow_amethyst_block", new AmethystBlock(AbstractBlock.Settings.copy(AMETHYST_BLOCK).requiresTool().strength(3.0f, 3.0f).luminance(state -> state.get(AmethystBlock.LIT) ? 5 : 0).nonOpaque()));
    public static final Block LIME_AMETHYST_BLOCK = registerBlockWithItem("lime_amethyst_block", new AmethystBlock(AbstractBlock.Settings.copy(AMETHYST_BLOCK).strength(6f).requiresTool().strength(3.0f, 3.0f).luminance(state -> state.get(AmethystBlock.LIT) ? 5 : 0).nonOpaque()));
    public static final Block PINK_AMETHYST_BLOCK = registerBlockWithItem("pink_amethyst_block", new AmethystBlock(AbstractBlock.Settings.copy(AMETHYST_BLOCK).strength(6f).requiresTool().strength(3.0f, 3.0f).luminance(state -> state.get(AmethystBlock.LIT) ? 5 : 0).nonOpaque()));
    public static final Block GRAY_AMETHYST_BLOCK = registerBlockWithItem("gray_amethyst_block", new AmethystBlock(AbstractBlock.Settings.copy(AMETHYST_BLOCK).strength(6f).requiresTool().strength(3.0f, 3.0f).luminance(state -> state.get(AmethystBlock.LIT) ? 5 : 0).nonOpaque()));
    public static final Block LIGHT_GRAY_AMETHYST_BLOCK = registerBlockWithItem("light_gray_amethyst_block", new AmethystBlock(AbstractBlock.Settings.copy(AMETHYST_BLOCK).strength(6f).requiresTool().strength(3.0f, 3.0f).luminance(state -> state.get(AmethystBlock.LIT) ? 5 : 0).nonOpaque()));
    public static final Block CYAN_AMETHYST_BLOCK = registerBlockWithItem("cyan_amethyst_block", new AmethystBlock(AbstractBlock.Settings.copy(AMETHYST_BLOCK).strength(6f).requiresTool().strength(3.0f, 3.0f).luminance(state -> state.get(AmethystBlock.LIT) ? 5 : 0).nonOpaque()));
    public static final Block PURPLE_AMETHYST_BLOCK = registerBlockWithItem("purple_amethyst_block", new AmethystBlock(AbstractBlock.Settings.copy(AMETHYST_BLOCK).strength(6f).requiresTool().strength(3.0f, 3.0f).luminance(state -> state.get(AmethystBlock.LIT) ? 5 : 0).nonOpaque()));
    public static final Block BLUE_AMETHYST_BLOCK = registerBlockWithItem("blue_amethyst_block", new AmethystBlock(AbstractBlock.Settings.copy(AMETHYST_BLOCK).strength(6f).requiresTool().strength(3.0f, 3.0f).luminance(state -> state.get(AmethystBlock.LIT) ? 5 : 0).nonOpaque()));
    public static final Block BROWN_AMETHYST_BLOCK = registerBlockWithItem("brown_amethyst_block", new AmethystBlock(AbstractBlock.Settings.copy(AMETHYST_BLOCK).strength(6f).requiresTool().strength(3.0f, 3.0f).luminance(state -> state.get(AmethystBlock.LIT) ? 5 : 0).nonOpaque()));
    public static final Block GREEN_AMETHYST_BLOCK = registerBlockWithItem("green_amethyst_block", new AmethystBlock(AbstractBlock.Settings.copy(AMETHYST_BLOCK).strength(6f).requiresTool().strength(3.0f, 3.0f).luminance(state -> state.get(AmethystBlock.LIT) ? 5 : 0).nonOpaque()));
    public static final Block RED_AMETHYST_BLOCK = registerBlockWithItem("red_amethyst_block", new AmethystBlock(AbstractBlock.Settings.copy(AMETHYST_BLOCK).strength(6f).requiresTool().strength(3.0f, 3.0f).luminance(state -> state.get(AmethystBlock.LIT) ? 5 : 0).nonOpaque()));
    public static final Block BLACK_AMETHYST_BLOCK = registerBlockWithItem("black_amethyst_block", new AmethystBlock(AbstractBlock.Settings.copy(AMETHYST_BLOCK).strength(6f).requiresTool().strength(3.0f, 3.0f).luminance(state -> state.get(AmethystBlock.LIT) ? 5 : 0).nonOpaque()));

    public static final Block PURPLE_AMETHYST_LAMP = registerBlockWithItem("purple_amethyst_lamp", new AmethystLampBlock(AbstractBlock.Settings.copy(Blocks.AMETHYST_CLUSTER).nonOpaque().ticksRandomly().sounds(BlockSoundGroup.AMETHYST_CLUSTER).strength(1.5f).luminance((state) -> {return 14;}), ModParticles.AMETHYST_BLOOM));
    public static final Block RED_AMETHYST_LAMP = registerBlockWithItem("red_amethyst_lamp", new AmethystLampBlock(AbstractBlock.Settings.copy(Blocks.AMETHYST_CLUSTER).nonOpaque().ticksRandomly().sounds(BlockSoundGroup.AMETHYST_CLUSTER).strength(1.5f).luminance((state) -> {return 14;}), ModParticles.RED_AMETHYST_BLOOM));
    public static final Block ORANGE_AMETHYST_LAMP = registerBlockWithItem("orange_amethyst_lamp", new AmethystLampBlock(AbstractBlock.Settings.copy(Blocks.AMETHYST_CLUSTER).nonOpaque().ticksRandomly().sounds(BlockSoundGroup.AMETHYST_CLUSTER).strength(1.5f).luminance((state) -> {return 14;}), ModParticles.ORANGE_AMETHYST_BLOOM));
    public static final Block YELLOW_AMETHYST_LAMP = registerBlockWithItem("yellow_amethyst_lamp", new AmethystLampBlock(AbstractBlock.Settings.copy(Blocks.AMETHYST_CLUSTER).nonOpaque().ticksRandomly().sounds(BlockSoundGroup.AMETHYST_CLUSTER).strength(1.5f).luminance((state) -> {return 14;}), ModParticles.YELLOW_AMETHYST_BLOOM));
    public static final Block BROWN_AMETHYST_LAMP = registerBlockWithItem("brown_amethyst_lamp", new AmethystLampBlock(AbstractBlock.Settings.copy(Blocks.AMETHYST_CLUSTER).nonOpaque().ticksRandomly().sounds(BlockSoundGroup.AMETHYST_CLUSTER).strength(1.5f).luminance((state) -> {return 14;}), ModParticles.BROWN_AMETHYST_BLOOM));
    public static final Block BLACK_AMETHYST_LAMP = registerBlockWithItem("black_amethyst_lamp", new AmethystLampBlock(AbstractBlock.Settings.copy(Blocks.AMETHYST_CLUSTER).nonOpaque().ticksRandomly().sounds(BlockSoundGroup.AMETHYST_CLUSTER).strength(1.5f).luminance((state) -> {return 14;}), ModParticles.BLACK_AMETHYST_BLOOM));
    public static final Block GRAY_AMETHYST_LAMP = registerBlockWithItem("gray_amethyst_lamp", new AmethystLampBlock(AbstractBlock.Settings.copy(Blocks.AMETHYST_CLUSTER).nonOpaque().ticksRandomly().sounds(BlockSoundGroup.AMETHYST_CLUSTER).strength(1.5f).luminance((state) -> {return 14;}), ModParticles.GRAY_AMETHYST_BLOOM));
    public static final Block LIGHT_GRAY_AMETHYST_LAMP = registerBlockWithItem("light_gray_amethyst_lamp", new AmethystLampBlock(AbstractBlock.Settings.copy(Blocks.AMETHYST_CLUSTER).nonOpaque().ticksRandomly().sounds(BlockSoundGroup.AMETHYST_CLUSTER).strength(1.5f).luminance((state) -> {return 14;}), ModParticles.LIGHT_GRAY_AMETHYST_BLOOM));
    public static final Block WHITE_AMETHYST_LAMP = registerBlockWithItem("white_amethyst_lamp", new AmethystLampBlock(AbstractBlock.Settings.copy(Blocks.AMETHYST_CLUSTER).nonOpaque().ticksRandomly().sounds(BlockSoundGroup.AMETHYST_CLUSTER).strength(1.5f).luminance((state) -> {return 14;}), ModParticles.WHITE_AMETHYST_BLOOM));
    public static final Block MAGENTA_AMETHYST_LAMP = registerBlockWithItem("magenta_amethyst_lamp", new AmethystLampBlock(AbstractBlock.Settings.copy(Blocks.AMETHYST_CLUSTER).nonOpaque().ticksRandomly().sounds(BlockSoundGroup.AMETHYST_CLUSTER).strength(1.5f).luminance((state) -> {return 14;}), ModParticles.MAGENTA_AMETHYST_BLOOM));
    public static final Block PINK_AMETHYST_LAMP = registerBlockWithItem("pink_amethyst_lamp", new AmethystLampBlock(AbstractBlock.Settings.copy(Blocks.AMETHYST_CLUSTER).nonOpaque().ticksRandomly().sounds(BlockSoundGroup.AMETHYST_CLUSTER).strength(1.5f).luminance((state) -> {return 14;}), ModParticles.PINK_AMETHYST_BLOOM));
    public static final Block BLUE_AMETHYST_LAMP = registerBlockWithItem("blue_amethyst_lamp", new AmethystLampBlock(AbstractBlock.Settings.copy(Blocks.AMETHYST_CLUSTER).nonOpaque().ticksRandomly().sounds(BlockSoundGroup.AMETHYST_CLUSTER).strength(1.5f).luminance((state) -> {return 14;}), ModParticles.BLUE_AMETHYST_BLOOM));
    public static final Block LIGHT_BLUE_AMETHYST_LAMP = registerBlockWithItem("light_blue_amethyst_lamp", new AmethystLampBlock(AbstractBlock.Settings.copy(Blocks.AMETHYST_CLUSTER).nonOpaque().ticksRandomly().sounds(BlockSoundGroup.AMETHYST_CLUSTER).strength(1.5f).luminance((state) -> {return 14;}), ModParticles.LIGHT_BLUE_AMETHYST_BLOOM));
    public static final Block CYAN_AMETHYST_LAMP = registerBlockWithItem("cyan_amethyst_lamp", new AmethystLampBlock(AbstractBlock.Settings.copy(Blocks.AMETHYST_CLUSTER).nonOpaque().ticksRandomly().sounds(BlockSoundGroup.AMETHYST_CLUSTER).strength(1.5f).luminance((state) -> {return 14;}), ModParticles.CYAN_AMETHYST_BLOOM));
    public static final Block GREEN_AMETHYST_LAMP = registerBlockWithItem("green_amethyst_lamp", new AmethystLampBlock(AbstractBlock.Settings.copy(Blocks.AMETHYST_CLUSTER).nonOpaque().ticksRandomly().sounds(BlockSoundGroup.AMETHYST_CLUSTER).strength(1.5f).luminance((state) -> {return 14;}), ModParticles.GREEN_AMETHYST_BLOOM));
    public static final Block LIME_AMETHYST_LAMP = registerBlockWithItem("lime_amethyst_lamp", new AmethystLampBlock(AbstractBlock.Settings.copy(Blocks.AMETHYST_CLUSTER).nonOpaque().ticksRandomly().sounds(BlockSoundGroup.AMETHYST_CLUSTER).strength(1.5f).luminance((state) -> {return 14;}), ModParticles.LIME_AMETHYST_BLOOM));

    /* ReTextured Amethysts */

    public static final Block WHITE_AMETHYST_CLUSTER = registerBlockWithItem("white_amethyst_cluster", new net.minecraft.block.AmethystBlock(AbstractBlock.Settings.copy(Blocks.AMETHYST_BLOCK).strength(1.5f).requiresTool()));
    public static final Block ORANGE_AMETHYST_CLUSTER = registerBlockWithItem("orange_amethyst_cluster", new net.minecraft.block.AmethystBlock(AbstractBlock.Settings.copy(Blocks.AMETHYST_BLOCK).strength(1.5f).requiresTool()));
    public static final Block MAGENTA_AMETHYST_CLUSTER = registerBlockWithItem("magenta_amethyst_cluster", new net.minecraft.block.AmethystBlock(AbstractBlock.Settings.copy(Blocks.AMETHYST_BLOCK).strength(1.5f).requiresTool()));
    public static final Block LIGHT_BLUE_AMETHYST_CLUSTER = registerBlockWithItem("light_blue_amethyst_cluster", new net.minecraft.block.AmethystBlock(AbstractBlock.Settings.copy(Blocks.AMETHYST_BLOCK).strength(1.5f).requiresTool()));
    public static final Block YELLOW_AMETHYST_CLUSTER = registerBlockWithItem("yellow_amethyst_cluster", new net.minecraft.block.AmethystBlock(AbstractBlock.Settings.copy(Blocks.AMETHYST_BLOCK).strength(1.5f).requiresTool()));
    public static final Block LIME_AMETHYST_CLUSTER = registerBlockWithItem("lime_amethyst_cluster", new net.minecraft.block.AmethystBlock(AbstractBlock.Settings.copy(Blocks.AMETHYST_BLOCK).strength(1.5f).requiresTool()));
    public static final Block PINK_AMETHYST_CLUSTER = registerBlockWithItem("pink_amethyst_cluster", new net.minecraft.block.AmethystBlock(AbstractBlock.Settings.copy(Blocks.AMETHYST_BLOCK).strength(1.5f).requiresTool()));
    public static final Block GRAY_AMETHYST_CLUSTER = registerBlockWithItem("gray_amethyst_cluster", new net.minecraft.block.AmethystBlock(AbstractBlock.Settings.copy(Blocks.AMETHYST_BLOCK).strength(1.5f).requiresTool()));
    public static final Block LIGHT_GRAY_AMETHYST_CLUSTER = registerBlockWithItem("light_gray_amethyst_cluster", new net.minecraft.block.AmethystBlock(AbstractBlock.Settings.copy(Blocks.AMETHYST_BLOCK).strength(1.5f).requiresTool()));
    public static final Block CYAN_AMETHYST_CLUSTER = registerBlockWithItem("cyan_amethyst_cluster", new net.minecraft.block.AmethystBlock(AbstractBlock.Settings.copy(Blocks.AMETHYST_BLOCK).strength(1.5f).requiresTool()));
    public static final Block BLUE_AMETHYST_CLUSTER = registerBlockWithItem("blue_amethyst_cluster", new net.minecraft.block.AmethystBlock(AbstractBlock.Settings.copy(Blocks.AMETHYST_BLOCK).strength(1.5f).requiresTool()));
    public static final Block BROWN_AMETHYST_CLUSTER = registerBlockWithItem("brown_amethyst_cluster", new net.minecraft.block.AmethystBlock(AbstractBlock.Settings.copy(Blocks.AMETHYST_BLOCK).strength(1.5f).requiresTool()));
    public static final Block GREEN_AMETHYST_CLUSTER = registerBlockWithItem("green_amethyst_cluster", new net.minecraft.block.AmethystBlock(AbstractBlock.Settings.copy(Blocks.AMETHYST_BLOCK).strength(1.5f).requiresTool()));
    public static final Block RED_AMETHYST_CLUSTER = registerBlockWithItem("red_amethyst_cluster", new net.minecraft.block.AmethystBlock(AbstractBlock.Settings.copy(Blocks.AMETHYST_BLOCK).strength(1.5f).requiresTool()));
    public static final Block BLACK_AMETHYST_CLUSTER = registerBlockWithItem("black_amethyst_cluster", new net.minecraft.block.AmethystBlock(AbstractBlock.Settings.copy(Blocks.AMETHYST_BLOCK).strength(1.5f).requiresTool()));

    public static final Block WHITE_BUDDING_AMETHYST = registerBlockWithItem("white_budding_amethyst", new ColoredBuddingAmethyst(AbstractBlock.Settings.copy(Blocks.AMETHYST_BLOCK).ticksRandomly().strength(1.5f).requiresTool()));
    public static final Block ORANGE_BUDDING_AMETHYST = registerBlockWithItem("orange_budding_amethyst", new ColoredBuddingAmethyst(AbstractBlock.Settings.copy(Blocks.AMETHYST_BLOCK).ticksRandomly().strength(1.5f).requiresTool()));
    public static final Block MAGENTA_BUDDING_AMETHYST = registerBlockWithItem("magenta_budding_amethyst", new ColoredBuddingAmethyst(AbstractBlock.Settings.copy(Blocks.AMETHYST_BLOCK).ticksRandomly().strength(1.5f).requiresTool()));
    public static final Block LIGHT_BLUE_BUDDING_AMETHYST = registerBlockWithItem("light_blue_budding_amethyst", new ColoredBuddingAmethyst(AbstractBlock.Settings.copy(Blocks.AMETHYST_BLOCK).ticksRandomly().strength(1.5f).requiresTool()));
    public static final Block YELLOW_BUDDING_AMETHYST = registerBlockWithItem("yellow_budding_amethyst", new ColoredBuddingAmethyst(AbstractBlock.Settings.copy(Blocks.AMETHYST_BLOCK).ticksRandomly().strength(1.5f).requiresTool()));
    public static final Block LIME_BUDDING_AMETHYST = registerBlockWithItem("lime_budding_amethyst", new ColoredBuddingAmethyst(AbstractBlock.Settings.copy(Blocks.AMETHYST_BLOCK).ticksRandomly().strength(1.5f).requiresTool()));
    public static final Block PINK_BUDDING_AMETHYST = registerBlockWithItem("pink_budding_amethyst", new ColoredBuddingAmethyst(AbstractBlock.Settings.copy(Blocks.AMETHYST_BLOCK).ticksRandomly().strength(1.5f).requiresTool()));
    public static final Block GRAY_BUDDING_AMETHYST = registerBlockWithItem("gray_budding_amethyst", new ColoredBuddingAmethyst(AbstractBlock.Settings.copy(Blocks.AMETHYST_BLOCK).ticksRandomly().strength(1.5f).requiresTool()));
    public static final Block LIGHT_GRAY_BUDDING_AMETHYST = registerBlockWithItem("light_gray_budding_amethyst", new ColoredBuddingAmethyst(AbstractBlock.Settings.copy(Blocks.AMETHYST_BLOCK).ticksRandomly().strength(1.5f).requiresTool()));
    public static final Block CYAN_BUDDING_AMETHYST = registerBlockWithItem("cyan_budding_amethyst", new ColoredBuddingAmethyst(AbstractBlock.Settings.copy(Blocks.AMETHYST_BLOCK).ticksRandomly().strength(1.5f).requiresTool()));
    public static final Block BLUE_BUDDING_AMETHYST = registerBlockWithItem("blue_budding_amethyst", new ColoredBuddingAmethyst(AbstractBlock.Settings.copy(Blocks.AMETHYST_BLOCK).ticksRandomly().strength(1.5f).requiresTool()));
    public static final Block BROWN_BUDDING_AMETHYST = registerBlockWithItem("brown_budding_amethyst", new ColoredBuddingAmethyst(AbstractBlock.Settings.copy(Blocks.AMETHYST_BLOCK).ticksRandomly().strength(1.5f).requiresTool()));
    public static final Block GREEN_BUDDING_AMETHYST = registerBlockWithItem("green_budding_amethyst", new ColoredBuddingAmethyst(AbstractBlock.Settings.copy(Blocks.AMETHYST_BLOCK).ticksRandomly().strength(1.5f).requiresTool()));
    public static final Block RED_BUDDING_AMETHYST = registerBlockWithItem("red_budding_amethyst", new ColoredBuddingAmethyst(AbstractBlock.Settings.copy(Blocks.AMETHYST_BLOCK).ticksRandomly().strength(1.5f).requiresTool()));
    public static final Block BLACK_BUDDING_AMETHYST = registerBlockWithItem("black_budding_amethyst", new ColoredBuddingAmethyst(AbstractBlock.Settings.copy(Blocks.AMETHYST_BLOCK).ticksRandomly().strength(1.5f).requiresTool()));

    public static final Block SMALL_WHITE_AMETHYST_BUD = registerBlockWithItem("small_white_amethyst_bud", new AmethystClusterBlock(3, 4, AbstractBlock.Settings.copy(Blocks.AMETHYST_CLUSTER).sounds(BlockSoundGroup.SMALL_AMETHYST_BUD).luminance((state) -> {return 1;})));
    public static final Block SMALL_ORANGE_AMETHYST_BUD = registerBlockWithItem("small_orange_amethyst_bud", new AmethystClusterBlock(3, 4, AbstractBlock.Settings.copy(Blocks.AMETHYST_CLUSTER).sounds(BlockSoundGroup.SMALL_AMETHYST_BUD).luminance((state) -> {return 1;})));
    public static final Block SMALL_MAGENTA_AMETHYST_BUD = registerBlockWithItem("small_magenta_amethyst_bud", new AmethystClusterBlock(3, 4, AbstractBlock.Settings.copy(Blocks.AMETHYST_CLUSTER).sounds(BlockSoundGroup.SMALL_AMETHYST_BUD).luminance((state) -> {return 1;})));
    public static final Block SMALL_LIGHT_BLUE_AMETHYST_BUD = registerBlockWithItem("small_light_blue_amethyst_bud", new AmethystClusterBlock(3, 4, AbstractBlock.Settings.copy(Blocks.AMETHYST_CLUSTER).sounds(BlockSoundGroup.SMALL_AMETHYST_BUD).luminance((state) -> {return 1;})));
    public static final Block SMALL_YELLOW_AMETHYST_BUD = registerBlockWithItem("small_yellow_amethyst_bud", new AmethystClusterBlock(3, 4, AbstractBlock.Settings.copy(Blocks.AMETHYST_CLUSTER).sounds(BlockSoundGroup.SMALL_AMETHYST_BUD).luminance((state) -> {return 1;})));
    public static final Block SMALL_LIME_AMETHYST_BUD = registerBlockWithItem("small_lime_amethyst_bud", new AmethystClusterBlock(3, 4, AbstractBlock.Settings.copy(Blocks.AMETHYST_CLUSTER).sounds(BlockSoundGroup.SMALL_AMETHYST_BUD).luminance((state) -> {return 1;})));
    public static final Block SMALL_PINK_AMETHYST_BUD = registerBlockWithItem("small_pink_amethyst_bud", new AmethystClusterBlock(3, 4, AbstractBlock.Settings.copy(Blocks.AMETHYST_CLUSTER).sounds(BlockSoundGroup.SMALL_AMETHYST_BUD).luminance((state) -> {return 1;})));
    public static final Block SMALL_GRAY_AMETHYST_BUD = registerBlockWithItem("small_gray_amethyst_bud", new AmethystClusterBlock(3, 4, AbstractBlock.Settings.copy(Blocks.AMETHYST_CLUSTER).sounds(BlockSoundGroup.SMALL_AMETHYST_BUD).luminance((state) -> {return 1;})));
    public static final Block SMALL_LIGHT_GRAY_AMETHYST_BUD = registerBlockWithItem("small_light_gray_amethyst_bud", new AmethystClusterBlock(3, 4, AbstractBlock.Settings.copy(Blocks.AMETHYST_CLUSTER).sounds(BlockSoundGroup.SMALL_AMETHYST_BUD).luminance((state) -> {return 1;})));
    public static final Block SMALL_CYAN_AMETHYST_BUD = registerBlockWithItem("small_cyan_amethyst_bud", new AmethystClusterBlock(3, 4, AbstractBlock.Settings.copy(Blocks.AMETHYST_CLUSTER).sounds(BlockSoundGroup.SMALL_AMETHYST_BUD).luminance((state) -> {return 1;})));
    public static final Block SMALL_BLUE_AMETHYST_BUD = registerBlockWithItem("small_blue_amethyst_bud", new AmethystClusterBlock(3, 4, AbstractBlock.Settings.copy(Blocks.AMETHYST_CLUSTER).sounds(BlockSoundGroup.SMALL_AMETHYST_BUD).luminance((state) -> {return 1;})));
    public static final Block SMALL_BROWN_AMETHYST_BUD = registerBlockWithItem("small_brown_amethyst_bud", new AmethystClusterBlock(3, 4, AbstractBlock.Settings.copy(Blocks.AMETHYST_CLUSTER).sounds(BlockSoundGroup.SMALL_AMETHYST_BUD).luminance((state) -> {return 1;})));
    public static final Block SMALL_GREEN_AMETHYST_BUD = registerBlockWithItem("small_green_amethyst_bud", new AmethystClusterBlock(3, 4, AbstractBlock.Settings.copy(Blocks.AMETHYST_CLUSTER).sounds(BlockSoundGroup.SMALL_AMETHYST_BUD).luminance((state) -> {return 1;})));
    public static final Block SMALL_RED_AMETHYST_BUD = registerBlockWithItem("small_red_amethyst_bud", new AmethystClusterBlock(3, 4, AbstractBlock.Settings.copy(Blocks.AMETHYST_CLUSTER).sounds(BlockSoundGroup.SMALL_AMETHYST_BUD).luminance((state) -> {return 1;})));
    public static final Block SMALL_BLACK_AMETHYST_BUD = registerBlockWithItem("small_black_amethyst_bud", new AmethystClusterBlock(3, 4, AbstractBlock.Settings.copy(Blocks.AMETHYST_CLUSTER).sounds(BlockSoundGroup.SMALL_AMETHYST_BUD).luminance((state) -> {return 1;})));

    public static final Block MEDIUM_WHITE_AMETHYST_BUD = registerBlockWithItem("medium_white_amethyst_bud", new AmethystClusterBlock(4, 3, AbstractBlock.Settings.copy(Blocks.AMETHYST_CLUSTER).sounds(BlockSoundGroup.MEDIUM_AMETHYST_BUD).luminance((state) -> {return 3;})));
    public static final Block MEDIUM_ORANGE_AMETHYST_BUD = registerBlockWithItem("medium_orange_amethyst_bud", new AmethystClusterBlock(4, 3, AbstractBlock.Settings.copy(Blocks.AMETHYST_CLUSTER).sounds(BlockSoundGroup.MEDIUM_AMETHYST_BUD).luminance((state) -> {return 3;})));
    public static final Block MEDIUM_MAGENTA_AMETHYST_BUD = registerBlockWithItem("medium_magenta_amethyst_bud", new AmethystClusterBlock(4, 3, AbstractBlock.Settings.copy(Blocks.AMETHYST_CLUSTER).sounds(BlockSoundGroup.MEDIUM_AMETHYST_BUD).luminance((state) -> {return 3;})));
    public static final Block MEDIUM_LIGHT_BLUE_AMETHYST_BUD = registerBlockWithItem("medium_light_blue_amethyst_bud", new AmethystClusterBlock(4, 3, AbstractBlock.Settings.copy(Blocks.AMETHYST_CLUSTER).sounds(BlockSoundGroup.MEDIUM_AMETHYST_BUD).luminance((state) -> {return 3;})));
    public static final Block MEDIUM_YELLOW_AMETHYST_BUD = registerBlockWithItem("medium_yellow_amethyst_bud", new AmethystClusterBlock(4, 3, AbstractBlock.Settings.copy(Blocks.AMETHYST_CLUSTER).sounds(BlockSoundGroup.MEDIUM_AMETHYST_BUD).luminance((state) -> {return 3;})));
    public static final Block MEDIUM_LIME_AMETHYST_BUD = registerBlockWithItem("medium_lime_amethyst_bud", new AmethystClusterBlock(4, 3, AbstractBlock.Settings.copy(Blocks.AMETHYST_CLUSTER).sounds(BlockSoundGroup.MEDIUM_AMETHYST_BUD).luminance((state) -> {return 3;})));
    public static final Block MEDIUM_PINK_AMETHYST_BUD = registerBlockWithItem("medium_pink_amethyst_bud", new AmethystClusterBlock(4, 3, AbstractBlock.Settings.copy(Blocks.AMETHYST_CLUSTER).sounds(BlockSoundGroup.MEDIUM_AMETHYST_BUD).luminance((state) -> {return 3;})));
    public static final Block MEDIUM_GRAY_AMETHYST_BUD = registerBlockWithItem("medium_gray_amethyst_bud", new AmethystClusterBlock(4, 3, AbstractBlock.Settings.copy(Blocks.AMETHYST_CLUSTER).sounds(BlockSoundGroup.MEDIUM_AMETHYST_BUD).luminance((state) -> {return 3;})));
    public static final Block MEDIUM_LIGHT_GRAY_AMETHYST_BUD = registerBlockWithItem("medium_light_gray_amethyst_bud", new AmethystClusterBlock(4, 3, AbstractBlock.Settings.copy(Blocks.AMETHYST_CLUSTER).sounds(BlockSoundGroup.MEDIUM_AMETHYST_BUD).luminance((state) -> {return 3;})));
    public static final Block MEDIUM_CYAN_AMETHYST_BUD = registerBlockWithItem("medium_cyan_amethyst_bud", new AmethystClusterBlock(4, 3, AbstractBlock.Settings.copy(Blocks.AMETHYST_CLUSTER).sounds(BlockSoundGroup.MEDIUM_AMETHYST_BUD).luminance((state) -> {return 3;})));
    public static final Block MEDIUM_BLUE_AMETHYST_BUD = registerBlockWithItem("medium_blue_amethyst_bud", new AmethystClusterBlock(4, 3, AbstractBlock.Settings.copy(Blocks.AMETHYST_CLUSTER).sounds(BlockSoundGroup.MEDIUM_AMETHYST_BUD).luminance((state) -> {return 3;})));
    public static final Block MEDIUM_BROWN_AMETHYST_BUD = registerBlockWithItem("medium_brown_amethyst_bud", new AmethystClusterBlock(4, 3, AbstractBlock.Settings.copy(Blocks.AMETHYST_CLUSTER).sounds(BlockSoundGroup.MEDIUM_AMETHYST_BUD).luminance((state) -> {return 3;})));
    public static final Block MEDIUM_GREEN_AMETHYST_BUD = registerBlockWithItem("medium_green_amethyst_bud", new AmethystClusterBlock(4, 3, AbstractBlock.Settings.copy(Blocks.AMETHYST_CLUSTER).sounds(BlockSoundGroup.MEDIUM_AMETHYST_BUD).luminance((state) -> {return 3;})));
    public static final Block MEDIUM_RED_AMETHYST_BUD = registerBlockWithItem("medium_red_amethyst_bud", new AmethystClusterBlock(4, 3, AbstractBlock.Settings.copy(Blocks.AMETHYST_CLUSTER).sounds(BlockSoundGroup.MEDIUM_AMETHYST_BUD).luminance((state) -> {return 3;})));
    public static final Block MEDIUM_BLACK_AMETHYST_BUD = registerBlockWithItem("medium_black_amethyst_bud", new AmethystClusterBlock(4, 3, AbstractBlock.Settings.copy(Blocks.AMETHYST_CLUSTER).sounds(BlockSoundGroup.MEDIUM_AMETHYST_BUD).luminance((state) -> {return 3;})));

    public static final Block LARGE_WHITE_AMETHYST_BUD = registerBlockWithItem("large_white_amethyst_bud", new AmethystClusterBlock(5, 3, AbstractBlock.Settings.copy(Blocks.AMETHYST_CLUSTER).sounds(BlockSoundGroup.LARGE_AMETHYST_BUD).luminance((state) -> {return 4;})));
    public static final Block LARGE_ORANGE_AMETHYST_BUD = registerBlockWithItem("large_orange_amethyst_bud", new AmethystClusterBlock(5, 3, AbstractBlock.Settings.copy(Blocks.AMETHYST_CLUSTER).sounds(BlockSoundGroup.LARGE_AMETHYST_BUD).luminance((state) -> {return 4;})));
    public static final Block LARGE_MAGENTA_AMETHYST_BUD = registerBlockWithItem("large_magenta_amethyst_bud", new AmethystClusterBlock(5, 3, AbstractBlock.Settings.copy(Blocks.AMETHYST_CLUSTER).sounds(BlockSoundGroup.LARGE_AMETHYST_BUD).luminance((state) -> {return 4;})));
    public static final Block LARGE_LIGHT_BLUE_AMETHYST_BUD = registerBlockWithItem("large_light_blue_amethyst_bud", new AmethystClusterBlock(5, 3, AbstractBlock.Settings.copy(Blocks.AMETHYST_CLUSTER).sounds(BlockSoundGroup.LARGE_AMETHYST_BUD).luminance((state) -> {return 4;})));
    public static final Block LARGE_YELLOW_AMETHYST_BUD = registerBlockWithItem("large_yellow_amethyst_bud", new AmethystClusterBlock(5, 3, AbstractBlock.Settings.copy(Blocks.AMETHYST_CLUSTER).sounds(BlockSoundGroup.LARGE_AMETHYST_BUD).luminance((state) -> {return 4;})));
    public static final Block LARGE_LIME_AMETHYST_BUD = registerBlockWithItem("large_lime_amethyst_bud", new AmethystClusterBlock(5, 3, AbstractBlock.Settings.copy(Blocks.AMETHYST_CLUSTER).sounds(BlockSoundGroup.LARGE_AMETHYST_BUD).luminance((state) -> {return 4;})));
    public static final Block LARGE_PINK_AMETHYST_BUD = registerBlockWithItem("large_pink_amethyst_bud", new AmethystClusterBlock(5, 3, AbstractBlock.Settings.copy(Blocks.AMETHYST_CLUSTER).sounds(BlockSoundGroup.LARGE_AMETHYST_BUD).luminance((state) -> {return 4;})));
    public static final Block LARGE_GRAY_AMETHYST_BUD = registerBlockWithItem("large_gray_amethyst_bud", new AmethystClusterBlock(5, 3, AbstractBlock.Settings.copy(Blocks.AMETHYST_CLUSTER).sounds(BlockSoundGroup.LARGE_AMETHYST_BUD).luminance((state) -> {return 4;})));
    public static final Block LARGE_LIGHT_GRAY_AMETHYST_BUD = registerBlockWithItem("large_light_gray_amethyst_bud", new AmethystClusterBlock(5, 3, AbstractBlock.Settings.copy(Blocks.AMETHYST_CLUSTER).sounds(BlockSoundGroup.LARGE_AMETHYST_BUD).luminance((state) -> {return 4;})));
    public static final Block LARGE_CYAN_AMETHYST_BUD = registerBlockWithItem("large_cyan_amethyst_bud", new AmethystClusterBlock(5, 3, AbstractBlock.Settings.copy(Blocks.AMETHYST_CLUSTER).sounds(BlockSoundGroup.LARGE_AMETHYST_BUD).luminance((state) -> {return 4;})));
    public static final Block LARGE_BLUE_AMETHYST_BUD = registerBlockWithItem("large_blue_amethyst_bud", new AmethystClusterBlock(5, 3, AbstractBlock.Settings.copy(Blocks.AMETHYST_CLUSTER).sounds(BlockSoundGroup.LARGE_AMETHYST_BUD).luminance((state) -> {return 4;})));
    public static final Block LARGE_BROWN_AMETHYST_BUD = registerBlockWithItem("large_brown_amethyst_bud", new AmethystClusterBlock(5, 3, AbstractBlock.Settings.copy(Blocks.AMETHYST_CLUSTER).sounds(BlockSoundGroup.LARGE_AMETHYST_BUD).luminance((state) -> {return 4;})));
    public static final Block LARGE_GREEN_AMETHYST_BUD = registerBlockWithItem("large_green_amethyst_bud", new AmethystClusterBlock(5, 3, AbstractBlock.Settings.copy(Blocks.AMETHYST_CLUSTER).sounds(BlockSoundGroup.LARGE_AMETHYST_BUD).luminance((state) -> {return 4;})));
    public static final Block LARGE_RED_AMETHYST_BUD = registerBlockWithItem("large_red_amethyst_bud", new AmethystClusterBlock(5, 3, AbstractBlock.Settings.copy(Blocks.AMETHYST_CLUSTER).sounds(BlockSoundGroup.LARGE_AMETHYST_BUD).luminance((state) -> {return 4;})));
    public static final Block LARGE_BLACK_AMETHYST_BUD = registerBlockWithItem("large_black_amethyst_bud", new AmethystClusterBlock(5, 3, AbstractBlock.Settings.copy(Blocks.AMETHYST_CLUSTER).sounds(BlockSoundGroup.LARGE_AMETHYST_BUD).luminance((state) -> {return 4;})));

    public static final Block GROWN_WHITE_AMETHYST_BUD = registerBlockWithItem("grown_white_amethyst_bud", new AmethystClusterBlock(5, 3, AbstractBlock.Settings.copy(Blocks.AMETHYST_CLUSTER).nonOpaque().sounds(BlockSoundGroup.AMETHYST_CLUSTER).strength(1.5f).luminance((state) -> 5)));
    public static final Block GROWN_ORANGE_AMETHYST_BUD = registerBlockWithItem("grown_orange_amethyst_bud", new AmethystClusterBlock(5, 3, AbstractBlock.Settings.copy(Blocks.AMETHYST_CLUSTER).nonOpaque().sounds(BlockSoundGroup.AMETHYST_CLUSTER).strength(1.5f).luminance((state) -> {return 5;})));
    public static final Block GROWN_MAGENTA_AMETHYST_BUD = registerBlockWithItem("grown_magenta_amethyst_bud", new AmethystClusterBlock(5, 3, AbstractBlock.Settings.copy(Blocks.AMETHYST_CLUSTER).nonOpaque().sounds(BlockSoundGroup.AMETHYST_CLUSTER).strength(1.5f).luminance((state) -> {return 5;})));
    public static final Block GROWN_LIGHT_BLUE_AMETHYST_BUD = registerBlockWithItem("grown_light_blue_amethyst_bud", new AmethystClusterBlock(5, 3, AbstractBlock.Settings.copy(Blocks.AMETHYST_CLUSTER).nonOpaque().sounds(BlockSoundGroup.AMETHYST_CLUSTER).strength(1.5f).luminance((state) -> {return 5;})));
    public static final Block GROWN_YELLOW_AMETHYST_BUD = registerBlockWithItem("grown_yellow_amethyst_bud", new AmethystClusterBlock(5, 3, AbstractBlock.Settings.copy(Blocks.AMETHYST_CLUSTER).nonOpaque().sounds(BlockSoundGroup.AMETHYST_CLUSTER).strength(1.5f).luminance((state) -> {return 5;})));
    public static final Block GROWN_LIME_AMETHYST_BUD = registerBlockWithItem("grown_lime_amethyst_bud", new AmethystClusterBlock(5, 3, AbstractBlock.Settings.copy(Blocks.AMETHYST_CLUSTER).nonOpaque().sounds(BlockSoundGroup.AMETHYST_CLUSTER).strength(1.5f).luminance((state) -> {return 5;})));
    public static final Block GROWN_PINK_AMETHYST_BUD = registerBlockWithItem("grown_pink_amethyst_bud", new AmethystClusterBlock(5, 3, AbstractBlock.Settings.copy(Blocks.AMETHYST_CLUSTER).nonOpaque().sounds(BlockSoundGroup.AMETHYST_CLUSTER).strength(1.5f).luminance((state) -> {return 5;})));
    public static final Block GROWN_GRAY_AMETHYST_BUD = registerBlockWithItem("grown_gray_amethyst_bud", new AmethystClusterBlock(5, 3, AbstractBlock.Settings.copy(Blocks.AMETHYST_CLUSTER).nonOpaque().sounds(BlockSoundGroup.AMETHYST_CLUSTER).strength(1.5f).luminance((state) -> {return 5;})));
    public static final Block GROWN_LIGHT_GRAY_AMETHYST_BUD = registerBlockWithItem("grown_light_gray_amethyst_bud", new AmethystClusterBlock(5, 3, AbstractBlock.Settings.copy(Blocks.AMETHYST_CLUSTER).nonOpaque().sounds(BlockSoundGroup.AMETHYST_CLUSTER).strength(1.5f).luminance((state) -> {return 5;})));
    public static final Block GROWN_CYAN_AMETHYST_BUD = registerBlockWithItem("grown_cyan_amethyst_bud", new AmethystClusterBlock(5, 3, AbstractBlock.Settings.copy(Blocks.AMETHYST_CLUSTER).nonOpaque().sounds(BlockSoundGroup.AMETHYST_CLUSTER).strength(1.5f).luminance((state) -> {return 5;})));
    public static final Block GROWN_BLUE_AMETHYST_BUD = registerBlockWithItem("grown_blue_amethyst_bud", new AmethystClusterBlock(5, 3, AbstractBlock.Settings.copy(Blocks.AMETHYST_CLUSTER).nonOpaque().sounds(BlockSoundGroup.AMETHYST_CLUSTER).strength(1.5f).luminance((state) -> {return 5;})));
    public static final Block GROWN_BROWN_AMETHYST_BUD = registerBlockWithItem("grown_brown_amethyst_bud", new AmethystClusterBlock(5, 3, AbstractBlock.Settings.copy(Blocks.AMETHYST_CLUSTER).nonOpaque().sounds(BlockSoundGroup.AMETHYST_CLUSTER).strength(1.5f).luminance((state) -> {return 5;})));
    public static final Block GROWN_GREEN_AMETHYST_BUD = registerBlockWithItem("grown_green_amethyst_bud", new AmethystClusterBlock(5, 3, AbstractBlock.Settings.copy(Blocks.AMETHYST_CLUSTER).nonOpaque().sounds(BlockSoundGroup.AMETHYST_CLUSTER).strength(1.5f).luminance((state) -> {return 5;})));
    public static final Block GROWN_RED_AMETHYST_BUD = registerBlockWithItem("grown_red_amethyst_bud", new AmethystClusterBlock(5, 3, AbstractBlock.Settings.copy(Blocks.AMETHYST_CLUSTER).nonOpaque().sounds(BlockSoundGroup.AMETHYST_CLUSTER).strength(1.5f).luminance((state) -> {return 5;})));
    public static final Block GROWN_BLACK_AMETHYST_BUD = registerBlockWithItem("grown_black_amethyst_bud", new AmethystClusterBlock(5, 3, AbstractBlock.Settings.copy(Blocks.AMETHYST_CLUSTER).nonOpaque().sounds(BlockSoundGroup.AMETHYST_CLUSTER).strength(1.5f).luminance((state) -> {return 5;})));

    public static final Block RED_TINTED_GLASS = registerBlockWithItem("red_tinted_glass", new TintedGlassBlock(AbstractBlock.Settings.copy(TINTED_GLASS).mapColor(MapColor.GRAY).nonOpaque().allowsSpawning(ModBlocks::never).solidBlock(ModBlocks::never).suffocates(ModBlocks::never).blockVision(ModBlocks::never)));
    public static final Block ORANGE_TINTED_GLASS = registerBlockWithItem("orange_tinted_glass", new TintedGlassBlock(AbstractBlock.Settings.copy(TINTED_GLASS).mapColor(MapColor.GRAY).nonOpaque().allowsSpawning(ModBlocks::never).solidBlock(ModBlocks::never).suffocates(ModBlocks::never).blockVision(ModBlocks::never)));
    public static final Block YELLOW_TINTED_GLASS = registerBlockWithItem("yellow_tinted_glass", new TintedGlassBlock(AbstractBlock.Settings.copy(TINTED_GLASS).mapColor(MapColor.GRAY).nonOpaque().allowsSpawning(ModBlocks::never).solidBlock(ModBlocks::never).suffocates(ModBlocks::never).blockVision(ModBlocks::never)));
    public static final Block BROWN_TINTED_GLASS = registerBlockWithItem("brown_tinted_glass", new TintedGlassBlock(AbstractBlock.Settings.copy(TINTED_GLASS).mapColor(MapColor.GRAY).nonOpaque().allowsSpawning(ModBlocks::never).solidBlock(ModBlocks::never).suffocates(ModBlocks::never).blockVision(ModBlocks::never)));
    public static final Block GREEN_TINTED_GLASS = registerBlockWithItem("green_tinted_glass", new TintedGlassBlock(AbstractBlock.Settings.copy(TINTED_GLASS).mapColor(MapColor.GRAY).nonOpaque().allowsSpawning(ModBlocks::never).solidBlock(ModBlocks::never).suffocates(ModBlocks::never).blockVision(ModBlocks::never)));
    public static final Block LIME_TINTED_GLASS = registerBlockWithItem("lime_tinted_glass", new TintedGlassBlock(AbstractBlock.Settings.copy(TINTED_GLASS).mapColor(MapColor.GRAY).nonOpaque().allowsSpawning(ModBlocks::never).solidBlock(ModBlocks::never).suffocates(ModBlocks::never).blockVision(ModBlocks::never)));
    public static final Block BLUE_TINTED_GLASS = registerBlockWithItem("blue_tinted_glass", new TintedGlassBlock(AbstractBlock.Settings.copy(TINTED_GLASS).mapColor(MapColor.GRAY).nonOpaque().allowsSpawning(ModBlocks::never).solidBlock(ModBlocks::never).suffocates(ModBlocks::never).blockVision(ModBlocks::never)));
    public static final Block LIGHT_BLUE_TINTED_GLASS = registerBlockWithItem("light_blue_tinted_glass", new TintedGlassBlock(AbstractBlock.Settings.copy(TINTED_GLASS).mapColor(MapColor.GRAY).nonOpaque().allowsSpawning(ModBlocks::never).solidBlock(ModBlocks::never).suffocates(ModBlocks::never).blockVision(ModBlocks::never)));
    public static final Block CYAN_TINTED_GLASS = registerBlockWithItem("cyan_tinted_glass", new TintedGlassBlock(AbstractBlock.Settings.copy(TINTED_GLASS).mapColor(MapColor.GRAY).nonOpaque().allowsSpawning(ModBlocks::never).solidBlock(ModBlocks::never).suffocates(ModBlocks::never).blockVision(ModBlocks::never)));
    public static final Block WHITE_TINTED_GLASS = registerBlockWithItem("white_tinted_glass", new TintedGlassBlock(AbstractBlock.Settings.copy(TINTED_GLASS).mapColor(MapColor.GRAY).nonOpaque().allowsSpawning(ModBlocks::never).solidBlock(ModBlocks::never).suffocates(ModBlocks::never).blockVision(ModBlocks::never)));
    public static final Block LIGHT_GRAY_TINTED_GLASS = registerBlockWithItem("light_gray_tinted_glass", new TintedGlassBlock(AbstractBlock.Settings.copy(TINTED_GLASS).mapColor(MapColor.GRAY).nonOpaque().allowsSpawning(ModBlocks::never).solidBlock(ModBlocks::never).suffocates(ModBlocks::never).blockVision(ModBlocks::never)));
    public static final Block GRAY_TINTED_GLASS = registerBlockWithItem("gray_tinted_glass", new TintedGlassBlock(AbstractBlock.Settings.copy(TINTED_GLASS).mapColor(MapColor.GRAY).nonOpaque().allowsSpawning(ModBlocks::never).solidBlock(ModBlocks::never).suffocates(ModBlocks::never).blockVision(ModBlocks::never)));
    public static final Block BLACK_TINTED_GLASS = registerBlockWithItem("black_tinted_glass", new TintedGlassBlock(AbstractBlock.Settings.copy(TINTED_GLASS).mapColor(MapColor.GRAY).nonOpaque().allowsSpawning(ModBlocks::never).solidBlock(ModBlocks::never).suffocates(ModBlocks::never).blockVision(ModBlocks::never)));
    public static final Block MAGENTA_TINTED_GLASS = registerBlockWithItem("magenta_tinted_glass", new TintedGlassBlock(AbstractBlock.Settings.copy(TINTED_GLASS).mapColor(MapColor.GRAY).nonOpaque().allowsSpawning(ModBlocks::never).solidBlock(ModBlocks::never).suffocates(ModBlocks::never).blockVision(ModBlocks::never)));
    public static final Block PINK_TINTED_GLASS = registerBlockWithItem("pink_tinted_glass", new TintedGlassBlock(AbstractBlock.Settings.copy(TINTED_GLASS).mapColor(MapColor.GRAY).nonOpaque().allowsSpawning(ModBlocks::never).solidBlock(ModBlocks::never).suffocates(ModBlocks::never).blockVision(ModBlocks::never)));

    /* Colored Cauldrons */

    public static final Block RED_WATER_CAULDRON = registerBlock( "red_water_cauldron", new ColoredWaterCauldron(AbstractBlock.Settings.copy(CAULDRON), ColoredWaterCauldron.RAIN_PREDICATE, null, ColoredCauldronBehavior.COLORED_CAULDRON_BEHAVIOR));
    public static final Block YELLOW_WATER_CAULDRON = registerBlock( "yellow_water_cauldron", new ColoredWaterCauldron(AbstractBlock.Settings.copy(CAULDRON), ColoredWaterCauldron.RAIN_PREDICATE, null, ColoredCauldronBehavior.COLORED_CAULDRON_BEHAVIOR));
    public static final Block GREEN_WATER_CAULDRON = registerBlock( "green_water_cauldron", new ColoredWaterCauldron(AbstractBlock.Settings.copy(CAULDRON), ColoredWaterCauldron.RAIN_PREDICATE, null, ColoredCauldronBehavior.COLORED_CAULDRON_BEHAVIOR));
    public static final Block LIME_WATER_CAULDRON = registerBlock( "lime_water_cauldron", new ColoredWaterCauldron(AbstractBlock.Settings.copy(CAULDRON), ColoredWaterCauldron.RAIN_PREDICATE, null, ColoredCauldronBehavior.COLORED_CAULDRON_BEHAVIOR));
    public static final Block ORANGE_WATER_CAULDRON = registerBlock( "orange_water_cauldron", new ColoredWaterCauldron(AbstractBlock.Settings.copy(CAULDRON), ColoredWaterCauldron.RAIN_PREDICATE, null, ColoredCauldronBehavior.COLORED_CAULDRON_BEHAVIOR));
    public static final Block WHITE_WATER_CAULDRON = registerBlock( "white_water_cauldron", new ColoredWaterCauldron(AbstractBlock.Settings.copy(CAULDRON), ColoredWaterCauldron.RAIN_PREDICATE, null, ColoredCauldronBehavior.COLORED_CAULDRON_BEHAVIOR));
    public static final Block BROWN_WATER_CAULDRON = registerBlock( "brown_water_cauldron", new ColoredWaterCauldron(AbstractBlock.Settings.copy(CAULDRON), ColoredWaterCauldron.RAIN_PREDICATE, null, ColoredCauldronBehavior.COLORED_CAULDRON_BEHAVIOR));
    public static final Block LIGHT_BLUE_WATER_CAULDRON = registerBlock( "light_blue_water_cauldron", new ColoredWaterCauldron(AbstractBlock.Settings.copy(CAULDRON), ColoredWaterCauldron.RAIN_PREDICATE, null, ColoredCauldronBehavior.COLORED_CAULDRON_BEHAVIOR));
    public static final Block BLUE_WATER_CAULDRON = registerBlock( "blue_water_cauldron", new ColoredWaterCauldron(AbstractBlock.Settings.copy(CAULDRON), ColoredWaterCauldron.RAIN_PREDICATE, null, ColoredCauldronBehavior.COLORED_CAULDRON_BEHAVIOR));
    public static final Block CYAN_WATER_CAULDRON = registerBlock( "cyan_water_cauldron", new ColoredWaterCauldron(AbstractBlock.Settings.copy(CAULDRON), ColoredWaterCauldron.RAIN_PREDICATE, null, ColoredCauldronBehavior.COLORED_CAULDRON_BEHAVIOR));
    public static final Block PINK_WATER_CAULDRON = registerBlock( "pink_water_cauldron", new ColoredWaterCauldron(AbstractBlock.Settings.copy(CAULDRON), ColoredWaterCauldron.RAIN_PREDICATE, null, ColoredCauldronBehavior.COLORED_CAULDRON_BEHAVIOR));
    public static final Block MAGENTA_WATER_CAULDRON = registerBlock( "magenta_water_cauldron", new ColoredWaterCauldron(AbstractBlock.Settings.copy(CAULDRON), ColoredWaterCauldron.RAIN_PREDICATE, null, ColoredCauldronBehavior.COLORED_CAULDRON_BEHAVIOR));
    public static final Block PURPLE_WATER_CAULDRON = registerBlock( "purple_water_cauldron", new ColoredWaterCauldron(AbstractBlock.Settings.copy(CAULDRON), ColoredWaterCauldron.RAIN_PREDICATE, null, ColoredCauldronBehavior.COLORED_CAULDRON_BEHAVIOR));
    public static final Block LIGHT_GRAY_WATER_CAULDRON = registerBlock( "light_gray_water_cauldron", new ColoredWaterCauldron(AbstractBlock.Settings.copy(CAULDRON), ColoredWaterCauldron.RAIN_PREDICATE, null, ColoredCauldronBehavior.COLORED_CAULDRON_BEHAVIOR));
    public static final Block GRAY_WATER_CAULDRON = registerBlock( "gray_water_cauldron", new ColoredWaterCauldron(AbstractBlock.Settings.copy(CAULDRON), ColoredWaterCauldron.RAIN_PREDICATE, null, ColoredCauldronBehavior.COLORED_CAULDRON_BEHAVIOR));
    public static final Block BLACK_WATER_CAULDRON = registerBlock( "black_water_cauldron", new ColoredWaterCauldron(AbstractBlock.Settings.copy(CAULDRON), ColoredWaterCauldron.RAIN_PREDICATE, null, ColoredCauldronBehavior.COLORED_CAULDRON_BEHAVIOR));



    private static Boolean never(BlockState state, BlockView world, BlockPos pos, EntityType<?> type) {
        return false;
    }

    private static boolean never(BlockState state, BlockView world, BlockPos pos) {
        return false;
    }

    private static Block registerBlock(String name, Block block) {
        return Registry.register(Registries.BLOCK, new Identifier(AmethystAdditions.MOD_ID, name), block);
    }

    private static Block registerBlockWithItem(String name, Block block) {
        registerBlockItem(name, block);
        return Registry.register(Registries.BLOCK, new Identifier(AmethystAdditions.MOD_ID, name), block);
    }

    private static Item registerBlockItem(String name, Block block) {
        Item item = Registry.register(Registries.ITEM, new Identifier(AmethystAdditions.MOD_ID, name), new BlockItem(block, new Item.Settings()));

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.COLORED_BLOCKS).register(entries -> entries.add(item));
        return item;
    }

    public static void registerModBlocks() {
        AmethystAdditions.LOGGER.info("Registering ModBlocks for " + AmethystAdditions.MOD_ID);
    }
    
}
