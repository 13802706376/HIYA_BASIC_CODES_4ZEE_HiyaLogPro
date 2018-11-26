package com.hiya.ee.log;

import org.apache.log4j.Logger;

public class Log4jClient
{
    Logger log4j=Logger.getRootLogger();
    
    public  void outLog4j()
    {
        String out = "444444";
        log4j.debug (out) ;
        log4j.info(out) ;
        log4j.warn(out) ;
        log4j.error(out) ;
    }

}
