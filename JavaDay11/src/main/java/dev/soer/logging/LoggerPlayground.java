package dev.soer.logging;

public class LoggerPlayground {

	public static void main(String[] args) {
		AppLogger.logger.info("Program Started.");
		
		int num;
		AppLogger.logger.warn("Variable 'num' is not used.");
		
		logInfo("Info Level");
		
	}
	
	public static void logInfo(String message) {
		AppLogger.logger.info(message);
	}
}
