package net.mezu.blockmetrics;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.mezu.blockmetrics.data.Models;
import net.mezu.blockmetrics.item.MeasureTapeItem;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class Mod implements ModInitializer {

	// Metadata

	public static final String MOD_ID = "block_metrics";

	// This logger is used to write text to the console and the log file.
	// It is considered best practice to use your mod id as the logger's name.
	// That way, it's clear which mod wrote info, warnings, and errors.
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	// Items

	public static final MeasureTapeItem MEASURE_TAPE_ITEM = new MeasureTapeItem(new FabricItemSettings().maxCount(1));

	// Init

	@Override
	public void onInitialize() {
		// This code runs as soon as Minecraft is in a mod-load-ready state.
		// However, some things (like resources) may still be uninitialized.
		// Proceed with mild caution.

		LOGGER.info("I'm alive!!");

		Registry.register(Registries.ITEM, new Identifier(MOD_ID, "measure_tape"), MEASURE_TAPE_ITEM);

		Models.demo();
	}

}