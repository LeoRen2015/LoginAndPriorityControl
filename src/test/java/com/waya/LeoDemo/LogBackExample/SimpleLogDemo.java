package com.waya.LeoDemo.LogBackExample;

import ch.qos.logback.classic.Level;
import ch.qos.logback.classic.LoggerContext;
import ch.qos.logback.core.util.StatusPrinter;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Created by user on 2018/2/2.
 */
public class SimpleLogDemo {
    Logger logger = LoggerFactory.getLogger(this.getClass());
    public static void main(String[] args) {
        SimpleLogDemo simpleLogDemo = new SimpleLogDemo();
        simpleLogDemo.logger.error("hello,this is a line of log message from logBack");

//        打印LogBack内部状态信息
//        LoggerContext loggerContext =(LoggerContext)LoggerFactory.getILoggerFactory();
//        StatusPrinter.print(loggerContext);
//        获得root logger
        Logger rootLoger = LoggerFactory.getLogger(Logger.ROOT_LOGGER_NAME);
        System.out.println("");
        ch.qos.logback.classic.Logger loggerLeo = (ch.qos.logback.classic.Logger) LoggerFactory.getLogger("com.waya");
        ch.qos.logback.classic.Logger loggerLeo1 = (ch.qos.logback.classic.Logger) LoggerFactory.getLogger("com.waya.log");

        int a = 4;
        String sombody ="aaaa";
        loggerLeo.setLevel(Level.TRACE);
        loggerLeo.debug("this message{} is from {} ",a,simpleLogDemo);
        loggerLeo.info("{} from {}","a","b" );
        loggerLeo.error("error message+++++++++++++++++++++ ");
        loggerLeo.warn("warn message+++++++++++++++++++++ ");
        loggerLeo.info("info message+++++++++++++++++++++ ");
        loggerLeo.debug("debug message+++++++++++++++++++++ ");
        loggerLeo.trace("trace message+++++++++++++++++++++ ");

    }
}
