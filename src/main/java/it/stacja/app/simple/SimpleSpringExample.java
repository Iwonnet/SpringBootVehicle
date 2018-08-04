package it.stacja.app.simple;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class SimpleSpringExample {


    public static void main(String[] args) {


        ApplicationContext ctx = new AnnotationConfigApplicationContext(ApplicationConfiguration.class);

    }

}
