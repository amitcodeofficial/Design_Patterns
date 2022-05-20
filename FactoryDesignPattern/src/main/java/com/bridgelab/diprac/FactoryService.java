package com.bridgelab.diprac;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class FactoryService {
    private static ApplicationContext context = new ClassPathXmlApplicationContext("ConfigP.xml");
    private Name name;

    public static Services getInstanceS(ServicesEnum services){
        switch(services){
            case AADHAR:
                return context.getBean("servicesA", Services.class);
            case PAN:
                return context.getBean("servicesP", Services.class);
            case DRIVINGLICENSE:
                return context.getBean("servicesD", Services.class);
        }
        return null;
    }

    public static ApplicationContext getInstanceC(){
        return new ClassPathXmlApplicationContext("ConfigP.xml");
    }

    public static Name getInstanNameN(){
        return context.getBean("name", Name.class);
    }
}
