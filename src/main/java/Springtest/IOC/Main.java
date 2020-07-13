package Springtest.IOC;

import Springtest.IOC.entities.Person;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    
    public static void main(String[] args) {
        ApplicationContext act = new ClassPathXmlApplicationContext("applicationContext.xml");
        Person p = (Person) act.getBean("person");
        System.out.println(p);
    }

}
