package com.springinaction.pkg.fourchapter;

import com.springinaction.pkg.springidol.PerformanceException;
import com.springinaction.pkg.springidol.Performer;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by ilya on 17.03.15.
 */
public class App {
    public static void main(String[] args) throws PerformanceException{
        ApplicationContext context = new ClassPathXmlApplicationContext("com/springinaction/pkg/fourchapter/FourChapter.xml");
        Performer performer= (Performer) context.getBean("duke");
        performer.perform();
    }
}
