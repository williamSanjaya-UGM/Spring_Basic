package com.annotationBaseConf;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Samsung2 {

    @Autowired
    @Qualifier("mediatek")
    MobileProcessor2 cpu;

    public void config(){
        System.out.println("Octa core, 4gb ram");
        cpu.process();
    }

    public MobileProcessor2 getCpu() {
        return cpu;
    }

    public void setCpu(MobileProcessor2 cpu) {
        this.cpu = cpu;
    }
}
