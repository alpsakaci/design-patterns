package com.alpsakaci.designpatterns.chainofresponsibility;

class ChainOfResponsibility {
	
	private static AbstractLogger getChainOfLoggers() {
		
		AbstractLogger errorLogger = new ErrorLogger(AbstractLogger.ERROR);
		AbstractLogger fileLogger = new FileLogger(AbstractLogger.DEBUG);
		AbstractLogger consoleLogger = new ConsoleLogger(AbstractLogger.INFO);
		
		errorLogger.setNextLogger(fileLogger);
		fileLogger.setNextLogger(consoleLogger);
		
		return errorLogger;
	}
	
	public static void main(String[] args) {
		AbstractLogger loggerChain = getChainOfLoggers();
		
		loggerChain.logMessage(AbstractLogger.INFO, "Info");
		loggerChain.logMessage(AbstractLogger.DEBUG, "Debug level info");
		loggerChain.logMessage(AbstractLogger.ERROR, "Error info");
	}
	
}
