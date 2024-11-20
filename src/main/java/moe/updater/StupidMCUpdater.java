package moe.updater;

import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class StupidMCUpdater implements ModInitializer {
	public static final String MOD_ID = "stupidmc-updater";

	// This logger is used to write text to the console and the log file.
	// It is considered best practice to use your mod id as the logger's name.
	// That way, it's clear which mod wrote info, warnings, and errors.
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		// This code runs as soon as Minecraft is in a mod-load-ready state.
		// However, some things (like resources) may still be uninitialized.
		// Proceed with mild caution.

		LOGGER.info("欢迎使用沙雕翻译包附加模组！\n本模组还在开发中，可能会有很多奇奇怪怪的问题，请见谅 \n或者帮助我们一同完成！");
	}
}