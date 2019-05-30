package com.yicj.gen.util;

import java.io.File;
import java.io.IOException;
import java.util.Locale;

import freemarker.template.Configuration;

public class FreemarketConfigUtils {
    private final static String TEMPLATE_PATH = "src/main/resources/template/";
    public final static int TYPE_ENTITY = 0;
    public final static int TYPE_DAO = 1;
    public final static int TYPE_SERVICE = 2;
    public final static int TYPE_CONTROLLER = 3;
    public final static int TYPE_MAPPER = 4;
    private static Configuration configuration;
 
 
    public static synchronized Configuration getInstance() {
        if (null == configuration) {
            configuration = new Configuration(Configuration.VERSION_2_3_23);
            try {
                configuration.setDirectoryForTemplateLoading(new File(TEMPLATE_PATH));
            } catch (IOException e) {
                e.printStackTrace();
            }
            configuration.setEncoding(Locale.CHINA, "utf-8");
        }
        return configuration;
    }
}