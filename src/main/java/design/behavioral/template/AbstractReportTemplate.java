package design.behavioral.template;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public abstract class AbstractReportTemplate {

    protected Logger logger = LoggerFactory.getLogger(getClass());

    public final void doTask(){
        doConnect();
        getReport();
        parseRepot();
    }

    /**
     * 建立连接
     */
    public abstract void doConnect();

    /**
     * 获取报告
     */
    public abstract void getReport();

    /**
     * 解析报告并落库
     */
    public abstract void parseRepot();
}
