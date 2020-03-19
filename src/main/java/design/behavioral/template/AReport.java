package design.behavioral.template;

public class AReport extends AbstractReportTemplate {

    public void doConnect() {
        logger.info("do connect");
    }

    public void getReport() {
        logger.info("get report");
    }

    public void parseRepot() {
        logger.info("parseReport");
    }

    public static void main(String[] args){
        AbstractReportTemplate aReport = new AReport();
        aReport.doTask();
    }
}
