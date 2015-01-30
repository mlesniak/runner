package com.mlesniak.runner;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Parent class of applications.
 *
 * @author Michael Lesniak (mlesniak@micromata.de)
 */
public class BaseRunner {
    private static Logger LOG = LoggerFactory.getLogger(BaseRunner.class);

    public void info(String msg, String ... args) {
        LOG.info(msg, args);
    }
}
