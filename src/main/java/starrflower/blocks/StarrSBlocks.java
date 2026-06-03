package starrflower.blocks;

import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import starrflower.blocks.block.ModBlocks;

public class StarrSBlocks implements ModInitializer {
	public static final String MOD_ID = "starrsblocks";

	// This logger is used to write text to the console and the log file.
	// It is considered best practice to use your mod id as the logger's name.
	// That way, it's clear which mod wrote info, warnings, and errors.
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		LOGGER.info("Registering " + StarrSBlocks.MOD_ID);

		ModBlocks.registerModBlocks();

		LOGGER.info("finished registering " + StarrSBlocks.MOD_ID);
	}
}