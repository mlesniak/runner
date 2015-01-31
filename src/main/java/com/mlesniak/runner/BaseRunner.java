package com.mlesniak.runner;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static com.mlesniak.runner.ConfigurationTool.*;

/**
 * Parent class of applications.
 *
 * @author Michael Lesniak (mlesniak@micromata.de)
 */
public class BaseRunner {
    private static Logger LOG = LoggerFactory.getLogger(BaseRunner.class);

    public static void initRunner(Class<? extends RunnerConfiguration> clazz, String name, String[] args) throws Exception {
        parse(clazz, name, args);
    }

    public void info(String msg, String ... args) {
        LOG.info(msg, args);
    }
}
