package com.springinaction.pkg.springidol;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by ilya on 14.03.15.
 */
public class App {
    public static void main(String[] args) throws PerformanceException{
        ApplicationContext context = new ClassPathXmlApplicationContext("Scene.xml");

        Performer performer = (Performer) context.getBean("harry");
        performer.perform();
    }
}
