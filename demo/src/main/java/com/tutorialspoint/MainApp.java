package com.tutorialspoint;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by xb on 2016/3/20.
 */
public class MainApp {
    public static void main(String [] args){
        AbstractApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
        HelloWorld obj = (HelloWorld) context.getBean("helloWorld");
//        obj.setMessage("I'm a object!");
        obj.getMessage();
//        HelloWorld objA = (HelloWorld) context.getBean("helloWorld");
//        objA.getMessage();
        context.registerShutdownHook();
    }
}
