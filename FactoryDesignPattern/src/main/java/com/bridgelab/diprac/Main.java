package com.bridgelab.diprac;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context = FactoryService.getInstanceC();

        Services a = FactoryService.getInstanceS(ServicesEnum.AADHAR);
        a.Card();

        Services p = FactoryService.getInstanceS(ServicesEnum.PAN);
        p.Card();

        Services d = FactoryService.getInstanceS(ServicesEnum.DRIVINGLICENSE);
        d.Card();
    }

}
