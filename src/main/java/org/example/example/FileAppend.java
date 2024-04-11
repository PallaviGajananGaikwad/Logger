package org.example.example;
import org.apache.log4j.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.IOException;

public class FileAppend
{
    private static Logger Logger = LoggerFactory.getLogger(FileAppend.class);

    public static void main(String[] args) throws IOException {
        Layout lay = new PatternLayout("%d{yyyy-MM-dd HH:mm:ss.SSS} [%thread] %n");
        Appender app= new FileAppender(lay,"E:/FileAppender/my.log");
        Logger.debug("From Debug");
        Logger.info("From Info");
        Logger.warn("From Warn");
        Logger.error("From Error");


    }
}
