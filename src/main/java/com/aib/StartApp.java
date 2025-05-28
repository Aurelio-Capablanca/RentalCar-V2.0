package com.aib;


import com.aib.configuration.BeanManagement;
import com.aib.domain.businessLogic.MockCarLogic;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class StartApp {
    public static void main(String[] args) {
//        System.out.printf("Hello and welcome!");
//
//        for (int i = 1; i <= 5; i++) {
//            System.out.println("i = " + i);
//        }
        var context = new AnnotationConfigApplicationContext(BeanManagement.class);
        var serviceCar = context.getBean(MockCarLogic.class);
        serviceCar.printName("BMW Any CAR!!!");
        context.close();
    }
}