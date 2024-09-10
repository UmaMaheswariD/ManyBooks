package com.acc.standardobjects;


import java.io.FileReader;
import java.util.Properties;
import java.util.logging.Logger;

public class PropertyReader {

        private final static Logger LOG = Logger.getLogger("PropertyFilerReader");
        private Properties env;


        public String loadRunConfiguration(String Key) {
            env = new Properties(); String value;
            try {
                FileReader reader = new FileReader("./Config.properties");
                env.load(reader);
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
            value=env.getProperty(Key);
            LOG.info("Value read from Config file "+value);
            return value;
        }

    }
