package com.annotationBaseConf;

import org.springframework.stereotype.Component;

@Component
public class SnapDragon2 implements MobileProcessor2 {
    @Override
    public void process() {
        System.out.println("SnapDragon2 cpu");
    }
}
