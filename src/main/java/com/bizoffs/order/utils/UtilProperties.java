package com.bizoffs.order.utils;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Configuration;
import org.springframework.util.ResourceUtils;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

@Configuration
public class UtilProperties {
   /* @Autowired
    private static Environment env;*/
    private static Logger log     = LoggerFactory.getLogger(UtilProperties.class);

   /* public static String getPropertyValue(String pPropertyKey) {
        return env.getProperty(pPropertyKey);
    }*/
    public static String getPropertyValue(String resource, String name) {
        if (resource.isEmpty()) {
            return "";
        }
        if (name.isEmpty()) {
            return "";
        }



        String value = null;

        try {
            Properties properties = getProperties(resource);
            if (properties == null) {
                return "";
            }
            value = properties.getProperty(name);
        } catch (Exception e) {
            log.info("",e);
        }
        return value == null ? "" : value.trim();
    }

    private static Properties getProperties(String resource) throws IOException {
        Properties properties = new Properties();
        File file = ResourceUtils.getFile("classpath:"+resource);
        InputStream in = new FileInputStream(file);
        properties.load(in);
        return  properties;
    }


}
