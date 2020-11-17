package hm;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;
import org.apache.log4j.xml.DOMConfigurator;

import prastice.CustomLoggeredFile;

public class Application {

	public static void main(String[] args) {
		Basiclogger();
		logWithDOMConfiguration();
	}

	static Logger logger = Logger.getLogger(CustomLoggeredFile.class);
	
	public static void Basiclogger() {
		BasicConfigurator.configure();
		logger.trace("Trace logger message");
		logger.debug("Debug logger message");
		logger.info("Info logger message");
		logger.warn("Warn logger message");
		logger.error("Error logger message");
		logger.fatal("Fatal logger message");
	}
	
	public static void logWithDOMConfiguration() {
		DOMConfigurator.configure("MyLoggerConfig.xml");
		logger.trace("Trace logger message");
		logger.debug("Debug logger message");
		logger.info("Info logger message");
		logger.warn("Warn logger message");
		logger.error("Error logger message");
		logger.fatal("Fatal logger message");
	}
	
}
