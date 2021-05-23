package com.annotationBaseConf;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
//@Primary
public class Mediatek implements MobileProcessor2{
    @Override
    public void process() {
        System.out.println("MediaTek CPU");
    }
}
