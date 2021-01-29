package behavioral.ChainOfResponsibility.chainExample3;

import behavioral.ChainOfResponsibility.chainExample3.loggers.AbstractLogger;
import behavioral.ChainOfResponsibility.chainExample3.loggers.ConsoleLogger;
import behavioral.ChainOfResponsibility.chainExample3.loggers.ErrorLogger;
import behavioral.ChainOfResponsibility.chainExample3.loggers.FileLogger;

public class Run {
    private static AbstractLogger getChainOfLoggers(){
        AbstractLogger errorLogger = new ErrorLogger(AbstractLogger.ERROR);
        AbstractLogger fileLogger = new FileLogger(AbstractLogger.DEBUG);
        AbstractLogger consoleLogger = new ConsoleLogger(AbstractLogger.INFO);

        errorLogger.setNextLogger(fileLogger);
        fileLogger.setNextLogger(consoleLogger);

        return errorLogger;
    }

    public static void main(String[] args){
        AbstractLogger loggerChain = getChainOfLoggers();

        loggerChain.logMessage(AbstractLogger.INFO, "This is an information");
        System.out.println("");
        loggerChain.logMessage(AbstractLogger.DEBUG, "This is an debug level info.");
        System.out.println("");
        loggerChain.logMessage(AbstractLogger.ERROR, "This is an error message.");
    }
}
