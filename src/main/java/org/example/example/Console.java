package org.example.example;

import org.apache.log4j.*;
import org.apache.log4j.xml.XMLLayout;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.IOException;

public class Console
{

  //step3 3.create slf4j logger object
   private static Logger Log = LoggerFactory.getLogger(Console.class);
    public static void main(String[] args)throws IOException {
       //Step 1. Create layout
     // Layout lay = new HTMLLayout();
    Layout lay = new SimpleLayout();
 // Layout lay = new XMLLayout();
      //  Layout lay = new PatternLayout("%p %d %c %M %m %n");
      // %p= Priority method ||%d= date & time ||%c= class name
        //%M= method name|| %m=message|| %n= nextline

        //Step 2. Create Appender + link layout
     Appender app = new ConsoleAppender(lay);
       // Appender app = new FileAppender(lay,"E:/Mylogs/data.log");

        //step 4. Link appender with logger
         //Print messages
        Log.trace("From Trace");
        Log.debug("From Debug");
        Log.info("From info");
        Log.warn("From Warn");
        Log.error("From Error");
   //  Log.fatal("From Fatal");
    }
}
