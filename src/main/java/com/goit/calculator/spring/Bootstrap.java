package com.goit.calculator.spring;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Bootstrap {

    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("application-context.xml");
        CalcExecutor calculator = applicationContext.getBean(CalcExecutor.class,"calculator");
        System.out.println(calculator.calculate("2+2"));
    }
}
