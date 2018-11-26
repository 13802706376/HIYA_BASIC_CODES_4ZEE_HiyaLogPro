package com.hiya.ee.log;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Slf4jClient
{

    private static final Logger logger = LoggerFactory.getLogger(Slf4jClient.class);
    String appId = "5555";

    private void outSlf4j()
    {
        logger.error("{} is+serviceid", appId);

    }


}
