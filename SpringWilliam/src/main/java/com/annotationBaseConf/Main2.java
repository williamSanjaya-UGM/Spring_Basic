package com.annotationBaseConf;

import com.william2.AppConfig;
import com.william2.Samsung;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main2 {
    public static void main(String[] args) {
        ApplicationContext context=new AnnotationConfigApplicationContext(AppConfig2.class);
        Samsung2 s7=context.getBean(Samsung2.class);
        s7.config();
    }
}
