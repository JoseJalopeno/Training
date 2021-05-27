package dev.soer.logging;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class AppLogger {

	// create a public static final Logger Object - single logger object to use throughout entire program
	public static final Logger logger = LogManager.getLogger(AppLogger.class);
}
