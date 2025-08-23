package LoggerSystem_ChainOfResponsibility;

public class Main {
    public static void main(String[] args) {
        LogProcessor logObject = new InfoLogProcessor(new DebugLogProcessor(new ErrorLogProcessor(null)));

        logObject.log(LogProcessor.ERROR,"Exception Occured");
        logObject.log(LogProcessor.DEBUG,"Debugging this code");
        logObject.log(LogProcessor.INFO,"Information about code");
    }
}
